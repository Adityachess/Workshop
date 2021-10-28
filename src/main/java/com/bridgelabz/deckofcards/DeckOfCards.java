package com.bridgelabz.deckofcards;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {

	public static final Scanner scanner = new Scanner(System.in);
	public ArrayList<String> cardsDeck = new ArrayList<>();

	public void welcome() {
		System.out.println("Welcome to the gaming world of Deck of Cards");
	}

	/**
	 * In this method we have initialized the size of cards.
	 */

	public void deckOfCards() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		int numOfCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck:" + numOfCards);
		for (int i = 0; i < ranks.length; i++) { // First we have to iterate for loop for ranks starting from index 0.
			for (int j = 0; j < suits.length; j++) { // Now we have to itreate the suits for all the indexes of ranks
				cardsDeck.add(ranks[i] + "----->" + suits[j]);
			}
		}
		toDisplay(cardsDeck);
	}

	/**
	 * Created a display method to print the array list of cardsDeck.
	 */

	public static void toDisplay(ArrayList<String> cardsDeck) {
		System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}

	/**
	 * In this we have defined no of players should be minimum 2 and maximum 4.
	 */

	public void noOfPlayers() {
		System.out.print("\nEnter number of players minimum 2 , maximum 4 : ");
		int player = scanner.nextInt();
		if (player >= 2 && player <= 4) {
			System.out.println("\n" + player + " players will play the game");
		} else {
			System.out.println("Please enter number of players in the Range");
			this.noOfPlayers();
			scanner.close();
		}
	}
}