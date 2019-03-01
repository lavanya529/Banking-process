package registration;

import java.util.Scanner;

public class Options {

	public static void main(String[] args) {
	System.out.println("enter your option");
	System.out.println("1.Registration");
	System.out.println("2.Login");

	Scanner sc = new Scanner(System.in);
	int option= sc.nextInt();

	switch (option) {
	case 1:
		CustomerDetails cd= new CustomerDetails();
		cd.register();
		
		System.out.println("Registration done");
		
		Login l = new Login();
    	l.called();
	    
		break;
    case 2:
    	Login l1= new Login();
    	l1.called();
    	
		break;

	default:
		System.out.println("Enter valid input");
		//break;
	}
	}

}
