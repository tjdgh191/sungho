
public class PhoneClubInfo extends PhoneInfo
{
	public String club;
	
	public PhoneClubInfo(String name,String phoneNumber,String club)
	{
		super(name,phoneNumber);
		this.club = club;
	}
	
	public void printInfo()
	{
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
		System.out.println("���Ƹ��� : " + club);
	}
}
