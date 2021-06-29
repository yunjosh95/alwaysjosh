import java.util.Scanner;

public class W6Q2 {

	public static void main(String[] args) {
		// 6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램
		// 출력은 반올림하여 소수 첫째자리까지
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr =  new double[6];
		double average =0;
		double sum = 0;
		
		for(int i =0; i<6; i++) {
			arr[i] =sc.nextDouble();
			sum += arr[i];
		}
		
		average = sum/6;
		
		System.out.printf("%.1f", average);
		//반올림 하여 소수 첫째 %.1f
		

	}

}
