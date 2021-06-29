import java.util.Scanner;

public class W7Q1 {

	public static void main(String[] args) {
		// 문자열을 입력받고 문자열을 이어서 두 번 출력하는 프로그램을 작성. 문자열 길이는 100이하 ASDFG
		
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		System.out.println(str.concat(str));

	}

}
