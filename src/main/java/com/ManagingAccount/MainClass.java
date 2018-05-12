package com.ManagingAccount;
import java.util.Scanner;
public class MainClass {
	Scanner sc = new Scanner(System.in);
	Account a1 = new Account();
	PasswordManager pm = new PasswordManager();
	
	 public void showOptions() {
		System.out.println("0- Quit");
		
		System.out.println("1- add Account");
				
		System.out.println("2- Delete Account");
				
		System.out.println("3- Show all accounts");
				
		System.out.println("4- show");
		}		
	
	 public void chooseOptions(int i) {	
		
		switch (i) 
		   {
		      case 0:  	System.exit(0);
		                  break;
		      
		      case 1: 	System.out.println("Enter account name");
		      			sc.nextLine();
		            	String accountName = sc.nextLine();
		            	System.out.println("Enter userid");
		            	a1.userID = sc.nextLine();
		            	System.out.println("Enter password");
		            	a1.password = sc.nextLine();
		            	pm.addAccount(a1,accountName);
		            	System.out.println("Account added");
		            	break;
		                     
	            case 2: System.out.println("Enter Name of an account you want to delete");
	            		String key = sc.nextLine();
	            		pm.deleteAccount(key);
	            		System.out.println("Account Deleted");
	                    break;
	            
	            case 3:  pm.showAll();
	                     break;
	           
	            case 4: System.out.println("Enter the name of the accounts");
	            		sc.nextLine();
	            		String name = sc.nextLine();
	            		pm.show(name);
	            		break;
	            
		        }
				
			
	}

	public static void main(String[] args) {
		int i;
		MainClass m1 = new MainClass();
		System.out.println("Password Manager is launched");
		
		System.out.println("Enter the master password");
		String s = m1.sc.nextLine();
		
		m1.pm.validateMasterPassword(s);
		m1.showOptions(); 
		i = m1.sc.nextInt();
		m1.chooseOptions(i);
		i=m1.sc.nextInt();
		while(i!=0){
			m1.chooseOptions(i);
			m1.showOptions();
			i=m1.sc.nextInt();
			}
		//m1.showOptions();
		//i = m1.sc.nextInt();
		
	}

}


