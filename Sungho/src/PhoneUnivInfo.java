
public class PhoneUnivInfo extends PhoneInfo
{
	public String major;
	public int year;
	

	
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year)
	{	
		
		super(name,phoneNumber);
		this.major = major;
		this.year = year;
	}
	
	public void printInfo() 
	{
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
		System.out.println("���� : " + major);
		System.out.println("�г� : " + year);
	}
}
