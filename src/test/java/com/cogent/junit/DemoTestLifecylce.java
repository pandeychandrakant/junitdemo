package com.cogent.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoTestLifecylce {
	DemoUtils d;
	@BeforeEach
	public void setUp()
	{
		System.out.println("Before each test method");
		d=new DemoUtils();
		
	}
	@Test
	public void testEqualsAndNotEquals()
	{
		System.out.println("testEqualsAndNotEquals runs");
		//Going to test the result from add method
		
		//case1 : a=2,b=3,expected=5;
		//case 2: a=3, b=4, expected=
		assertEquals(5,d.add(2, 3),"Result should return 5");
		//case 2: a=3, b=4, expected=7
		assertEquals(7,d.add(3, 4),"Result should return 7");
		
		//case 3: a=1, b=3;
		assertNotEquals(5,d.add(1, 3), "Method shall not return 5");
		//fail("no test input. method simply");
	}
	@Test
	public void testNullAndNotNull()
	{
		System.out.println("testNullAndNotNull runs");
		DemoUtils ob=new DemoUtils();
		String s1=null;
		String s2="Cogent";
		assertNull(ob.getObject(s1),"This should return a null value");
		assertNotNull(ob.getObject(s2),"This should not return a null value");
		
	}
	@AfterEach
	public void cleanUp()
	{
		System.out.println("cleanup Runs after each test method runs");
	}
	@BeforeAll
	public static void tearUp()
	{
		//database connection intialization code
		
		System.out.println("tearup method runs");
		
		
	}
	@AfterAll
	public static void tearDown()
	{
		//database connection cleanup code
		
		System.out.println("teardown method runs");
		
		
	}


}
