package com.to.excelToCsv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.opencsv.CSVWriter;

import carCompanyManagerModel.CarCompany;
import java.io.Console;


public class ExcelToCsv {
	
	public static List<String> fileInfo = new LinkedList<>();

	
	public static void echoAsCSV(Sheet sheet) throws IOException {
    	//Instantiating the CSVWriter class
        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\AndyY\\git\\CarsExcel\\ExcelToCsv\\config\\output.csv"));
        //Writing data to a csv file
        
    	
    	Row row = null;
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) { ////          	         
            	
            	
            	String line[] = {"\"" + row.getCell(j) + "\","};
            	writer.writeNext(line);
            	String cellInfo = row.getCell(j).toString();
            	fileInfo.add(cellInfo);
            	//System.out.print("\"" + row.getCell(j) + "\",");
            }
            //System.out.println();
        }
        writer.close();
        
       
       
    }

   


	public static void main(String[] args) {
		System.err.close();
	    System.setErr(System.out);
    	readFile();
    
    }
	
public static void readFile() {

	 InputStream inp = null;
     try {
         inp = new FileInputStream("C:\\Users\\AndyY\\git\\CarsExcel\\ExcelToCsv\\config\\EXCEL_DATA.xlsx");
         Workbook wb = WorkbookFactory.create(inp);

         for(int i=0;i<wb.getNumberOfSheets();i++) {
             //System.out.println(wb.getSheetAt(i).getSheetName());
            
        	 echoAsCSV(wb.getSheetAt(i));
             
         }
     } catch (InvalidFormatException ex) {
         Logger.getLogger(ExcelToCsv.class.getName()).log(Level.SEVERE, null, ex);
     } catch (FileNotFoundException ex) {
         Logger.getLogger(ExcelToCsv.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(ExcelToCsv.class.getName()).log(Level.SEVERE, null, ex);
     } finally {
         try {
             inp.close();
         } catch (IOException ex) {
             Logger.getLogger(ExcelToCsv.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
 }


}




