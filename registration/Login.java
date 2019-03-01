package registration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Login {

	public void called() {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter account number");
        long x = sc.nextLong();
        System.out.println("enter password");
        String y = sc.next();
		
		FileInputStream fis;
		
		try {
			ArrayList<model> us = new ArrayList<>();
			CustomerDetails view =new CustomerDetails();
			model user= new model();
			fis = new FileInputStream("D:\\Registration\\banking.text");
			ObjectInputStream in = new ObjectInputStream(fis);
			 us=  (ArrayList<model>) in.readObject();
			 //System.out.println(user.getFirstName()+" "+user.getLastName()+" "+user.getAadharcardNo()+" "+user.getAccountNo()+" "+user.getAccountType()+" "+user.getPancardNo()+" "+user.getPhoneNo()+" "+user.getAddress());
		    
		              int c=0;  
				
				for (int i = 0; i < us.size(); i++) {
				 
			              user= us.get(i)	; 
			              if(user.getAccountNo()==x && user.getPassword().contentEquals(y)  )
			               {
			            	  c++;
				            PersonalPage pg= new PersonalPage();
				            pg.loginPage();
				            loginPage();
				
				            ArrayList<model> m1 = new ArrayList<model>();
				    		m1.add(loginPage());
				            FileOutputStream fos = new FileOutputStream("D:\\Registration\\balance.text");
				            ObjectOutputStream out = new ObjectOutputStream(fos);
							
							out.writeObject(m1);
			               }
			
	                    
			           }if(c==0)
				 System.out.println("invalid account no or password");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done");	
	}

	private  model void loginPage() {
		// TODO Auto-generated method stub
		
	}


		

	}


