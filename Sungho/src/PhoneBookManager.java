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
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	
	
	public void searchData()
	{	
		int ind;
		System.out.println("데이터 검색을 시작합니다..");
		System.out.println("찾고 싶은 이름을 입력해주세요.");
		String name = ff.nextLine();
		ind = search(name);
<<<<<<< HEAD
		if(ind < 0 && ind > 100)
=======
		if(ind < 0)
>>>>>>> branch 'master' of https://github.com/tjdgh191/sungho.git
		{	
			System.out.println("찾으려는 데이터가 없습니다.");
			return;	
		}
		else
		{
			arr[ind].printInfo();
			System.out.println("데이터 검색이 완료되었습니다..");
		}
		
	}
	
	
	public void deleteData()
	{
		int ind;
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.println("삭제하려는 이름을 입력해주세요.");
		String name = ff.nextLine();
		ind = search(name);
		if(ind < 0) 
		{
			System.out.println("삭제하려는 데이터가 없습니다.");	
			return;
		}
		else
		{
			for(cnt=ind;cnt<(index-1);cnt++)
			{
				arr[cnt] = arr[cnt+1];
			}
			
			index--;
			System.out.println("데이터 삭제가 완료되었습니다..");
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
