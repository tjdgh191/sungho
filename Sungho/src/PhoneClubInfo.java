
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
		System.out.println("이름: " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("동아리명 : " + club);
	}
}
