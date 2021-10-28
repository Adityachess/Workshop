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
		System.out.println("\nNumber of cards in the deck is : " + numOfCards);
		for (int i = 0; i < ranks.length; i++) { 
			for (int j = 0; j < suits.length; j++) { 
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
	 * In this we have to define no of players should be minimum 2 and maximum 4.
	 */
	public void noOfPlayers() {
		System.out.print("\nEnter number of players minimum 2 , maximum 4 : ");
		int player = scanner.nextInt();
		if (player >= 2 && player <= 4) {
			System.out.println("\n" + player + " players will play the game");
			sequenceOfPlay(player);
		} else {
			System.out.println("Please enter number of players in the Range");
			noOfPlayers();
		}
		scanner.close();
	}

	/**
	 * In this method we have defined the sequence of the player.
	 */
	public void sequenceOfPlay(int player) {
		System.out.println("\nSequence of cards are below : ");
		for (int i = 1; i <= player; i++) {
			System.out.println("\nPlayer " + i + " Getting card.............");
			toshuffle(cardsDeck);
		}
	}

	/**
	 * Created a method to shuffle the cards.
	 */
	public static void toshuffle(ArrayList<String> cardsDeck) {
		System.out.println("shuffling the cards before Distribution");
		ArrayList<String> temp = new ArrayList<String>();
		while (!cardsDeck.isEmpty()) {
			int loc = (int) (Math.random() * cardsDeck.size());
			temp.add(cardsDeck.get(loc));
			cardsDeck.remove(loc);
		}
		cardsDeck = temp;
		toDisplay(cardsDeck);
	}

	/**
	 * Created a method for equal distribution of cards. Every player will be
	 * distributed 9 cards.
	 */
	public static void cardDistribution(ArrayList<String> cardsDeck, int player) {
		for (int i = 0; i < player; i++) {
			System.out.print("\nPlayer " + (i + 1) + " got cards:\n");
			for (int j = 0; j < 9; j++) {
				System.out.print("\t" + cardsDeck.get(i + j * player));
			}
		}
		System.out.println();
	}
}