package Services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Account.Account;



public class Services {
	static int counter = 0;
	static  HashMap<String, String> accountList = new HashMap<String, String>();	
	public void addAccount(String account) {
		accountList.put(Integer.toString(counter), account);
		counter++;
	}
	
	public void viewAccounts() {
	    Iterator it = accountList.entrySet().iterator();
	    conVertMapToJson();
	}
	
	
	// Construct a JSONObject from a Map.
	public void conVertMapToJson(){
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		String jsonString = gson.toJson(accountList);
		System.out.println(jsonString);
	}

}
	
