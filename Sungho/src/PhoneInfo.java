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
	
	public static void main(String args[])
	{
		Scanner fa = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String nam = fa.nextLine();
		System.out.println("전화번호를 입력해주세요");
		String phone = fa.nextLine();
		System.out.println("생일을 입력해주세요 // 입력안해도 됨");
		String birth = fa.nextLine();
		
		PhoneInfo fr = new PhoneInfo(nam,phone,birth);
		
		fr.printInfo();
		fa.close();
	}
}