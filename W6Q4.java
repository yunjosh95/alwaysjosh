import java.util.Scanner;

public class W6Q4 {

	public static void main(String[] args) {
		// 10���� ������ �Է��޾� �迭�� ���� �� ¦�� ������ Ȧ�� ���� �Էµ� ���� ���
		// ����� �ݿø� �Ͽ� �Ҽ� ù°�ڸ�
		
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
