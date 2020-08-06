package carCompanyManager;

import java.util.Iterator;

import com.to.excelToCsv.ExcelToCsv;

public class Controller {

	public static void main(String[] args) {
		System.err.close();
	    System.setErr(System.out);
		
		ExcelToCsv.readFile();
		
		for (Iterator i = ExcelToCsv.fileInfo.iterator(); i.hasNext();) {
	         System.out.println(i.next());
	      }
        
        
	}

}
