package com.epl.a2btransfer.printer;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;

import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.builder.component.HorizontalListBuilder;
import net.sf.dynamicreports.report.constant.Constants;

class PageFooter extends HorizontalListBuilder{
	
	private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;
	
	public PageFooter(){
		 init();
		 this.add(getInfoEPL1().setStyle(stl.style(stl.pen1Point())))
				  .add(cmp.horizontalGap(5))
				  .add(getInfoEPL2().setStyle(stl.style(stl.pen1Point())));		 
	}
	
	private ComponentBuilder<?,?> getInfoEPL1(){
		return cmp.verticalList()
				.add(cmp.verticalGap(5))
				.add(cmp.text("  Reservado y pagadero por viejes Euromar S.A."))
				.add(cmp.text("  CIF: A07031008"))
				.add(cmp.verticalGap(5));													
	}
	
	private ComponentBuilder<?,?> getInfoEPL2(){
		return  cmp.verticalList()
				.add(cmp.verticalGap(5))
				.add(cmp.text("  EUROPLAYAS - JOAN DE CREMONA Nº5 -07012"))							
				.add(cmp.text("  PALMA:971716212/A07031008"))
				.add(cmp.verticalGap(5));				
	}
	
	
} 

