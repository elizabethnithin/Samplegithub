package sampleExcel;

import java.io.IOException;

public class ExcelClass {
	

	public static void main(String[] args) throws IOException {
		
		System.out.println(ExcelSample.readString(0,0));
		System.out.println(ExcelSample.readData(0,1));

	}

}
