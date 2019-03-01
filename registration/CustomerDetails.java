package registration;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


public class CustomerDetails {
	
	
static int count=1;
	
	public static model setInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the customer details" +count);
		model m= new model();
		System.out.println("Enter First Name");
		m.setFirstName(sc.next());
		System.out.println("Enter Last Name");
		m.setLastName(sc.next());
		System.out.println("Enter Aadharcard No");
		m.setAadharcardNo(sc.nextLong());
		System.out.println("Enter Account type");
		m.setAccountType(sc.next());
		System.out.println("Enter Pancard no");
	    m.setPancardNo(sc.next());
	    System.out.println("Enter Phone no");
	    m.setPhoneNo(sc.nextLong());
	    System.out.println("Enter Address");
	    m.setAddress(sc.next());
	    System.out.println("Enter Password");
	    m.setPassword(sc.next());
	    m.setAccountNo(generateRandomNextLong());
	    System.out.println("your account no is"+ m.getAccountNo() );
	    count++;
	    return m;
	}
	
	public static long generateRandomNextLong(){
	    Random random = new Random();
	    return Math.abs(random.nextLong());
	 
	}

	public void register() {
		ArrayList<model> m1 = new ArrayList<model>();
		m1.add(setInfo());
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Registration\\banking.text");
			
            ObjectOutputStream out = new ObjectOutputStream(fos);
			
			out.writeObject(m1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("done");
	}
	

}
