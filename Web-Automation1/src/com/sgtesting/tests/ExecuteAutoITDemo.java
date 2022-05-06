package com.sgtesting.tests;

public class ExecuteAutoITDemo {

	public static void main(String[] args) {
		executeAutoIT();

	}

	private static void executeAutoIT()
	{
		try
		{
	//		Runtime.getRuntime().exec("G:\\ExampleAutomation\\NewAutoIT\\ExampleDisplayWindow.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("G:\\ExampleAutomation\\NewAutoIT\\SaveTheFileWithContnet.exe");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
