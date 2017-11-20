
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
		System.out.println("이름: " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);
	}
}
