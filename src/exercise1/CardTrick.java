package exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 
 * @author Swapnil Ramani Feb 02, 2024
 */
public class CardTrick {
    public static void main(String[] args) {
        Card[] hand = new Card[7];

        // Create a hand of 7 cards with random values and suits
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomValue());
            card.setSuit(Card.SUITS[generateRandomSuitIndex()]);
            hand[i] = card;
        }

        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of the card (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter the suit of the card (Hearts-0, Diamonds-1, Spades-2, Clubs-3): ");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search the hand for the user's card
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // If the guess is successful, invoke the printInfo() method
        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }
    }

    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

        private static int generateRandomValue() {
        // Generates a random value between 1 and 13 (inclusive)
        Random random = new Random();
        return random.nextInt(13) + 1;
    }

    private static int generateRandomSuitIndex() {
        // Generates a random index for the SUITS array (0 to 3)
        Random random = new Random();
        return random.nextInt(4);
    }
    

}
