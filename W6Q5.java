import java.util.Scanner;

public class W6Q5 {

	public static void main(String[] args) {
		// 100개의 정수를 배열 선언 차례로 받다가 0 이 입렫되면 0제외 뒤에서 부터 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] ==0)
				break;
		}
		
		for(int i =arr.length-1; i>=0; i--) {
			if(arr[i] !=0)
				
				System.out.print(arr[i]+ " ");
		}

	}

}
