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
	
	public static void main(String args[])
	{
		Scanner fa = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
		String nam = fa.nextLine();
		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		String phone = fa.nextLine();
		System.out.println("������ �Է����ּ��� // �Է¾��ص� ��");
		String birth = fa.nextLine();
		
		PhoneInfo fr = new PhoneInfo(nam,phone,birth);
		
		fr.printInfo();
		fa.close();
	}
}