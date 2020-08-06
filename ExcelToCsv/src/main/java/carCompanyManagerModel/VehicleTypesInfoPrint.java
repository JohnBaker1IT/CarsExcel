package carCompanyManagerModel;

import java.util.List;
import java.util.ListIterator;

import carCompanyManagerModel.VehicleTypes;
public class VehicleTypesInfoPrint {
	
	public int getBankAccounts (List<VehicleType>vehicleTypes) {
		// Creating object of ListIterator<String> 
        // using listIterator() method 
        ListIterator<VehicleType> 
            iterator = vehicleTypes.listIterator(); 

        // Printing the iterated value 
        System.out.println("\nUsing ListIterator:\n"); 
        while (iterator.hasNext()) { 
            VehicleType vehicleType = iterator.next();
            System.out.println("");
            System.out.println("Owner is : "
                               + vehicleType.getCarModel());
            
        	System.out.println("Addresses are : "
                    + vehicleType.getAddresses());
            
        	                                                                                      
    		System.out.println(vehicleType.getCarModel() +"'s addresses in cutomer map: " + VehicleTypes.ownerAddresses.get(vehicleType.getCarModel()));
    		
        } 
		
        System.out.println("Customer map: " + VehicleTypes.ownerAddresses);
		
		return 0;
		
	}

}
