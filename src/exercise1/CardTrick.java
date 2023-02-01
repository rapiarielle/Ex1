

package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Arielle Kaye Rapi
 * @author Jan 25, 2022 
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];
        
        for(int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random() * 13) + 1);//card.setValue(insert call to random number generator here)
            card.setSuit(Card.SUITS[(int) (Math.random()*4)]);//card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i] = card;
            System.out.println("Value: " + card.getValue()+ " Suits: " + card.getSuit());
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        System.out.print("Enter card value: ");
        int value = input.nextInt();
        System.out.print("Enter card suit: ");
        String suit = input.next();
        
        for(int i = 0; i < hand.length; i++){
            
        if(value == hand[i].getValue() && suit.equals(hand[i].getSuit())){
            printInfo();
                
        }
            }
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Arielle, but you can call me Kaye, Yelle or Ari");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Coding");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Playing Billiards");

        System.out.println();
        
    
    }

}
//I am DONE!