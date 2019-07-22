import java.util.Scanner;
public class W1Problem3_3 {

	public static void main(String[]args) {
		int card = (int) (Math.random()*52);
		String suit = "";
		int rank = card % 13;
		if (card >= 0 && card <= 12) {
			suit = new String("Spades");
		}
		else if (13 <= card && card <= 25) {
			suit = "Hearts";
		}
		else if (26 <= card && card <= 38) {
			suit = "Diamonds";
		}
		else if (39 <= card && card <= 51) {
			suit = "Clubs";
		}
		String rank1 = "";
		switch (rank) {
		case 0: rank1 = "Ace";
		break;
		case 1: rank1 = "2";
		break;
		case 2: rank1 = "3";
		break;
		case 3: rank1 = "4";
		break;
		case 4: rank1 = "5";
		break;
		case 5: rank1 = "6";
		break;
		case 6: rank1 = "7";
		break;
		case 7: rank1 = "8";
		break;
		case 8: rank1 = "9";
		break;
		case 9: rank1 = "10";
		break;
		case 10: rank1 = "Jack";
		break;
		case 11: rank1 = "Queen";
		break;
		case 12: rank1 = "King";
		break;
		}
		
		System.out.println("Your card is a " + rank1 + " of " + suit);
		System.out.println(card);
		
	}
}


//Your card is a King of Diamonds
//Your card is a 9 of Hearts
//Your card is a Ace of Clubs
//Your card is a Queen of Spades
//Your card is a Queen of Spades
//Your card is a Ace of Hearts
