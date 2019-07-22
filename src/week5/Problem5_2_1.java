package week5;


public class Problem5_2_1 {
	//should i make it extends Rational
	public static void main(String[]args) {
		long i = 1;
		long t = 2;
		Rational obj = new Rational(0, 1);

		while (i <= 19) {
			obj = obj.add(new Rational(i, t));

			i++;
			t ++;
		}
		
		System.out.println(obj);
	}


}
//254554945/15519504
