package carCompanyManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import carCompanyManagerModel.CarCompany;
import carCompanyManagerModel.CarCompaniesInfoPrint;

import java.text.NumberFormat;

public class CarCompanyManager {
	
	private static final CarCompany carCompany1 = null;
	
	public static List<CarCompany> carCompanies = new LinkedList<>();  
	
	public static CarCompany createCarCompany(String name) {
		
		CarCompany carCompany = new CarCompany();
		carCompanies.add(carCompany);
		carCompany.setCompanyName(name);
		List<String> addresses = List.of("124 Mulberry St.", "109 Cherry St.");
		carCompany.setAddresses(addresses);
		carCompany.mapAdd(carCompany.getCompanyName(), carCompany.getAddresses());
		
		return carCompany;
		
	}
	
	public static void printCompanyInfo() {
		
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

	public static void main(String[] args) {

		
		
		
		printCompanyInfo();

		
		
		
		
	}

}
