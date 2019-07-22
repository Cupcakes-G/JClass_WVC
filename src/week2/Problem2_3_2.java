
public class Problem2_3_2 {
	public static void main(String[]args) {
		int i = 0;
		while (i < 9) {
		int dice1 = (int) (Math.random() * 6 + 1); 
		int dice2 = (int) (Math.random() * 6 + 1); 
		int sum = dice1 + dice2;
		String roll = result(sum, dice1, dice2);
		if (roll == "You lose") {
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
			System.out.println(roll); 
			break;
			}
		else if (roll == "You win") {
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
			System.out.println(roll); 
			break;
		    }
		else if (roll == "point is ") {
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
			System.out.println(roll + sum); 
			}
		}


		

	
	}
	public static String result(int sum, int dice1, int dice2) {
		if (sum == 2 || sum == 3 || sum == 12 || sum == 7)
			return ("You lose");
		else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10)
			return ("point is ");
		else 
			return ("You win");
	}

}

//You rolled 1 + 4 = 5
//point is 5
//You rolled 2 + 5 = 7
//You lose

//You rolled 4 + 3 = 7
//You lose

//You rolled 6 + 3 = 9
//point is 9
//You rolled 6 + 3 = 9
//point is 9
//You rolled 4 + 4 = 8
//point is 8
//You rolled 1 + 6 = 7
//You lose

//You rolled 1 + 5 = 6
//point is 6
//You rolled 5 + 5 = 10
//point is 10
//You rolled 5 + 5 = 10
//point is 10
//You rolled 3 + 3 = 6
//point is 6
//You rolled 1 + 4 = 5
//point is 5
//You rolled 6 + 5 = 11
//You win

//You rolled 5 + 6 = 11
//You win

