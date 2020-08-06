package carCompanyManager;

import java.util.Iterator;

import com.to.excelToCsv.ExcelToCsv;

import carCompanyManagerModel.CarCompany;

public class Controller {

	public static void main(String[] args) {
		System.err.close();
	    System.setErr(System.out);
		
		//Read the excel file to an linked list
	    ExcelToCsv.readFile();
		
	     
		for (Iterator i = ExcelToCsv.fileInfo.iterator(); i.hasNext();) {
	        //Get the company name 
			System.out.println(i.next());
	        
			//Build the company object
			CarCompany carCompany = CarCompanyManager.createCarCompany("Test");
			CarCompanyManager.printCompanyInfo();
			
			break;
			
			
			
		}
        
        
	}

}
