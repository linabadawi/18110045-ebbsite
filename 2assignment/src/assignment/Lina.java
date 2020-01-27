
package assignment;
import java.util.Scanner;
import java.io.*;


public class Lina {
	
	Scanner scan;
	
	static String Patient_name, Gender, Expiry_date, Address, Age, Patient_phone, Initial_site, Desired_entry_date, Physician, Ward, Special_needs, Requested_services, Order_number, Patient_file, The_date_of_application, Admissions_source, Case ;
	
	
	public void open()
	{
		 
		try {
			scan = new Scanner(new File("src\\assignment\\read.txt"));
			
			
		}catch (FileNotFoundException e) {
			System.out.println("Not working");
		}
	}
		
	public void Read()
	{
		do 
		{
			Patient_name = scan.next();
			Gender = scan.next();
			Expiry_date = scan.next();
			Address = scan.next();
			Age = scan.next();
			Patient_phone = scan.next();
			Initial_site = scan.next();
			Desired_entry_date = scan.next();
			Physician = scan.next();
			 Ward = scan.next();
			 Special_needs = scan.next();
			 Requested_services = scan.next();
			 Order_number = scan.next();
			 Patient_file = scan.next();
			 The_date_of_application = scan.next();
			 Admissions_source = scan.next();
			 Case = scan.next();
			 
			
			
		}while(scan.hasNext());
		
		scan.close();
	}

}
