package carCompanyManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import carCompanyManagerModel.Vehicle;
import carCompanyManagerModel.VehiclesInfoPrint;

import java.text.NumberFormat;

public class CarManager {

	public static void main(String[] args) {

		
        
       
		
		List<Vehicle> vehicles = new LinkedList<>();  //PPT3 Array List to store all Bank Account Objects
		
		Vehicle Car1 = new Vehicle();
		vehicles.add(Car1);
		Car1.setCarModel("Mercedes-Benz");
		List<String> addresses = List.of("124 Mulberry St.", "109 Cherry St.");
		Car1.setAddresses(addresses);
		Car1.mapAdd(Car1.getCarModel(), Car1.getAddresses());
		
		Vehicle Car2 = new Vehicle();
		vehicles.add(Car2);
		Car2.setCarModel("BMW");
		List<String> addresses2 = List.of("125 Mulberry St.", "110 Cherry St.");
		Car2.setAddresses(addresses2);
		Car2.mapAdd(Car2.getCarModel(), Car2.getAddresses());
		
		Vehicle Car3 = new Vehicle();
		vehicles.add(Car3);
		Car3.setCarModel("Acura");
		List<String> addresses3 = List.of("126 Mulberry St.", "111 Cherry St.");//
		Car3.setAddresses(addresses3);
		Car3.mapAdd(Car3.getCarModel(), Car3.getAddresses());
		
		 System.out.println(Car1);
	        
	     VehiclesInfoPrint vehiclesInfoPrint = new VehiclesInfoPrint();
	     vehiclesInfoPrint.getBankAccounts(vehicles);
		 
		 
	        System.out.println(""); 
	        System.out.println("Above is the Bank Account in list"); 	
	        System.out.println("");
		
		
		
		double intf = 100.05;
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println("Added with interface: " + defaultFormat.format(intf)); 
		
		

		
		
		
		
	}

}
