package carCompanyManager;

import java.util.Scanner;

class InputHelper {                          //class to get input
	public String getInput(String prompt) {   //getter method
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();		
        
	}
}
