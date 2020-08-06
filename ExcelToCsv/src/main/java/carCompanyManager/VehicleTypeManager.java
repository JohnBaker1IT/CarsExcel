package carCompanyManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import carCompanyManagerModel.CarCompaniesInfoPrint;
import carCompanyManagerModel.CarCompany;
import carCompanyManagerModel.VehicleType;
import carCompanyManagerModel.VehicleTypesInfoPrint;

import java.text.NumberFormat;

public class VehicleTypeManager {
	
	private static final VehicleType vehicleType1 = null;
	
	static List<VehicleType> vehicleTypes = new LinkedList<>();  

	public static VehicleType createVehicleType (String name) {
		
		VehicleType vehicleType = new VehicleType();
		vehicleTypes.add(vehicleType);
		vehicleType.setCarModel(name);
		List<String> addresses = List.of("124 Mulberry St.", "109 Cherry St.");
		vehicleType.setAddresses(addresses);
		
		//System.out.println("addresses: " + vehicleType.getAddresses());
		//System.out.println("model: " + vehicleType.getCarModel());
		vehicleType.mapAdd(vehicleType.getCarModel(), vehicleType.getAddresses());
		
		return vehicleType;
		
	}
	
	public static void printVehicleTypeInfo() {
		
		System.out.println(vehicleType1);
        
		 VehicleTypesInfoPrint vehicleTypesInfoPrint = new VehicleTypesInfoPrint();
	     vehicleTypesInfoPrint.getBankAccounts(vehicleTypes);
	     
		 
	        System.out.println(""); 
	        System.out.println("Above is the Bank Account in list"); 	
	        System.out.println("");
		
		
		
		double intf = 100.05;
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println("Added with interface: " + defaultFormat.format(intf)); 
		
		
		
	}
	
	
	public static void main(String[] args) {

		
        
       
		VehicleType vehicleType1 = createVehicleType("SUV");
		
		
		VehicleType vehicleType2 = new VehicleType();
		vehicleTypes.add(vehicleType2);
		vehicleType2.setCarModel("Sedan");
		List<String> addresses2 = List.of("125 Mulberry St.", "110 Cherry St.");
		vehicleType2.setAddresses(addresses2);
		vehicleType2.mapAdd(vehicleType2.getCarModel(), vehicleType2.getAddresses());
		
		VehicleType vehicleType3 = new VehicleType();
		vehicleTypes.add(vehicleType3);
		vehicleType3.setCarModel("Compact SUV");
		List<String> addresses3 = List.of("126 Mulberry St.", "111 Cherry St.");//
		vehicleType3.setAddresses(addresses3);
		vehicleType3.mapAdd(vehicleType3.getCarModel(), vehicleType3.getAddresses());
		
		 
		printVehicleTypeInfo();
		

		
		
		
		
	}

}
