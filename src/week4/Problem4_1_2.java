public class Problem4_1_2 {
	
	public static void main(String[]args) {
		Queue myQ = new Queue();
		for (int i = 0; i < 20; i++) {
			myQ.enqueue(i+1);
		}
		for (int i = 0; i < 20; i++) {
			int temp = myQ.dequeue();
			System.out.println(temp);
		}
		
	} // end main 
}


  class Queue {
	int [] elements ;
	int size ;
	static final int DEFAULT_CAPACITY = 8 ;
	
	public Queue() {
		this(DEFAULT_CAPACITY);
	}
	public Queue(int capacity) {
		elements = new int[capacity];
		size = 0;
	}
	
	//push
	public void enqueue(int v) {
		if (size >= elements.length) {
			
			int [] newArr = new int[elements.length * 2] ;
			for(int i = 0; i < elements.length; i++ ) { newArr[i] = elements[i]; }
			elements = newArr;
		}
		elements[size] = v;
		size += 1;	
	}
	
	
	//pop
	public int dequeue() {	
		int fifo = elements[0];
		for(int i = 0; i < this.size; i++) {
			elements[i] = elements[i + 1]; 
		}
		elements[size] = 0; // reset
		size -= 1; 
		return fifo;
	}
	
	//true if empty
	public boolean empty() {
		if (this.size == 0)
			return true;
		return false; 
	}
	//size
	public int size() {
		return this.size; 
	}
	
} // end of class Queue
  
//  1
//  2
//  3
//  4
//  5
//  6
//  7
//  8
//  9
//  10
//  11
//  12
//  13
//  14
//  15
//  16
//  17
//  18
//  19
//  20 
