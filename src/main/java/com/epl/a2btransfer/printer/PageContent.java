package com.epl.a2btransfer.printer;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;

import java.awt.Color;

import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo;
import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.Client;
import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.OutboundTransferDetails;
import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.ReturnTransferDetails;

import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.builder.component.VerticalListBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;

public class PageContent extends VerticalListBuilder{
		
	private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;
	
	private StyleBuilder bold10Style;
	
	private void init(){		
		bold10Style = stl.style(Templates.boldStyle).setFontSize(10);		
	}
	
	private ComponentBuilder<?,?> addPair(String dir, String key, String value){
		if (dir.equalsIgnoreCase("H")){						
			return cmp.horizontalFlowList()								
							.add(cmp.horizontalGap(10))
							.add(cmp.text(key+": ").setStyle(this.bold10Style).setWidth(30))
					   		.add(cmp.text(value));
					
		} else if (dir.equalsIgnoreCase("V")){
				cmp.verticalList().add(cmp.text(key).setStyle(this.bold10Style))
				.add(cmp.text(value));
		}
		return null;
	}
	
	public PageContent(BookingRs.TransferOnly transferOnly){
		init();
		VoucherInfo voucherInfo = transferOnly.getBooking().getConfirm().getVoucherInfo();
		Client client = voucherInfo.getClient();
		OutboundTransferDetails outbound = voucherInfo.getOutboundTransferDetails();
		ReturnTransferDetails destination = voucherInfo.getReturnTransferDetails();
		StyleBuilder columnTitleStyle    = stl.style()
                .setBorder(stl.pen1Point())
                .setFontSize(12)
                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)
                .setBackgroundColor(new Color(200,201,191))
                .setForegroundColor(Color.white);
		
		BookingRs.TransferOnly.Booking.Confirm  confirm = transferOnly.getBooking().getConfirm();				
		String outnum =String.valueOf((int) outbound.getNumUnits());
		String desnum = "0";
		if (destination!=null)
			desnum =String.valueOf((int) destination.getNumUnits());
		VerticalListBuilder vl = cmp.verticalList();		
		
		vl.add(cmp.horizontalList().add(cmp.text("Detalles del traslado (Ida) "+
						voucherInfo.getDeparturePointCode()+"-"+
						voucherInfo.getArrivalPointCode()
						).setStyle(columnTitleStyle)))
				.add(cmp.gap(10,10))							
				.add(addPair("H", "Nombre", client.getLastName()+", "+client.getFirstName()))			
				.add(addPair("H", "Origen", outbound.getOutboundOrigin()))
				.add(addPair("H", "Destino",outbound.getOutboundDestination()))
				.add(addPair("H", "Fecha/hora llegada", outbound.getArrDate()+ " "+outbound.getArrTime()))
				.add(addPair("H", "Tipo de vehículo", outbound.getVehicle()))
				.add(addPair("H", "Proveedor", confirm.getVoucherInfo().getSupplierName())).setHeight(150)
				.add(addPair("H", "Numero de unidades", outnum))
				.add(addPair("H","Detalles del vuelo (ida)", outbound.getDepInfo()!=null?outbound.getDepInfo():""));
		
				// Only When travelType is RETURN
		if (transferOnly.getBooking().getConfirm().getVoucherInfo().getSectorType().equals("RETURN")){			
			vl.add(cmp.horizontalList().add(cmp.text("Detalles del traslado (Vuelta) "+
							voucherInfo.getArrivalPointCode()+"-"+voucherInfo.getDeparturePointCode()
							).setStyle(columnTitleStyle)))
					.add(cmp.gap(10,20))
					.add(addPair("H", "Origen", destination.getReturnOrigin()))
					.add(addPair("H", "Destino",destination.getReturnDestination()))
					.add(addPair("H", "Fecha/hora llegada",destination.getRetDate()+" "+destination.getRetTime()))
					.add(addPair("H", "Tipo de vehículo",destination.getVehicle()))
					.add(addPair("H", "Numero de unidades", desnum))
					.add(addPair("H","Detalles del vuelo (vuelta)", destination.getRetInfo())
					);									
		}
		this.add(vl);										
	}
}
