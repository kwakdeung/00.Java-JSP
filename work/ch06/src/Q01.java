import java.util.Scanner;

public class Q01
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = num1 - num2;
		if (result < 0)
		{
			result = result * -1;
		}
		
		System.out.printf("두 수의 차는 %d 입니다. \n", result);
		

	}

}
