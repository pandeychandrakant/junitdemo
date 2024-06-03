package com.cogent.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DemoTestSameAndNotSame {
	@Test
	@DisplayName("test for same and not same")
	public void testSameAndNotSame()
		{
		DemoUtils d=new DemoUtils();
		String str="Cogent1";
		assertSame(d.getAcademy(), d.getDuplicateAcademy(),"The object should refer trhe same object");
		assertNotSame(str, d.getDuplicateAcademy(),"The object should no refer the same object");
	}
	

}
