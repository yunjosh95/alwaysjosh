import java.util.Scanner;

public class W4Q2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int sum = 0;
		
		for(int i=x;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
