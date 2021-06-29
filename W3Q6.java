import java.util.Scanner;

public class W3Q6 {

	public static void main(String[] args) {
		// 평년인지 윤년인지
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) {
			System.out.println("leap year");
		}else {
			System.out.println(year + "common year");
		}

	}

}
