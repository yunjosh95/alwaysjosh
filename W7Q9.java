import java.util.Scanner;

public class W7Q9 {

	public static void main(String[] args) {
		// 공백 포함 문자, 홀수 번째 출력
		
		Scanner sc =new Scanner(System.in);
		String x =sc.nextLine();
		String[] arr = x.split(" ");
		
		for(int i =0; i<arr.length; i++) {
			if(i%2 ==0)
				
			System.out.println(arr[i]);
		}

	}

}
