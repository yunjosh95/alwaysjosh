import java.util.Scanner;

public class W7Q8 {

	public static void main(String[] args) {
		// 5���� �ܾ �Է¹޾� ��� �ܾ �Է¹��� �������� ����ϴ� ���α׷� �ۼ�. �ܾ� ���̴� 30����

		Scanner sc =new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.next();
		}
		for(int i =4; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}

}
