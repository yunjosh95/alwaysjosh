import java.util.Scanner;

public class W7Q6 {

	public static void main(String[] args) {
		// 5개이상 100개이하 문자열을 입력받아 5까지 만 출력
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		for(int i=0; i<5; i++) {
		
		System.out.print(str.charAt(i));
		}
	}

}
