import java.util.Scanner;

public class W7Q8 {

	public static void main(String[] args) {
		// 5개의 단어를 입력받아 모든 단어를 입력받은 역순으로 출력하는 프로그램 작성. 단어 길이는 30이하

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
