import java.util.Scanner;

public class W6Q1 {

	public static void main(String[] args) {
		// 10개의 문자를 입력받고 1,4,7 문자를 출력
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] arr = str.split(" "); 
		
		System.out.print(arr[0]+" " + arr[3] + " " + arr[6]);

	}

}
