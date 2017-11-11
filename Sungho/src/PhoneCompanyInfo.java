
public class PhoneCompanyInfo extends PhoneInfo
{
	public String company;
	

	public PhoneCompanyInfo(String name,String phoneNumber, String company)
	{
		super(name,phoneNumber);
		this.company = company;
	}

	public void printInfo() 
	{
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("회사명 : " + company);
	}
}


