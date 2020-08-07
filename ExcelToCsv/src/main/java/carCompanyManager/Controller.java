package carCompanyManager;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import com.to.excelToCsv.ExcelToCsv;


import carCompanyManagerModel.CarCompany;
import carCompanyManagerModel.Vehicle;
import carCompanyManagerModel.VehicleType;

public class Controller {
	
	public static String password;
	public static String username;
	
	static void register () {
		
		// one user can register
		System.out.println("Please register.");
		
		InputHelper helper = new InputHelper();   // create an instance inputhelper
		username = helper.getInput("Enter your username:");
		
		InputHelper helper2 = new InputHelper();   // create an instance inputhelper
		password = helper.getInput("Enter your password:");
		
		
		
		
	}
	
	static void loadObjects () {
		
		System.err.close();
	    System.setErr(System.out);
		
		//Intial data has to be read from Excel file.
	    //Read the excel file to an linked list
	    ExcelToCsv.readFile();
		
	    int count = 0;
		for (Iterator i = ExcelToCsv.fileInfo.iterator(); i.hasNext();) {
	        
			
				//Add a main car company 
				//Build the company object
				CarCompany carCompany = CarCompanyManager.createCarCompany(i.next().toString());
				//CarCompanyManager.printCompanyInfo();
				
				//It should have type of cars
				VehicleType vehicleType = VehicleTypeManager.createVehicleType(i.next().toString());
				//VehicleTypeManager.printVehicleTypeInfo();
				
				//Add the vehicle type to the car companies list
				carCompany.vehicleTypes.add(vehicleType);
				int vehicleTypesSize =carCompany.vehicleTypes.size();
				//System.out.println(carCompany.vehicleTypes.get(vehicleTypesSize-1).getCarModel());
				
				//Each type should have list of cars & quantity
				Vehicle vehicle = VehicleManager.createVehicle(i.next().toString());
				//VehicleManager.printVehicleInfo();
				
				//Add the vehicle to the vehicles list
				  carCompany.vehicleTypes.get(vehicleTypesSize-1).vehicles.add(vehicle);
				  carCompany.vehicleTypes.get(vehicleTypesSize-1).setQuantity(1);
				  int vehiclesSize =  carCompany.vehicleTypes.get(vehicleTypesSize-1).vehicles.size();
				  //System.out.println(carCompany.vehicleTypes.get(vehicleTypesSize-1).vehicles.get(vehiclesSize-1).getCarModel());
				
				
			
			count++;
				
		}
		
		
		
	}
	static void printObjects() {
		
				int count = 1;
				for (Iterator i = CarCompanyManager.carCompanies.iterator(); i.hasNext();) {
					CarCompany carCompany = (CarCompany) i.next();
					System.out.print(count+". ");
					System.out.print(carCompany.getCompanyName()+" ");
					for (Iterator a = carCompany.vehicleTypes.iterator(); a.hasNext();) {
						VehicleType vehicleType = (VehicleType) a.next();
						System.out.print(vehicleType.getCarModel()+" ");
						for (Iterator b = vehicleType.vehicles.iterator(); b.hasNext();) {
							Vehicle vehicle = (Vehicle) b.next();
							System.out.print(vehicle.getCarModel()+" ");
							System.out.println();
						}
						
					}
					System.out.println();
					count++;
				}
				
		        
	}
	static void printObjectsToFile() throws FileNotFoundException {
				
			PrintWriter out = new PrintWriter("C:\\Users\\AndyY\\git\\CarsExcel\\ExcelToCsv\\config\\inventory.txt");
			
			
			
			
				int count = 1;
				for (Iterator i = CarCompanyManager.carCompanies.iterator(); i.hasNext();) {
					CarCompany carCompany = (CarCompany) i.next();
					System.out.print(count+". ");
					System.out.print(carCompany.getCompanyName()+" ");
					out.print(count+". ");
					out.print(carCompany.getCompanyName()+" ");
					for (Iterator a = carCompany.vehicleTypes.iterator(); a.hasNext();) {
						VehicleType vehicleType = (VehicleType) a.next();
						System.out.print(vehicleType.getCarModel()+" ");
						out.print(vehicleType.getCarModel()+" ");
						for (Iterator b = vehicleType.vehicles.iterator(); b.hasNext();) {
							Vehicle vehicle = (Vehicle) b.next(); 
							int ec = 0;
							
							
							
							System.out.print(vehicle.getCarModel()+" ");
							System.out.println();
							out.print(vehicle.getCarModel()+" ");
							out.println();
						}
						
					}
					System.out.println();
					out.println();
					count++;
				}
			out.close();
		        
	}
	
	static void getInput() {
		
		//Which car would you like to buy?
				System.out.println("Which car would you like to buy?");
				//Generate show room
				int count = 1;
				for (Iterator i = CarCompanyManager.carCompanies.iterator(); i.hasNext();) {
					CarCompany carCompany = (CarCompany) i.next();
					System.out.print(count+". ");
					System.out.print(carCompany.getCompanyName()+" ");
					for (Iterator a = carCompany.vehicleTypes.iterator(); a.hasNext();) {
						VehicleType vehicleType = (VehicleType) a.next();
						System.out.print(vehicleType.getCarModel()+" ");
						for (Iterator b = vehicleType.vehicles.iterator(); b.hasNext();) {
							Vehicle vehicle = (Vehicle) b.next();
							System.out.print(vehicle.getCarModel()+" ");
							System.out.println();
							InputHelper helper = new InputHelper();   // create an instance inputhelper
							String s1 = helper.getInput("Would you like to buy this car(Y/N)?");
							switch(s1){
							
							case "Y":
								
							   //on buying that specific count should be decreased 
								vehicleType.vehicles.remove(vehicle);
								vehicleType.setQuantity(-1);
							  System.out.print("Thank you for your purcase.");
							   
							}
						}
						
					}
					System.out.println();
					count++;
				}
				
		
		
	}
		
	

	public static void main(String[] args) throws FileNotFoundException {
		
		register();  //get username and password
		
		loadObjects(); //load object from excel file
		
		//printObjects();
		
		getInput();  //find out what the user wants to buy
		
		printObjectsToFile(); //print the inventory to a text file
		
        
	}

}
