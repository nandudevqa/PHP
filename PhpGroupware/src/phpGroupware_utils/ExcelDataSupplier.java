package phpGroupware_utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ExcelDataSupplier {
	@DataProvider(name="data1")
	public String [][] getData() throws Exception {
		//public static void main (String[] arg) throws Exception {
		File excelfile = new File ("./src/test/java/com/bobcares/testdata/DATA1.xlsx");
		FileInputStream fis =new FileInputStream(excelfile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int noofRows=sheet.getPhysicalNumberOfRows();
		int colNum=sheet.getRow(0).getLastCellNum();

		String [][] data= new String[noofRows-1][colNum];
		for (int i=0;i<noofRows-1;i++) {
			for(int j=0;j<colNum;j++) {
				DataFormatter df=new DataFormatter();
				data[i][j] =df.formatCellValue(sheet.getRow(i+1).getCell(j));
				//System.out.println(sheet.getRow(i).getCell(j).getDateCellValue());
			}
		}
		workbook.close();
		fis.close();
		for (String[] dataarr :data ){
		//	System.out.println(Arrays.toString(dataarr));
		}
		return data;
	}












}
	
	
	