package com.ger.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.ger.user.User;

public class UserTest {
	
	@Test
	public void userTestv1() {
		User userObjOne = new User(1, "Geryon");
		User userObjTwo = new User(1, "Geryon");
		
		assertEquals(userObjOne, userObjTwo);
	}
	
	@Test
	public void userTestv2() {
		User userObjOne = new User(1, "Geryon");
		User userObjTwo = new User(1, "Geryon");
		
		assertSame(userObjOne, userObjTwo);
	}
	
}
