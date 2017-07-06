package com.epl.a2btransfer.printer;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.builder.component.VerticalListBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.Constants;

public class PageHeader extends VerticalListBuilder {

	private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;

	private StyleBuilder bold10Style;

	protected void init() {
		bold10Style = stl.style(Templates.boldStyle).setFontSize(10);
	}

	private ComponentBuilder<?, ?> addPair(String key, String value) {
		return cmp.horizontalFlowList().add(cmp.text(key + ":").setStyle(bold10Style), cmp.text(value));
	}

	public PageHeader(String locata) {
		init();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		this.setFixedWidth(130).add(cmp.verticalGap(15)).add(addPair("Localizador", locata),
				addPair("Fecha Imp.", df.format(new Date())));
	}

}
