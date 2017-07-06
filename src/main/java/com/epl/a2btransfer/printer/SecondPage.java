package com.epl.a2btransfer.printer;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;

import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.jasperreports.engine.JRDataSource;

public interface SecondPage{		
	
	public static JRDataSource createDataSource() {
		try{
			Collection<String> lines = readFile();
			DRDataSource dataSource = new DRDataSource("line");
			for(String line: lines)
				dataSource.add(line);
			return dataSource;
		}catch(IOException ioex){
			
		}
		return null;
	}
			
	public static List<String> readFile() throws IOException{
		Logger log = Logger.getLogger(SecondPage.class);
		List<String> text = new ArrayList<String>();
		BufferedReader br = null;		
		try{
			br = new BufferedReader(new FileReader("a2bInfo.txt"));
			String line = "";
			while ((line=br.readLine())!=null){	
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
