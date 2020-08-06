package carCompanyManager;

import java.util.Iterator;

import com.to.excelToCsv.ExcelToCsv;

import carCompanyManagerModel.CarCompany;
import carCompanyManagerModel.VehicleType;

public class Controller {

	public static void main(String[] args) {
		System.err.close();
	    System.setErr(System.out);
		
		//Read the excel file to an linked list
	    ExcelToCsv.readFile();
		
	     
		for (Iterator i = ExcelToCsv.fileInfo.iterator(); i.hasNext();) {
	        
			//Add a main car company 
			//Build the company object
			CarCompany carCompany = CarCompanyManager.createCarCompany(i.next().toString());
			CarCompanyManager.printCompanyInfo();
			
			//It should have type of cars
			VehicleType vehicleType = VehicleTypeManager.createVehicleType(i.next().toString());
			VehicleTypeManager.printVehicleTypeInfo();
			
			
			break;
			
			
			
		}
        
        
	}

}
