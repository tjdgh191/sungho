
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
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
		System.out.println("ȸ��� : " + company);
	}
}


