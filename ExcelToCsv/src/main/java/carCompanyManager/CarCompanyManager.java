package carCompanyManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import carCompanyManagerModel.CarCompany;
import carCompanyManagerModel.CarCompaniesInfoPrint;

import java.text.NumberFormat;

public class CarCompanyManager {

	public static void main(String[] args) {

		
        
       
		
		List<CarCompany> carCompanies = new LinkedList<>();  //PPT3 Array List to store all Bank Account Objects
		
		CarCompany carCompany1 = new CarCompany();
		carCompanies.add(carCompany1);
		carCompany1.setCompanyName("Mercedes-Benz");
		List<String> addresses = List.of("124 Mulberry St.", "109 Cherry St.");
		carCompany1.setAddresses(addresses);
		carCompany1.mapAdd(carCompany1.getCompanyName(), carCompany1.getAddresses());
		
		CarCompany carCompany2 = new CarCompany();
		carCompanies.add(carCompany2);
		carCompany2.setCompanyName("BMW");
		List<String> addresses2 = List.of("125 Mulberry St.", "110 Cherry St.");
		carCompany2.setAddresses(addresses2);
		carCompany2.mapAdd(carCompany2.getCompanyName(), carCompany2.getAddresses());
		
		CarCompany carCompany3 = new CarCompany();
		carCompanies.add(carCompany3);
		carCompany3.setCompanyName("Acura");
		List<String> addresses3 = List.of("126 Mulberry St.", "111 Cherry St.");//
		carCompany3.setAddresses(addresses3);
		carCompany3.mapAdd(carCompany3.getCompanyName(), carCompany3.getAddresses());
		
		 System.out.println(carCompany1);
	        
	     CarCompaniesInfoPrint carCompaniesInfoPrint = new CarCompaniesInfoPrint();
		 carCompaniesInfoPrint.getBankAccounts(carCompanies);
		 
		 
	        System.out.println(""); 
	        System.out.println("Above is the Bank Account in list"); 	
	        System.out.println("");
		
		
		
		double intf = 100.05;
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println("Added with interface: " + defaultFormat.format(intf)); 
		
		

		
		
		
		
	}

}
