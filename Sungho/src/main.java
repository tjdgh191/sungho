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
			
				System.out.println("�̸��� �Է����ּ���");
				nam = fa.nextLine();
				
				System.out.println("��ȭ��ȣ�� �Է����ּ���");
				phone = fa.nextLine();
				
				System.out.println("������ �Է����ּ��� // �Է¾��ص� ��");
				birth = fa.nextLine();
				
				PhoneInfo fr = new PhoneInfo(nam,phone,birth);
				fr.printInfo();	
			
		}
		
		
		public static void showMenu()
		{
			
			while(true) 
			{
				
				System.out.println("1. ������ �Է�");
				System.out.println("2. ���α׷� ���� ");
				System.out.println("1���� 2���� �Է����ּ���.");
				
				int aa = fa.nextInt();
				fa.nextLine();
				switch(aa) 
				{
					case 1:
						mai.readData();
						break;
					case 2:
						System.out.println("���α׷��� ����˴ϴ�.");
						return;
					default:
				}	
			
			}
			
		}
		
		
}


