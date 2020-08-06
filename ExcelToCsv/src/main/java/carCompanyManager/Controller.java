package carCompanyManager;

import java.util.Iterator;

import com.to.excelToCsv.ExcelToCsv;

import carCompanyManagerModel.CarCompany;
import carCompanyManagerModel.Vehicle;
import carCompanyManagerModel.VehicleType;

public class Controller {

	public static void main(String[] args) {
		System.err.close();
	    System.setErr(System.out);
		
		//Read the excel file to an linked list
	    ExcelToCsv.readFile();
		
	    int count = 0;
		for (Iterator i = ExcelToCsv.fileInfo.iterator(); i.hasNext();) {
	        
			
				//Add a main car company 
				//Build the company object
				CarCompany carCompany = CarCompanyManager.createCarCompany(i.next().toString());
				//CarCompanyManager.printCompanyInfo();
				
				//It should have type of cars
				VehicleType vehicleType = VehicleTypeManager.createVehicleType(i.next().toString());
				//VehicleTypeManager.printVehicleTypeInfo();
				
				//Add the vehicle type to the car companies list
				carCompany.vehicleTypes.add(vehicleType);
				int vehicleTypesSize =carCompany.vehicleTypes.size();
				System.out.println(carCompany.vehicleTypes.get(vehicleTypesSize-1).getCarModel());
				
				//Each type should have list of cars & quantity
				Vehicle vehicle = VehicleManager.createVehicle(i.next().toString());
				//VehicleManager.printVehicleInfo();
				
				//Add the vehicle to the vehicles list
				  carCompany.vehicleTypes.get(vehicleTypesSize-1).vehicles.add(vehicle);
				  int vehiclesSize =  carCompany.vehicleTypes.get(vehicleTypesSize-1).vehicles.size();
				  System.out.println(carCompany.vehicleTypes.get(vehicleTypesSize-1).vehicles.get(vehiclesSize-1).getCarModel());
				
				 
			
			count++;
				
		}
		
		
        
	}

}
