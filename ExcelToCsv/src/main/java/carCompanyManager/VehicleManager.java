package carCompanyManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import carCompanyManagerModel.Vehicle;
import carCompanyManagerModel.VehiclesInfoPrint;

import java.text.NumberFormat;

public class VehicleManager {

	public static void main(String[] args) {

		
        
       
		
		List<Vehicle> vehicles = new LinkedList<>();  //PPT3 Array List to store all Bank Account Objects
		
		Vehicle vehicle1 = new Vehicle();
		vehicles.add(vehicle1);
		vehicle1.setCarModel("GLC 330D");
		List<String> addresses = List.of("124 Mulberry St.", "109 Cherry St.");
		vehicle1.setAddresses(addresses);
		vehicle1.mapAdd(vehicle1.getCarModel(), vehicle1.getAddresses());
		
		Vehicle vehicle2 = new Vehicle();
		vehicles.add(vehicle2);
		vehicle2.setCarModel("GLE 220D");
		List<String> addresses2 = List.of("125 Mulberry St.", "110 Cherry St.");
		vehicle2.setAddresses(addresses2);
		vehicle2.mapAdd(vehicle2.getCarModel(), vehicle2.getAddresses());
		
		Vehicle vehicle3 = new Vehicle();
		vehicles.add(vehicle3);
		vehicle3.setCarModel("GLD 450");
		List<String> addresses3 = List.of("126 Mulberry St.", "111 Cherry St.");//
		vehicle3.setAddresses(addresses3);
		vehicle3.mapAdd(vehicle3.getCarModel(), vehicle3.getAddresses());
		
		 System.out.println(vehicle1);
	        
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
