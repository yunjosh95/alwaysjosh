import java.util.Scanner;

public class W3Q3 {

	public static void main(String[] args) {
		// 1���� �� 2���� ����� 3���� ���Ƹ�
		// �Է��ϸ� ��ȣ�� �ش��ϴ� ������ ����� ����ϴ� ���α׷�
		// �ش��ȣ ������ I don't know ��� ���
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("number?");
		int number = input.nextInt();
		
		switch(number) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know");
			break;
		}

	}

}
