import java.util.Scanner;

public class Main {
	 public static Scanner fa = new Scanner(System.in);
	 public static Main mai = new Main();
	 public static PhoneBookManager man = new PhoneBookManager();
	 public static String nam,phone,birth,major,company,club;
	 public static int aa,year;
		public static void main(String args[])
		{
			
			mai.showMenu();
	
		}
		
		
		public static void readData()
		{
			
				System.out.println("데이터 입력을 시작합니다..");
				System.out.println("1.일반, 2.대학, 3.회사, 4.동아리");
				int aa = fa.nextInt();
				fa.nextLine();
				switch(aa)
				{
				 case 1:
					 	System.out.println("이름을 입력해주세요");
						nam = fa.nextLine();
						
						System.out.println("전화번호를 입력해주세요");
						phone = fa.nextLine();
						
						System.out.println("생일을 입력해주세요 // 입력안해도 됨");
						birth = fa.nextLine();
						
						man.saveData(nam,phone,birth);
						break;
				 case 2:
					 	System.out.println("이름을 입력해주세요");
						nam = fa.nextLine();
						
						System.out.println("전화번호를 입력해주세요");
						phone = fa.nextLine();
						
						System.out.println("전공을 입력해주세요");
						major = fa.nextLine();
						
						System.out.println("학년을 입력해주세요");
						year = fa.nextInt();
						
						fa.nextLine();
						
						man.saveUnivData(nam,phone,major,year);
						break;
				 case 3:
					 	System.out.println("이름을 입력해주세요");
						nam = fa.nextLine();
						
						System.out.println("전화번호를 입력해주세요");
						phone = fa.nextLine();
						
						System.out.println("회사명을 입력해주세요");
						company = fa.nextLine();
						
						man.saveCompanyData(nam,phone,company);
						break;
				 case 4:
					 	System.out.println("이름을 입력해주세요");
						nam = fa.nextLine();
						
						System.out.println("전화번호를 입력해주세요");
						phone = fa.nextLine();
						
						System.out.println("동아리명을 입력해주세요");
						club = fa.nextLine();
						man.saveClubData(nam,phone,club);
						break;
				 default:
				}
				
				
		}
		
		
		public static void showMenu()
		{
			
			while(true) 
			{
				System.out.println("선택하세요...");
				System.out.println("1. 데이터 입력");
				System.out.println("2. 데이터 검색 ");
				System.out.println("3. 데이터 삭제");
				System.out.println("4. 프로그램 종료 ");
				
				
				int aa = fa.nextInt();
				fa.nextLine();
				
				switch(aa) 
				{
					case 1:
						mai.readData();
						break;
					case 2:
						man.searchData();
						break;
					case 3:
						man.deleteData();
						break;
					case 4:
						System.out.println("프로그램이 종료됩니다.");
						return;
					default:
				}	
			
			}
			
		}
		
		
}


