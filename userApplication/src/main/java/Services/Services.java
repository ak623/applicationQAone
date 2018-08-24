package Services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
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
	    conVertMapToJson();
	}
	

	
	// Construct a JSONObject from a Map.
	public void conVertMapToJson(){
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		String jsonString = gson.toJson(accountList);
		System.out.println(jsonString);
	}

	public int getCountWithNameOf(String name) {
		accountList.put("1", "Ashok");
		int counter = 0;
		Iterator it = accountList.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	    	if(((String) pair.getValue()).contains(name)) {
	    		counter++;
	    	}
	    }
		return counter;
	}
	
	public int getCountWithNameOf2(String name) {
		accountList.put("1", "Ashok");
		int test = (int) accountList.values().stream().filter( v -> v.contains(name)).count();
		//accountList.forEach((k, v) -> System.out.println(v));
		return test;
	}

}
	
