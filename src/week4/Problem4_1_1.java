import java.util.Scanner;
public class Problem4_1_1 {
	public static void main(String[]args) {
		
		StackOfIntegers stack = new StackOfIntegers();
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		int num  = input.nextInt();
	 
		
		// ******** ------ prime start ---------
        // Print the number of 2s that divide n 
        while (num % 2==0) 
        { 
            stack.push(2); //System.out.print(2 + " "); 
            num  /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(num ); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (num % i == 0) 
            { 
            	stack.push(i); // System.out.print(i + " "); 
                num  /= i; 
            } 
        } 
  
        // This condition is to handle the case when 
        // n is a prime number greater than 2 
        if (num  > 2) 
        	stack.push(num); //  System.out.print(num );      
        // ******** ------ prime end ---------
        
        while(!stack.empty()) {
        	System.out.print(stack.pop() + " ");
        }
        
    }  // end main
	
}  // end class	
	
class StackOfIntegers {
		  private int[] elements;
		  private int size;
		  public static final int DEFAULT_CAPACITY = 16;

		  /** Construct a stack with the default capacity 16 */
		  public StackOfIntegers() {
		    this(DEFAULT_CAPACITY);
		  }

		  /** Construct a stack with the specified maximum capacity */
		  public StackOfIntegers(int capacity) {
		    elements = new int[capacity];
		  }

		  /** Push a new integer into the top of the stack */
		  public void push(int value) {
		    if (size >= elements.length) {
		      int[] temp = new int[elements.length * 2];
		      System.arraycopy(elements, 0, temp, 0, elements.length);
		      elements = temp;
		    }

		    elements[size++] = value;
		  }

		  /** Return and remove the top element from the stack */
		  public int pop() {
		    return elements[--size];
		  }

		  /** Return the top element from the stack */
		  public int peek() {
		    return elements[size - 1];
		  }

		  /** Test whether the stack is empty */
		  public boolean empty() {
		    return size == 0;
		  }

		  /** Return the number of elements in the stack */
		  public int getSize() {
		    return size;
		  }
		  
}  // end StackofIntegers

// Enter a positive integer:120
// 5 3 2 2 2 
	
