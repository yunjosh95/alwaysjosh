import java.util.Scanner;

public class W3Q3 {

	public static void main(String[] args) {
		// 1번은 개 2번은 고양이 3번은 병아리
		// 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램
		// 해당번호 없으면 I don't know 라고 대답
		
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
