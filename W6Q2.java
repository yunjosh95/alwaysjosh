import java.util.Scanner;

public class W6Q2 {

	public static void main(String[] args) {
		// 6���� �����Ը� �Է¹޾� �������� ����� ����ϴ� ���α׷�
		// ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ�����
		
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
		//�ݿø� �Ͽ� �Ҽ� ù° %.1f
		

	}

}
