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
	
	static List<CarCompany> carCompanies = new LinkedList<>();  
	
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

		CarCompany carCompany1 = createCarCompany("Mercedes-Benz");
		
		
		
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
		
		
		printCompanyInfo();

		
		
		
		
	}

}
