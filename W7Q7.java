import java.util.Scanner;

public class W7Q7 {

	public static void main(String[] args) {
		// �ΰ��� ���ڿ��� �Է¹ް� �� ���ڿ��� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		if(str1.length() > str2.length()) {
			System.out.println(str1.length());
		}
		else {
			System.out.println(str2.length());
		}
	}

}
