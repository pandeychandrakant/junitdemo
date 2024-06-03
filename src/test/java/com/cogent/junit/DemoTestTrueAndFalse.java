package com.cogent.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DemoTestTrueAndFalse {
	@DisplayName("True and False")
	@Test
	public void testTrueAndFalse()
	{
		DemoUtils d=new DemoUtils();
		
		int a=10;
		int b=5;
		
		assertTrue(d.isGreater(a, b),"This should return true");
		assertFalse(d.isGreater(b, a),"This should return false");
		
	}


}
