
public class Problem2_2_2 {
	public static void main(String[]args) {
		//for 10000
		double r = 0;
		for (int i = 1; i <= 10000; i=i+1) {
			double t = i + 1.0;
			r = r + (Math.pow((-1), t)/ (2.0*i -1.0));
		}
		r = r * 4;
		System.out.println(r);
		
		//for 20000
		double r1 = 0;
		for (int i = 1; i <= 20000; i=i+1) {
			double t = i + 1.0;
			r1 = r1 + (Math.pow((-1), t)/ (2.0*i -1.0));
		}
		r1 = r1 * 4;
		System.out.println(r1);
		
		//for 100000
		double r2 = 0;
		for (int i = 1; i <= 100000; i=i+1) {
			double t = i + 1.0;
			r2 = r2 + (Math.pow((-1), t)/ (2.0*i -1.0));
		}
		r2 = r2 * 4;
		System.out.println(r2);
	}
}

//3.1414926535900345
//3.1415426535898248
//3.1415826535897198