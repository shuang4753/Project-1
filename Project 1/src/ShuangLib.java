
public class ShuangLib {
	

	public static String dateStr (String date) 
	{
		String mm = (date.substring(0,2)); //month number is found in index 0-2
		String dd = (date.substring(3,5)); //day number is found in index 3,5
		String yyyy= (date.substring(6,10)); //year number is found in index 6-10

				return (dd + "-" + mm + "-" + yyyy); //returns in a different format
	}
			
	
	public static String cutOut(String mainStr, String subStr) {
		String s1 = mainStr;
		int len= mainStr.length(); //make length of main string a variable
		
		String s2= subStr;
		int len2= subStr.length(); //make length of sub string a variable
		
		for (int x=0 ; x<=(len-len2); x++ ) { //for loop that keeps track of where the subStr is counting to-from
			
			if (s2.equals(s1.substring(x, len2+x))) { //if statement states when subStr is found within the mainStr
				return s1.substring(0,x) + s1.substring(len2+x); //all possible scenarios of where subStr is found and subtracted from mainStr
			}
		}
		
		return "try again";
	}
	
	
	public static String quadraticSolver(double a, double b, double c) {
		double D = (b*b -4*a*c); //make the discriminant  a variable
		double posZero = (-b + Math.sqrt(D)) *(.5 *a); //there are 2 solutions to a quadratic 
		double negZero = (-b - Math.sqrt(D)) *(.5 *a); //one that is added to the discriminant and one that is subtracted
		
		if (D >= 0) {
			return ("The roots of the equation,(" + a + "x^2 + " + b + "x + "+ c +"), are " + posZero + " and " + negZero); //"give the answer in English, not math" 
		}
		if (D < 0) {
			return ("This is imaginary");
			}
		return "haha I made a quadratic calculator :P";
	}

}
//done




	
	
