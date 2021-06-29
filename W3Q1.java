import java.util.Scanner;

public class W3Q1 {

	public static void main(String[] args) {
		// 정수를 입력받아 0이면 제로 양수면 플러스 음수면 마이너스
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력 하시오:");
		int x;
		x = input.nextInt();
		
		if(x==0) 
		{System.out.println("zero");
		}
		else if(x > 0)
		{System.out.println("plus");
		}
		else
		{System.out.println("minus");
		}
		

}


}
