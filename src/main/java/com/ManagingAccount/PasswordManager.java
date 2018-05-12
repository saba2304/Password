package com.ManagingAccount;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PasswordManager {
	
	HashMap<String, Account> map = new HashMap();
	
	

	public void addAccount(Account a1,String key) {
		map.put(key, a1);
		
	}
	
	public void deleteAccount(String key) {
		
		map.remove(key);
		
	}
	
	public void showAll() {
		if(map.isEmpty()) {
			System.out.println("Password manager is empty");
		}
		Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
		
	}
	
	public void show (String key) {
		if (map.containsKey("key")) 
        {
            Account a = map.get("key");
            System.out.println("UserID :  " + a.userID);
            System.out.println("Password: "+ a.password);
        }
		else
		{
			
			System.out.println(key+ " "+"is not present");
		}
		
	}

	public void validateMasterPassword(String pass) {
		Scanner s = new Scanner(System.in);
		if(pass.equals("saba")) {
			
			return;
		}
			
		System.out.println("Incorrect password");
			
		System.out.println("Enter correct password");
			
		String newPass = s.nextLine();
		while(!newPass.equals("saba")) {
				
				System.out.println("Enter correct password");
				newPass = s.nextLine();
			}
			
		}
			
		
	}


