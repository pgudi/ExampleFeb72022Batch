package com.sgtesting.tests;
interface University
{
	void showUniversityName(String name);
}

interface College
{
	void displayCollegeName(String name);
}

class LVDCollge implements University,College
{
	public void showUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
	
	public void displayCollegeName(String name)
	{
		System.out.println("College Name :"+name);
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		University obj1=new LVDCollge();
		
		College obj2= (College) obj1;
		obj2.displayCollegeName("LVD College");
	}
}
