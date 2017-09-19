import java.util.Scanner;

public class PhoneInfo {
	
	String name;
	String phoneNumber; 
    String birthday;
	
	public PhoneInfo(String name, String phoneNumber, String birthday) 
	{
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	
	public PhoneInfo(String name, String phoneNumber) 
	{
		
		this(name,phoneNumber,null);
		
	}
	
	public void printInfo() 
	{
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		if (birthday.equals("")) 
		{
		System.out.println("생일 : 미입력");
		}
		else System.out.println("생일 : " + birthday);
	}
	
	
}