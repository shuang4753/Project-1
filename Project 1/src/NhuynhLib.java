
public class NhuynhLib {


	public static String isPalindrome(String a)
	{
		
		int left = 0;
		int right = a.length() - 1;
			while (left < right)
				if ((a.charAt(left ++)) == (a.charAt(right--)))
					return a;
			return "not a palindrome";
					
	}	
	
	public static boolean isFibonacci(int a)
	{
		int n1 = 0;
		int n2 = 1;
		int n3 = 1;
			while (n3 < a)
			{
				n3 = n2 + n1;
				n1 = n2;
				n2 = n3;
			}
				if (n3 == a )
					return true;
				else 
					return false;
	}

	public static int sumUpTo(int a)
	{	
		while (a > 0) {
			int sum = (a*(a+1))/2;
		}
		
		System.out.print(sum);
	}
}

