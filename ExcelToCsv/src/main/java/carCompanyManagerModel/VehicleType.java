package carCompanyManagerModel;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VehicleType extends VehicleTypes{    // PPT  Abstract classes can have implement and non implement methods. Children must implement non implemented methods.
	
	
	private String carModel = "Tom";   // Initialize the Bank Account super class
	private String gender = "Male"; //PPT 1  Set to private to encapsulate getters and setters
	private int age = 40;
	private List<String> addresses = new LinkedList<>();
	private double balance = 3000;
	public List<Vehicle> vehicles = new LinkedList<>();
	
	
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
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
		this.ownerAddresses.put(name, addresses);
	}
	
	
	
	
	
	double getBalance() { 
		NumberFormat defaultFormat =
		NumberFormat.getCurrencyInstance(); String msg = carModel +  ": " + 
		defaultFormat.format(balance) + " balance";
		System.out.println(msg); return balance; } public void setBalance(double
		balance) { this.balance = balance; 
	}

	
	
	
	
	
	 
	 
	 
	 
			
}
