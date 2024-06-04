package org.ExceptionHandling.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionWithThrows {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		File f = new File("E:\\TestDATA\\Test.txt");
		try {
			FileReader fis = new FileReader(f);
			BufferedReader br = new BufferedReader(fis);
		
			String str;
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
		}catch(IOException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		
	}

	

}
