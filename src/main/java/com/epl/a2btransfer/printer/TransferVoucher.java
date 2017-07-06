package com.epl.a2btransfer.printer;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.col;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;
import static net.sf.dynamicreports.report.builder.DynamicReports.type;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
 
	
	private StyleBuilder bold12Style;
	private StyleBuilder textStyle;
	
	// Obtiene los datos  de prueba...
	private BookingRs getBookingRs(){
		BookingRs bookingRs = new BookingRs();		 
		bookingRs.setTransferOnly(new BookingRs.TransferOnly());
		bookingRs.getTransferOnly().setBooking(new BookingRs.TransferOnly.Booking());		
		bookingRs.getTransferOnly().getBooking().setConfirm(new BookingRs.TransferOnly.Booking.Confirm());
		BookingRs.TransferOnly.Booking.Confirm  confirm = bookingRs.getTransferOnly().getBooking().getConfirm();
		confirm.setBookingType("TEST BOOKING");
		confirm.setVoucherInfo(new BookingRs.TransferOnly.Booking.Confirm.VoucherInfo());
		confirm.getVoucherInfo().setBookingDate("21/07/2017");
		confirm.getVoucherInfo().setBookingRef("G1010885");
		confirm.getVoucherInfo().setBookingStatus("Confirmed");
		confirm.getVoucherInfo().setDeparturePointCode("PMI");
		confirm.getVoucherInfo().setArrivalPointCode("ARE");
		confirm.getVoucherInfo().setSectorType("IDA-VUELTA");
		confirm.getVoucherInfo().setSupplierName("Jumbo Tours Espana S.L");
		confirm.getVoucherInfo().setOutboundTransferDetails(new BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.OutboundTransferDetails());
		confirm.getVoucherInfo().getOutboundTransferDetails().setArrDate("30/07/2017");
		confirm.getVoucherInfo().getOutboundTransferDetails().setArrTime("10:00");
		confirm.getVoucherInfo().getOutboundTransferDetails().setOutboundOrigin("Palma de Mallorca (PMI)");
		confirm.getVoucherInfo().getOutboundTransferDetails().setOutboundDestination("El Arenal");
		confirm.getVoucherInfo().getOutboundTransferDetails().setVehicle("Traslado Privado (1 -4 personas)");
		confirm.getVoucherInfo().setReturnTransferDetails(new BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.ReturnTransferDetails());
		confirm.getVoucherInfo().getReturnTransferDetails().setRetDate("14/08/2017");
		confirm.getVoucherInfo().getReturnTransferDetails().setRetTime("10:30");
		confirm.getVoucherInfo().getReturnTransferDetails().setReturnOrigin("El Areal");
		confirm.getVoucherInfo().getReturnTransferDetails().setReturnDestination("Palma de Mallorca (PMI)");
		confirm.getVoucherInfo().getReturnTransferDetails().setVehicle("Traslado Privado (1 -4 personas)");		
		confirm.getVoucherInfo().setClient(new BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.Client());
		confirm.getVoucherInfo().getClient().setFirstName("Juanjo");
		confirm.getVoucherInfo().getClient().setLastName("Alejandro");
		confirm.getVoucherInfo().getClient().setTitle("Sr");
		confirm.getVoucherInfo().getClient().setMobile(628629988L);
		confirm.getVoucherInfo().getClient().setPhone(972652489L);
		confirm.getVoucherInfo().setPriceBreakdown(new BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown());
		confirm.getVoucherInfo().getPriceBreakdown().setPriceLine(new BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown.PriceLine());
		confirm.getVoucherInfo().getPriceBreakdown().getPriceLine().setAmount(48.8f);;
		confirm.getVoucherInfo().getPriceBreakdown().getPriceLine().setDescription("1 x Traslado (Ida-Vuelta)");
		confirm.getVoucherInfo().setJoiningIns(new BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.JoiningIns());
		confirm.getVoucherInfo().getJoiningIns().getJoinline().add("");
		try{
			String content = new String(Files.readAllBytes(Paths.get("a2bInfo.txt")));
			confirm.getVoucherInfo().getJoiningIns().getJoinline().add(content);
		}catch(IOException ioex){
			System.out.println(ioex.toString());
		}		
		return bookingRs;
	}
	
	public byte[] build(String locata, Agency agency, BookingRs.TransferOnly transferOnly) throws DRException{
		JasperReportBuilder report = report();
		String nombreAgen = agency.getName();		
		Address direccion = agency.getAddresses().stream().findFirst().get();
		String addressAgen = "---";
		String tlf="---";
		if (direccion!=null){		
			if (direccion.getNombreVia() !=null &&  direccion.getPoblacion()!=null)
				addressAgen = direccion.getNombreVia() + ", " +direccion.getPoblacion();
			tlf = direccion.getTelefono()==null?"--":direccion.getTelefono();		
		}
		textStyle = stl.style().setFontSize(10);
		bold12Style = stl.style(Templates.boldStyle).setFontSize(12);				
		TextColumnBuilder<String> linecol = col.column("Datos adicionales", "line", type.stringType());
		linecol.setStyle(stl.style().setBackgroundColor(new Color(255,255,255)));
		report.setTemplate(Templates.reportTemplate)
				.setPageFormat(PageType.A4, PageOrientation.PORTRAIT)
				.setPageMargin(DynamicReports.margin().setLeft(50).setTop(80).setRight(50).setBottom(30))
				.setTextStyle(textStyle)
				.tableOfContents()
				.columns(linecol)
				.title(
						Templates.createTitleComponent(" ", new PageHeader(locata))
						, new PageAgencyInfo(nombreAgen,  addressAgen, tlf, locata)
						, cmp.text("Bono de servicio de traslado").setStyle(bold12Style).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)						
						, new PageContent(transferOnly)												
						, cmp.verticalGap(30)
						
				).setDataSource(SecondPage.createDataSource())
				.setSummaryOnANewPage(false)				
				.summary(new PickupInfo(getBookingRs()))
				.addPageFooter(new PageFooter());
		 ByteArrayOutputStream memBuffer = new ByteArrayOutputStream();
		 report.toPdf(memBuffer);
		 return memBuffer.toByteArray();		
	}						
		
}