package com.Application.userApplication;

import java.util.Scanner;

import Account.Account;
import Services.Services;


/**
 * Hello world!
 *
 */
public class App 
{
    static Account account;
    static Services service = new Services();
    
    public static void main( String[] args )
    {
    	getAndAddUser();
    	service.viewAccounts();
    }
    
	public static void getAndAddUser() {
		account = new Account();
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your first name?");
		String firstname = scan.nextLine();
		System.out.println("What is your surename?");
	    String surename = scan.nextLine();
	    account.AccountManagement(firstname, surename);
	    System.out.println("would you like to add more accounts? Y for Yes/ N for No");
	    String answer = scan.nextLine();
	    checkIfMoreAccountShouldBeAdded(answer); 
	}
	
	public static void checkIfMoreAccountShouldBeAdded(String answer) {
        service.addAccount(account.toString());
		if(answer.equals("Y")) {
			getAndAddUser();
		}
	}
}
