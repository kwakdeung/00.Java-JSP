import java.util.Arrays;

public class Ex14_ArraySort // 사전순 배열 - 1,2,3,4... , 가,나,다... 
{
	public static void main(String[] args) 
	{
		int[] arr1 = {1, 3, 2, 4};
		double[] arr2 = {4.4, 3.3, 2.2, 1.1};
		String[] arr3 = {"홍길동", "전우치", "손오공", "멀린"};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		for (int n : arr1)
			System.out.print(n + "\t");
		System.out.println();
		
		for (double d : arr2)
			System.out.print(d + "\t");
		System.out.println();
		
		for (String s : arr3)
			System.out.print(s + "\t");
		System.out.println();
	}
}
