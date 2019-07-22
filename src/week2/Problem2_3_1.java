import java.util.Scanner;
public class Problem2_3_1 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int i = input.nextInt();
		int result = reverse(i);
		boolean Pal = isPal(i, result);
		System.out.print(Pal);
		
	}
	
	public static int reverse (int i) {
		String numberString = Integer.toString(i);
		int l = numberString.length();
		String z = "";
		
		for (int in = 1; in <= l; in=in+1) {
			int v = l - in;
			z = z + numberString.charAt(v);
		}
		int reverse = Integer.parseInt(z);;
		return reverse;
	}
	public static boolean isPal (int num, int reverse) {
		if (num == reverse)
			return true;
		else 
			return false;
	}
}
//Please enter a number
//454
//true

//Please enter a number
//33333333
//true

//Please enter a number
//123625
//false

//Please enter a number
//1
//true

//Please enter a number
//3781
//false
