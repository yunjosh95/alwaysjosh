import java.util.Scanner;

public class W6Q4 {

	public static void main(String[] args) {
		// 10개의 정수를 입려받아 배열에 저장 후 짝수 번쨰와 홀수 번쨰 입력된 값의 평균
		// 평균은 반올림 하여 소수 첫째자리
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int sum1 = 0;
		double sum2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] =sc.nextInt();
			if(i%2 ==0)
				sum2 += arr[i];
			else
				sum1 += arr[i];
			
			System.out.println("sum :" + sum1);
			System.out.printf("average :%.1f",sum2/5);
		}

	}

}
