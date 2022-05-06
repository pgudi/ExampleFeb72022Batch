package com.sgtesting.tests;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateHTMLFileDemo {

	public static void main(String[] args) {
		createHTMLFile();

	}
	
	private static void createHTMLFile()
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter("G:\\EXAMPLE\\Test.html"));
			bw.write("<html>");
			bw.write("<head><title>Test Web Page</title></head>");
			bw.write("<body>");
			bw.write("<h1 align=center>Sample Web Page</h1>");
			bw.write("<p>Java is a programming language,It is used for application development</p>");
			bw.write("<p>Python is a Scripting Language,It is used in Web Application</p>");
			bw.write("</body>");
			bw.write("</html>");		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
