import java.util.Scanner;

public class main {

		public static void main(String args[])
		{
			Scanner fa = new Scanner(System.in);
			System.out.println("�̸��� �Է����ּ���");
			String nam = fa.nextLine();
			System.out.println("��ȭ��ȣ�� �Է����ּ���");
			String phone = fa.nextLine();
			System.out.println("������ �Է����ּ��� // �Է¾��ص� ��");
			String birth = fa.nextLine();
			
			PhoneInfo fr = new PhoneInfo(nam,phone,birth);
			
			fr.printInfo();
			fa.close();
		}
		
		
}


