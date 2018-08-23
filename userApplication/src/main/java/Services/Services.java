package Services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Account.Account;



public class Services {
	static int counter = 0;
	static  HashMap<Integer, String> accountList = new HashMap<Integer, String>();	
	public void addAccount(String account) {
		accountList.put(counter, account);
		counter++;
	}
	
	public void viewAccounts() {
	    Iterator it = accountList.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	    }
	}
	
	public void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to delete a user?");
		String answer ="";
		try
		{
			answer = scan.nextLine();
			if(answer.equals("Y")) {
				System.out.println("What is the account number??");
				int accNo = Integer.parseInt(scan.nextLine());
				accountList.remove(accNo);
				scan.close();
				delete();
			}
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("Nothing was deleted, same error still there");
		}
	}
	

}
	
