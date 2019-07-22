
public class Day2_1 {
	public static void main(String[]args) {
		int i = 'A'; //65
		char b = '\u0022'; 
		
		char c = '\u0030'; //0
		char h = '7'; //0, char can be a number but has to be only one digit/letter
		// \n inside quotes makes cursor go to new line
		
		//System.out.print("hello\n");
		//System.out.print("hi\u0008");
		
		//char test = '\u0004';		doesnt work?
		// prints This food tastes "funny"
		//System.out.print("This food tastes /"funny/" ");	doesnt work?
		
		//Strings are supposed to be mutable but are changes here
		String f = "polls";
		f = "wassup";
	
		//System.out.print(f);
		/////////
		
		char hellothis = 2;
		char letter = (char) ( 65 + hellothis); //A
		//char letter2 = '\u0042' + hellothis;
		System.out.println(letter);
	}
	public static void trig(String[]args) {
		int x2 = 1;
		int x3 = 2;
		int y2 = 4;
		int y3 = 8;
		//finds the distance between (x2,y2) and (x3,y3)
		double a = Math.sqrt((x2 - x3)* (x2 - x3) + (y2-y3)*(y2-y3) );
		String f = "polls";
		//f = "wassup";
		System.out.print(f);
		
		
	
		
	}

}
