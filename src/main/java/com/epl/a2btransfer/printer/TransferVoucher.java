package com.epl.a2btransfer.printer;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.col;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;
import static net.sf.dynamicreports.report.builder.DynamicReports.type;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

import org.apache.log4j.Logger;
import org.jfree.util.Log;

import com.epl.a2btransfer.dto.Address;
import com.epl.a2btransfer.dto.Agency;
import com.epl.a2btransfer.xto.BookingRs;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.constant.PageOrientation;
import net.sf.dynamicreports.report.constant.PageType;
import net.sf.dynamicreports.report.exception.DRException;

public class TransferVoucher {
 	
	private Logger log = Logger.getLogger(TransferVoucher.class);
	
	private StyleBuilder text8Style;
	private StyleBuilder bold12Style;
	private StyleBuilder textStyle;

	private void saveFile(ByteArrayOutputStream memBuffer, String locata){
		try{
			FileOutputStream fos = new FileOutputStream(locata+".pdf");
			fos.write(memBuffer.toByteArray());
			fos.flush();
			fos.close();
		}catch(Exception ex){
			log.error("No se ha podido guardar el fichero", ex);
		}
	}
	
	public byte[] build(String locata, Agency agency, BookingRs.TransferOnly transferOnly, boolean saveFile) throws DRException{
		
		JasperReportBuilder report = report();
		String customerName = transferOnly.getBooking().getConfirm().getVoucherInfo().getClient().getFirstName()
		+" "+transferOnly.getBooking().getConfirm().getVoucherInfo().getClient().getLastName();
		String nombreAgen = agency.getName();		
		Address direccion = agency.getAddresses().stream().findFirst().get();
		String addressAgen = "---";
		String tlf="---";
		String bookingRef = transferOnly.getBooking().getConfirm().getVoucherInfo().getBookingRef();
		if (direccion!=null){		
			if (direccion.getNombreVia() !=null &&  direccion.getPoblacion()!=null)
				addressAgen = direccion.getNombreVia() + ", " +direccion.getPoblacion();
			tlf = direccion.getTelefono()==null?"--":direccion.getTelefono();		
		}
		text8Style = stl.style().setFontSize(8).setFontName("Arial");
		textStyle = stl.style().setFontSize(10);
		bold12Style = stl.style(Templates.boldStyle).setFontSize(12);				
		TextColumnBuilder<String> linecol = col.column("Datos adicionales", "line", type.stringType());
		linecol.setStyle(stl.style().setBackgroundColor(new Color(255,255,255)));
		Templates.generate(customerName);
		report.setTemplate(Templates.reportTemplate)
				.setPageFormat(PageType.A4, PageOrientation.PORTRAIT)
				.setPageMargin(DynamicReports.margin().setLeft(50).setTop(80).setRight(50).setBottom(30))
				.setTextStyle(textStyle)
				.tableOfContents()
				.columns(linecol)
				.title(
						Templates.createTitleComponent("", new PageHeader(locata))
						, new PageAgencyInfo(nombreAgen,  addressAgen, tlf, bookingRef )
						, cmp.text("Bono de servicio de traslado").setStyle(bold12Style).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)						
						, new PageContent(transferOnly)												
						, cmp.verticalGap(30)
						
				).setDataSource(SecondPage.createDataSource(transferOnly))
				.setDetailStyle(this.text8Style)
				.setSummaryOnANewPage(false)				
				.summary(new PickupInfo(transferOnly))
				.addPageFooter(new PageFooter());
		 ByteArrayOutputStream memBuffer = new ByteArrayOutputStream();		 			
		 report.toPdf(memBuffer);
		 if (saveFile){
			 saveFile(memBuffer, locata);			 
		 }
		 Log.info("Se ha escrito el fichero en memoria");
		 return memBuffer.toByteArray();		
	}						
		
}