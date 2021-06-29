import java.util.Scanner;

public class W3Q2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String str =input.nextLine();
		
		switch (str) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D":
			System.out.println("Effort");
			break;
		default :
			System.out.println("error");
			break;
		}

	}



}
