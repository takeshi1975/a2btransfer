package com.epl.a2btransfer.printer;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;

import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.builder.component.HorizontalListBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;

public class PageAgencyInfo extends HorizontalListBuilder{
		
	private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;
	private StyleBuilder bold10Style;
	private StyleBuilder bold10StyleCenter;
	
	protected void init(){		
		super.init();
		bold10Style = stl.style(Templates.boldStyle).setFontSize(10);
		bold10StyleCenter = bold10Style.setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);
	}
	
	
	public PageAgencyInfo(String agencia, String direccion, String telefono, String referencia){		
		init();
		add(   getAgencyData(agencia, direccion, telefono))
			  .add(cmp.horizontalGap(5))
			  .add(getTransferInfo(referencia));		
	}		
	
	private ComponentBuilder<?,?> getAgencyData(String agencia, String direccion, String telefono){
		return cmp.verticalList().add(cmp.text(agencia).setStyle(bold10Style).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER))
				.add(cmp.text(direccion).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER))
				.add(cmp.text(telefono).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER))
				.setStyle(stl.style(stl.pen1Point()));
	}
	
	private ComponentBuilder<?,?> getTransferInfo(String ref){
		return cmp.verticalList().add(cmp.text("SERVICIO DE TRASLADO").setStyle(bold10StyleCenter),
			   cmp.text(" Ref: "+ref).setStyle(bold10StyleCenter),										 										 
			   cmp.text(" ").setHorizontalTextAlignment(HorizontalTextAlignment.CENTER))
				.setStyle(stl.style(stl.pen1Point()));
	}
	
}
