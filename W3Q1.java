import java.util.Scanner;

public class W3Q1 {

	public static void main(String[] args) {
		// ������ �Է¹޾� 0�̸� ���� ����� �÷��� ������ ���̳ʽ�
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �Է� �Ͻÿ�:");
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
