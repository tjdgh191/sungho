import java.util.Scanner;

public class Main {
	 public static Scanner fa = new Scanner(System.in);
	 public static Main mai = new Main();
	 public static PhoneBookManager man = new PhoneBookManager();
	 public static String nam,phone,birth;
	 public static int aa;
		public static void main(String args[])
		{
			
			mai.showMenu();
	
		}
		
		
		public static void readData()
		{
			
				System.out.println("������ �Է��� �����մϴ�..");
			
				System.out.println("�̸��� �Է����ּ���");
				nam = fa.nextLine();
				
				System.out.println("��ȭ��ȣ�� �Է����ּ���");
				phone = fa.nextLine();
				
				System.out.println("������ �Է����ּ��� // �Է¾��ص� ��");
				birth = fa.nextLine();
				
				
				
				man.saveData(nam,phone,birth);
				
		}
		
		
		public static void showMenu()
		{
			
			while(true) 
			{
				System.out.println("�����ϼ���...");
				System.out.println("1. ������ �Է�");
				System.out.println("2. ������ �˻� ");
				System.out.println("3. ������ ����");
				System.out.println("4. ���α׷� ���� ");
				
				
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
						System.out.println("���α׷��� ����˴ϴ�.");
						return;
					default:
				}	
			
			}
			
		}
		
		
}


