abstract class Unit	// 부모 클래스
{
	abstract void doMove();		// 추상 클래스
}

class Marine extends Unit	// 자식 클래스
{
	void doMove()	// 추상 클래스 구현
	{
		System.out.println("마린은 두 발로 이동합니다.");
	}
}

class Zergling extends Unit	// 자식 클래스
{
	void doMove()	// 추상 클래스 구현
	{
		System.out.println("저글링은 네 발로 이동합니다.");
	}
}

public class MyStarcraft
{

	public static void main(String[] args)
	{
		Marine unit1 = new Marine();
		unit1.doMove();
		
		Zergling unit2 = new Zergling();
		unit2.doMove();
	}
}
