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
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
		if (birthday.equals("")) 
		{
		System.out.println("���� : ���Է�");
		}
		else System.out.println("���� : " + birthday);
	}
	
	
}