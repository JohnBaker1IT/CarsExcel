package carCompanyManagerModel;

import java.util.List;
import java.util.ListIterator;


public class UserInfoPrint {
	
	public int getBankAccounts (List<User>users) {
		// Creating object of ListIterator<String> 
        // using listIterator() method 
        ListIterator<User> 
            iterator = users.listIterator(); 

        // Printing the iterated value 
        System.out.println("\nUsing ListIterator:\n"); 
        while (iterator.hasNext()) { 
            User user = iterator.next();
            System.out.println("");
            System.out.println("Owner is : "
                               + user.getCarModel());
            
        	System.out.println("Addresses are : "
                    + user.getAddresses());
            
        	
    		System.out.println(user.getCarModel() +"'s addresses in cutomer map: " + Users.ownerAddresses.get(user.getCarModel()));
    		
        } 
		
        System.out.println("Customer map: " + Users.ownerAddresses);
		
		return 0;
		
	}

}
