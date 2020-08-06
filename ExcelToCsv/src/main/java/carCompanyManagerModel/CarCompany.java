package carCompanyManagerModel;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CarCompany extends CarCompanies{    // PPT  Abstract classes can have implement and non implement methods. Children must implement non implemented methods.
	
	
	private String companyName = "Tom";   // Initialize the Bank Account super class
	private String gender = "Male"; //PPT 1  Set to private to encapsulate getters and setters
	private int age = 40;
	private List<String> addresses = new LinkedList<>();
	private List<VehicleType> vehicleTypes = new LinkedList<>();
	
	public List<VehicleType> getVehicleTypes() {
		return vehicleTypes;
	}
	public void setVehicleTypes(List<VehicleType> vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}
	private double balance = 3000;
	
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String ownerName) {
		this.companyName = ownerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public void mapAdd(String name, List<String> addresses) {
		ownerAddresses.put(name, addresses);
	}
	
	
	
	
	
	double getBalance() { 
		NumberFormat defaultFormat =
		NumberFormat.getCurrencyInstance(); String msg = companyName +  ": " + 
		defaultFormat.format(balance) + " balance";
		System.out.println(msg); return balance; } public void setBalance(double
		balance) { this.balance = balance; 
	}

	
	
	
	
	
	 
	 
	 
	 
			
}
