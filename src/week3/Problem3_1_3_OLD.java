import java.util.Scanner;
public class Problem3_1_3_OLD {
	public static void sort2(int[]lst1, int[]lst2){
		int l = lst1.length + lst2.length -2;
		int[] lst3 = new int[l];
		System.arraycopy(lst1, 1, lst3, 0, lst1.length-1);
		int t = lst1.length;
		System.arraycopy(lst2, 1, lst3, t-1, lst2.length-1);
		
		int low = 0;
	
		//works without this upper loop that itterates high and low
		for (int high = 1; high < lst3.length; high++) {
			low = high - 1; 
		//
		for (int i = lst1.length-1; i < lst3.length; i++) {
			if (lst3[i] >= lst3[low] || lst3[i] <= lst3[high]) {
				int temp = lst3[high];
				lst3[high] = lst3[i];
				lst3[i] = -0;
				//move array one over
				int position = i;
				for (int b = (position - 1); b >= high; b--) {                
				    lst3[b+1] = lst3[b];
				}
				if (high != lst3.length-1) { 
					lst3[high+1] = temp; }
			
			}
			low ++;
			high++;
		}}
		for (int i = 0; i < lst3.length; i++) {
			System.out.print(lst3[i]); }
	}
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int [] numbers1 = new int [5];
		
		System.out.print("Enter the first list");
		for(int i = 0;;) {
			numbers1[i] = input.nextInt();
			i++;
			if (numbers1[0] == (i-1))
				break;  }
		
		int [] numbers2 = new int [6];
				
		System.out.print("Enter the first list");
		for(int i = 0;;) {
			numbers2[i] = input.nextInt();
			i++;
			if (numbers2[0] == (i-1))
				break;  }
		sort2(numbers1, numbers2);

}
}
