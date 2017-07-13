package com.epl.a2btransfer.printer;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;

import java.awt.Color;

import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo;

import net.sf.dynamicreports.report.builder.component.HorizontalListBuilder;
import net.sf.dynamicreports.report.builder.component.VerticalListBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;

public class PickupInfo extends VerticalListBuilder {

	private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;
	private StyleBuilder columnTitleStyle;
		
	protected void init(){						
		columnTitleStyle    = stl.style()
                .setBorder(stl.pen1Point())
                .setFontSize(12)
                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)
                .setBackgroundColor(new Color(200,201,191))
                .setForegroundColor(Color.white);
		
	}
	
	private VerticalListBuilder leftSide(String accadd1) {
		return cmp.verticalList().add(cmp.text("Dirección 1").setStyle(columnTitleStyle).setFixedHeight(15)).add(
				cmp.gap(10, 10), cmp.text(" "+accadd1))
				.setStyle(stl.style(stl.pen1Point()))
				.setFixedHeight(87);
	}													

	private VerticalListBuilder rigthSide(String accadd2) {
		return cmp.verticalList().add(cmp.text("Dirección 2").setStyle(columnTitleStyle).setFixedHeight(15)).add(
				cmp.gap(20, 10), cmp.text(" "+accadd2))
				.setStyle(stl.style(stl.pen1Point()))
				.setFixedHeight(87);											
	}

	public PickupInfo(BookingRs.TransferOnly transferOnly) {
		init();
		VoucherInfo voucherInfo = transferOnly.getBooking().getConfirm().getVoucherInfo();
		String accadd1 = voucherInfo.getAccommodationAddress();
		String accadd2 = voucherInfo.getAccommodationAddress2();
		
		if (accadd1 == null)
			accadd1 = " ";
		
		if (accadd2 == null)
			accadd2 = " ";
		
		this.add(cmp.horizontalList()
				.add(cmp.verticalGap(50)
					,leftSide(accadd1)
					,cmp.horizontalGap(10)
					,this.rigthSide(accadd2)));		
		this.add(cmp.verticalGap(20));
		this.add(
				cmp.verticalGap(10),
				cmp.text("*Dependiendo del vehículo sólo se admitirá una bolsa por pasajero ").setStyle(stl.style(stl.pen2Point())),
				cmp.verticalGap(10)
		);		
	}

}
