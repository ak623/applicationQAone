package com.Application.userApplication;

import static org.junit.Assert.*;

import org.junit.Test;

import Services.Services;

public class AccountTest {

	
	@Test
	public void countNameTest() {
		Services service = new Services();
		App app = new App();
		app.getAndAddUser();
		int numberOfSameName = service.getCountWithNameOf2("Ashok");
		assertEquals(1 ,numberOfSameName);
	}
	
}
