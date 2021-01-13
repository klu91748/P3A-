package com.example.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.junitexample.modal.User;

public class AuthenticationTest {
	
	@BeforeEach
	public void setup() {
		Authentication.userList.add(User.builder().userName("Kevin").password("pass").role("Admin").build());
	}

	@Test
	public void testUserLogin() {
		Authentication authentication = new Authentication();
		
		assertEquals(true, authentication.login("Kevin", "pass"));
		
	}
	


}
