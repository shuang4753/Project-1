
public class ControlStructure {
	public static void isPalindrome()
	{
		
	}
	public static boolean isFibonacci(int a)
	{
		int first = 0;
		int sec = 1;
		int third = 1;
			while (third < a)
			{
				third = sec + first;
				first = sec;
				sec = third;
			}
				if (third == a )
					return true;
				else 
					return false;
	}
	public static void sumUpTo()
	{
		
	}
}
