
import java.io.PrintWriter;
import java.util.*;

public class Problem5_1_2 {
	public static void main(String[]args) {
		
		java.io.File myFile = new java.io.File("Execise12_15.txt");

		if(myFile.exists()) {
			System.out.println("File already exisits. File will be overridden");
			//return here if you do not want to override
		}
		int[] nums = new int [100];

		try { 		
			PrintWriter writer = new PrintWriter(myFile); 
		    for (int i = 0; i < 100 ; i++) {
		    	writer.print((int)(Math.random()*100) + " ");			    
		    }
		    writer.close ();
		    
		    // Read from the file 
		    Scanner scnr = new Scanner(myFile);   
		    int count = 0;
		    while (count < 100) {
		    	String s = scnr.next(); 
		    	int t = Integer.parseInt(s);
		    	nums[count] = t;
		    	count++;
		  	} 
		    Arrays.sort(nums);
		    for (int i = 0; i < 100; i++) {
		    	System.out.println(nums[i]);
		    }
		}
		catch(Exception e) {
			System.out.print(e.toString());
		}
			
		
	}  //end main
	
} //end class

//File already exisits. File will be overridden
//5
//6
//6
//7
//7
//9
//9
//9
//10
//11
//11
//12
//12
//13
//13
//14
//15
//15
//17
//18
//21
//23
//23
//26
//27
//27
//29
//30
//30
//34
//34
//34
//35
//35
//36
//36
//39
//40
//40
//41
//41
//41
//42
//43
//44
//47
//49
//50
//51
//51
//51
//51
//52
//52
//53
//54
//55
//55
//56
//56
//57
//61
//62
//62
//62
//64
//64
//65
//67
//68
//68
//70
//70
//70
//74
//75
//75
//76
//77
//78
//79
//81
//81
//81
//81
//85
//85
//85
//87
//88
//89
//90
//90
//90
//91
//93
//93
//94
//96
//98

