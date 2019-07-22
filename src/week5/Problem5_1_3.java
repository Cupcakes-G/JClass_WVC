import java.io.PrintWriter;
import java.util.*;

public class Problem5_1_3 {
	public static void main(String[]args) {
		java.io.File myFile = new java.io.File("Mueller_Report.txt");
		if(!myFile.exists()) {
			System.out.println("File already exisits. File will be overridden");
			//return here if you do not want to override
		}
		ArrayList<String> words = new ArrayList<String>();
		try {
			Scanner scnr = new Scanner(myFile);
		    while (scnr.hasNextLine()) {
		    	String s = scnr.next(); 
		    	s = s.replace(".", "");
		    	s = s.replace(",", "");
		    	s = s.replace(";", "");
		    	s = s.replace("?", "");
		    	s = s.replace("!", "");
		    	s = s.replace("(", "");
		    	s = s.replace(")", "");


		    	words.add(s);
		  	} 
		    for (int i = 0; i < words.size(); i++) {
				//System.out.println(words.get(i));

		    }
		    
		    
		}catch(Exception e){
			System.out.print(e.toString());
		}
		
		System.out.println("len: " + words.size());
		    int c1 = 0;
		    int c2 = 0;
		    int c3 = 0;
		    int c4 = 0;
		    int c5 = 0;
		    int c6 = 0;
		    int c7 = 0;
		    int c8 = 0;
		    int c9 = 0;
		    int c10 = 0;

			for (int i = 0; i < words.size(); i++) {
				//System.out.println(words.get(i));
				if ((words.get(i)).contentEquals("githika")) 
					c1 ++;
				if ((words.get(i)).contentEquals("obstruct")) 
					c2 ++;
				if ((words.get(i)).contentEquals("collude")) 
					c3 ++;
				if ((words.get(i)).contentEquals("Russia")) 
					c4 ++;
				if ((words.get(i)).contentEquals("indict")) 
					c5 ++;
				if ((words.get(i)).contentEquals("bribe")) 
					c6 ++;
				if ((words.get(i)).contentEquals("tamper")) 
					c7 ++;
				if ((words.get(i)).contentEquals("impeach")) 
					c8 ++;
				if ((words.get(i)).contentEquals("conspiracy")) 
					c9 ++;
				if ((words.get(i)).contentEquals("convict")) 
					c10 ++;
				
			}
			System.out.println("corrupt appears " + c1 + " times." );
			System.out.println("obstruct appears " + c2 + " times." );
			System.out.println("collude appears " + c3 + " times." );
			System.out.println("Russia appears " + c4 + " times." );
			System.out.println("indict appears " + c5 + " times." );
			System.out.println("bribe appears " + c6 + " times." );
			System.out.println("tamper appears " + c7 + " times." );
			System.out.println("impeach appears " + c8 + " times." );
			System.out.println("conspiracy appears " + c9 + " times." );
			System.out.println("convict appears " + c10 + " times." );

			

		


	}

}
