package com.example.junitexample;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import com.example.junitexample.modal.User;

public class Authentication {
	public static Set<User> userList = new HashSet<>();


	public Boolean login(String userName, String password) {
		AtomicBoolean userExists = new AtomicBoolean(false);

		userList.stream().filter(x -> x.getUserName().equals(userName) && x.getPassword().equals(password)).findFirst()
				.ifPresent(x -> {
					userExists.set(true);
				});

		return userExists.get();
	}
}
