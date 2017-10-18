
public class NhuynhLib {


	public static boolean isPalindrome(String a)
	{
		
		int left = 0;
		int right = a.length() - 1;
			while (left < right)
				if ((a.charAt(left ++)) == (a.charAt(right--)))
					return true;
			return false;
					
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
		{
		int x = 0;
		while (a >= 1);
			a = a+x;
			 x++;
	}
	 ;
}
}

