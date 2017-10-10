
public class ShuangLib {
	
	public static String dateStr () {
		int dd = 1;
		int mm = 1;
		int yyyy= 0;
			
			if (dd>1 && dd<31)
		return dd + "-" + mm + "-" + yyyy;
		
	}
	
	public static String cutOut(String mainStr, String subStr) {
		String s1= mainStr;
		String s2= s1.substring(0,2);
		int len= s1.length();
		
		if (len>5)
			return s2;
		
	}
	
	public static double quadraticSolver(double x, int b, int m) {
		double y = 0;
		return y;
		
	}
	

}
