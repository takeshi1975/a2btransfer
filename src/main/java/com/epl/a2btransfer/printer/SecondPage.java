package com.epl.a2btransfer.printer;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;

import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.JoiningIns;

import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.jasperreports.engine.JRDataSource;

public interface SecondPage{		
	
	public static JRDataSource createDataSource(BookingRs.TransferOnly transferOnly) {
		List<String> content = new ArrayList<String>();
		try{
			if (transferOnly!=null && transferOnly.getBooking().getConfirm().getVoucherInfo().getJoiningIns()!=null){
				JoiningIns joiningIns = transferOnly.getBooking().getConfirm().getVoucherInfo().getJoiningIns(); 
				if (joiningIns.getJoinline()!=null)
					content = joiningIns.getJoinline();
				else
					content.add("No hay información adicional de A2BTransfers");
			}			
			content = conversion(content);
			DRDataSource dataSource = new DRDataSource("line");
			content.forEach(line->dataSource.add(line));
			return dataSource;
		}catch(IOException ioex){
			
		}
		return null;
	}
			
	public static List<String> conversion(List<String> buffer) throws IOException{
		Logger log = Logger.getLogger(SecondPage.class);
		List<String> text = new ArrayList<String>();
		BufferedReader br = null;		
		try{						
			for(String line:buffer){	
				log.info("Input ->"+line);
				line = StringEscapeUtils.unescapeHtml(line);
				int position=-1;
				while ((position = line.indexOf("&#"))>-1){
					int posend = position;
					while (line.charAt(posend)!=';') 
						posend++;
					String sub = line.substring(position+2, posend);
					char x = (char) Integer.valueOf(sub).intValue();
					String replace = new String(new char[]{x});
					line = line.replaceAll("&#"+sub+";", replace);
				}
				log.info("Output ->"+line);
				if (!line.trim().equals("")){
					System.out.println(line);
					text.add(line);
				}						
			}
			text.add(" ");
			text.add(" ");
		} finally{
			if (br!=null)
				br.close();
		}
		return text;
	}
	
}
