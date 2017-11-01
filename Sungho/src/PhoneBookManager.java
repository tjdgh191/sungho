import java.util.Scanner;

public class PhoneBookManager {
	Scanner ff = new Scanner(System.in);
	final int MAX = 100;
	PhoneInfo[] arr = new PhoneInfo[MAX];
	int index,cnt = 0;
	
	
	
	
	public void saveData(String name, String phoneNumber, String birthday) 
	{
		arr[index] = new PhoneInfo(name,phoneNumber,birthday);
		arr[index].printInfo();
		index++;
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	
	
	
	public void searchData()
	{	
		int ind;
		System.out.println("������ �˻��� �����մϴ�..");
		System.out.println("ã�� ���� �̸��� �Է����ּ���.");
		String name = ff.nextLine();
		ind = search(name);
<<<<<<< HEAD
		if(ind < 0 && ind > 100)
=======
		if(ind < 0)
>>>>>>> branch 'master' of https://github.com/tjdgh191/sungho.git
		{	
			System.out.println("ã������ �����Ͱ� �����ϴ�.");
			return;	
		}
		else
		{
			arr[ind].printInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�..");
		}
		
	}
	
	
	public void deleteData()
	{
		int ind;
		System.out.println("������ ������ �����մϴ�..");
		System.out.println("�����Ϸ��� �̸��� �Է����ּ���.");
		String name = ff.nextLine();
		ind = search(name);
		if(ind < 0) 
		{
			System.out.println("�����Ϸ��� �����Ͱ� �����ϴ�.");	
			return;
		}
		else
		{
			for(cnt=ind;cnt<(index-1);cnt++)
			{
				arr[cnt] = arr[cnt+1];
			}
			
			index--;
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�..");
		}
	}
	
	
	int search(String name) 
	{
		
		
		for(cnt=0;cnt<index;cnt++)
		{	
			
			if(name.compareTo(arr[cnt].name) == 0)
			{
				return cnt;
			}	
		
		}
		
		return -1;
	}	
	
}
