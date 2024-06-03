package com.cogent.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class DemoTestEquals {
	@Test
	public void testEqualsAndNotEquals()
	{
		System.out.println("testEqualsAndNotEquals runs");
		//Going to test the result from add method
		DemoUtils d=new DemoUtils();
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
		DemoUtils ob=new DemoUtils();
		String s1=null;
		String s2="Cogent";
		assertNull(ob.getObject(s1),"This should return a null value");
		assertNotNull(ob.getObject(s2),"This should not return a null value");
		
	}

}
