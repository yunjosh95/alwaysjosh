import java.util.Scanner;

public class W7Q4 {

	public static void main(String[] args) {
		// 두개의 문자열을 입력받아(Korean English) 두 문자열의 길이의 합을 출력
		
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(str1.length() + str2.length());
		
	}

}
