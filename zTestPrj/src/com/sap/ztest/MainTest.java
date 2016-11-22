package com.sap.ztest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.CharBuffer;

public class MainTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// --
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><dongguancyy><no.8><fhID=\"我null\"></fh></no.8></dongguancyy>";
		System.out.println(xml);
		File file = new File("/Users/i335912/Documents/test.xml");
		file.createNewFile();
//		FileWriter fw = new FileWriter(file);
		FileOutputStream writerStream = new FileOutputStream(file, false);  
		BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8")); 
		
		fw.write(xml);
		fw.flush();
		fw.close();
		
 
		
//		File file = new File("/Users/i335912/Downloads/APIF_6027112.xml");
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");  
		BufferedReader fr = new BufferedReader(isr); 
		
//        FileReader fr = new FileReader(file);
        CharBuffer cbuf = CharBuffer.allocate((int)file.length());
        fr.read(cbuf);
        String ibcXML = new String(cbuf.array());
		System.out.println(ibcXML);
		
		fr.close();
		
		
	}

}
