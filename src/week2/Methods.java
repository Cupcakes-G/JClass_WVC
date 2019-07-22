
public class Methods {
	public static void main(String[]args) {
		
		int z = sum(4,8);
		System.out.print(z);
	}
		

	//method
		//int is the return value type
		//int i1, int i2 are formal parameters; (int i1, int i2) is the parameter list
		//sum(int i1, int i2) is the method signature
		//public static int sum(int i1, int i2) is the header of the method
	public static int sum(int i1, int i2) {
		
			int total = 0;
			for (int i = i1; i<=i2; i++) {
				total += i;
			}
			return total;
	
	}
}
