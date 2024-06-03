package com.cogent.junit;

public class DemoUtils {
	private String academy="Cogent";
	private String duplicateAcademy=academy;
	
	public String getAcademy() {
		return academy;
	}

	public String getDuplicateAcademy() {
		return duplicateAcademy;
	}

	public int add (int a, int b)
	{
		return a+b;
	}
	
	public Object getObject(Object ob)
	{
		if(ob!=null)
		{
			return ob;
		}
		return null;
	}
	public boolean isGreater(int a,int b)
	{
		return a>b;
	}

}
