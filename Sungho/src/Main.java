import java.util.Scanner;

public class main {
	 static Scanner fa = new Scanner(System.in);
	 static main mai = new main();
	 static String nam,phone,birth;
	 static int aa;
		public static void main(String args[])
		{
			
			mai.showMenu();
	
		}
		
		
		public static void readData()
		{
			
				System.out.println("이름을 입력해주세요");
				nam = fa.nextLine();
				
				System.out.println("전화번호를 입력해주세요");
				phone = fa.nextLine();
				
				System.out.println("생일을 입력해주세요 // 입력안해도 됨");
				birth = fa.nextLine();
				
				PhoneInfo fr = new PhoneInfo(nam,phone,birth);
				fr.printInfo();	
			
		}
		
		
		public static void showMenu()
		{
			
			while(true) 
			{
				
				System.out.println("1. 데이터 입력");
				System.out.println("2. 프로그램 종료 ");
				System.out.println("1번과 2번만 입력해주세요.");
				
				int aa = fa.nextInt();
				fa.nextLine();
				switch(aa) 
				{
					case 1:
						mai.readData();
						break;
					case 2:
						System.out.println("프로그램이 종료됩니다.");
						return;
					default:
				}	
			
			}
			
		}
		
		
}


