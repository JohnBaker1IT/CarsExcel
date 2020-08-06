package carCompanyManagerModel;

import java.util.List;
import java.util.ListIterator;


public class VehiclesInfoPrint {
	
	public int getBankAccounts (List<Vehicle>vehicles) {
		// Creating object of ListIterator<String> 
        // using listIterator() method 
        ListIterator<Vehicle> 
            iterator = vehicles.listIterator(); 

        // Printing the iterated value 
        System.out.println("\nUsing ListIterator:\n"); 
        while (iterator.hasNext()) { 
            Vehicle Vehicle = iterator.next();
            System.out.println("");
            System.out.println("Owner is : "
                               + Vehicle.getCarModel());
            
        	System.out.println("Addresses are : "
                    + Vehicle.getAddresses());
            
        	
    		System.out.println(Vehicle.getCarModel() +"'s addresses in cutomer map: " + Vehicles.ownerAddresses.get(Vehicle.getCarModel()));
    		
        } 
		
        System.out.println("Customer map: " + Vehicles.ownerAddresses);
		
		return 0;
		
	}

}
