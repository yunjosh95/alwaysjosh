import java.util.Scanner;

public class W7Q7 {

	public static void main(String[] args) {
		// 두개의 문자열을 입력받고 긴 문자열의 개수를 출력
		
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
