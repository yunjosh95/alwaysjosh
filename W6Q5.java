import java.util.Scanner;

public class W6Q5 {

	public static void main(String[] args) {
		// 100���� ������ �迭 ���� ���ʷ� �޴ٰ� 0 �� �Ԏ��Ǹ� 0���� �ڿ��� ���� ���
		
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
