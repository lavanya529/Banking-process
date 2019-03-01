package registration;

import java.util.Scanner;

public class PersonalPage {

	public long loginPage() {
		
		
		Scanner sc = new Scanner(System.in);
	
		int balance = 0;
		
		while(true) {	
			System.out.println("enter your option");
			
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Exit");
			int option= sc.nextInt();
			
			
			
	    switch (option) {
		case 1:
			System.out.println("enter the amount");
			int amount= sc.nextInt();
			
			if(amount>balance) {
				System.out.println("low balance");
			}
			else if(amount<=balance) {
				balance= balance-amount;
				
			}
			break;
			
        case 2:
        	System.out.println("enter amount");
        	int x= sc.nextInt();
        	balance= balance+ x;
        	System.out.println(balance);
        	
        	
        	break;
        	
        case 3:System.exit(0);
	         System.out.println("Thank you");
             break;

		default:
			System.out.println("Enter valid input");
			break;
		}
	    
	    System.out.println("enter valid input");
	    
	    break;
		}
		return balance;	
		}
	
	}


