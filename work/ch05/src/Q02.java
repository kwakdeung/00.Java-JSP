import java.util.Scanner;

public class Q02
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하고 엔터를 입력하세요.");
		int num1 = sc.nextInt();
		
		System.out.printf("%d의 제곱은 %d입니다. ",num1, num1 * num1);	

	}

}
