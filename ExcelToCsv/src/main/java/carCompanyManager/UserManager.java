package carCompanyManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import carCompanyManagerModel.User;
import carCompanyManagerModel.UserInfoPrint;

import java.text.NumberFormat;

public class UserManager {

	public static void main(String[] args) {

		
        
       
		
		List<User> users = new LinkedList<>();  //PPT3 Array List to store all Bank Account Objects
		
		User user1 = new User();
		users.add(user1);
		user1.setCarModel("Mike");
		List<String> addresses = List.of("124 Mulberry St.", "109 Cherry St.");
		user1.setAddresses(addresses);
		user1.mapAdd(user1.getCarModel(), user1.getAddresses());
		
		User user2 = new User();
		users.add(user2);
		user2.setCarModel("Mary");
		List<String> addresses2 = List.of("125 Mulberry St.", "110 Cherry St.");
		user2.setAddresses(addresses2);
		user2.mapAdd(user2.getCarModel(), user2.getAddresses());
		
		User user3 = new User();
		users.add(user3);
		user3.setCarModel("John");
		List<String> addresses3 = List.of("126 Mulberry St.", "111 Cherry St.");//
		user3.setAddresses(addresses3);
		user3.mapAdd(user3.getCarModel(), user3.getAddresses());
		
		 System.out.println(user1);
	        
	     UserInfoPrint userInfoPrint = new UserInfoPrint();
	     userInfoPrint.getBankAccounts(users);
		 
		 
	        System.out.println(""); 
	        System.out.println("Above is the Bank Account in list"); 	
	        System.out.println("");
		
		
		
		double intf = 100.05;
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println("Added with interface: " + defaultFormat.format(intf)); 
		
		

		
		
		
		
	}

}
