package carCompanyManagerModel;

import java.util.List;
import java.util.ListIterator;

import carCompanyManagerModel.CarCompanies;
public class CarCompaniesInfoPrint {
	
	public int getBankAccounts (List<CarCompany>carCompanies) {
		// Creating object of ListIterator<String> 
        // using listIterator() method 
        ListIterator<CarCompany> 
            iterator = carCompanies.listIterator(); 

        // Printing the iterated value 
        System.out.println("\nUsing ListIterator:\n"); 
        while (iterator.hasNext()) { 
            CarCompany carCompany = iterator.next();
            System.out.println("");
            System.out.println("Owner is : "
                               + carCompany.getCompanyName());
            
        	System.out.println("Addresses are : "
                    + carCompany.getAddresses());
            
        	
    		System.out.println(carCompany.getCompanyName() +"'s addresses in cutomer map: " + CarCompanies.ownerAddresses.get(carCompany.getCompanyName()));
    		
        } 
		
        System.out.println("Customer map: " + CarCompanies.ownerAddresses);
		
		return 0;
		
	}

}
