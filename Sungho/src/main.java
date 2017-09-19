import java.util.Scanner;

public class main {

		public static void main(String args[])
		{
			Scanner fa = new Scanner(System.in);
			System.out.println("이름을 입력해주세요");
			String nam = fa.nextLine();
			System.out.println("전화번호를 입력해주세요");
			String phone = fa.nextLine();
			System.out.println("생일을 입력해주세요 // 입력안해도 됨");
			String birth = fa.nextLine();
			
			PhoneInfo fr = new PhoneInfo(nam,phone,birth);
			
			fr.printInfo();
			fa.close();
		}
		
		
}


