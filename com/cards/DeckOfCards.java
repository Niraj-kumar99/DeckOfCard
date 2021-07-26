package com.cards;

public class DeckOfCards {
	
	//arrays of cards 
	String[] suits = { "Diamond", "Heart", "Spades", "Club" };
	String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	
	
	String[][] cardDeck = new String[4][13];

	
	public void Deck() {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				cardDeck[i][j] = suits[i] + rank[j];
				System.out.println(cardDeck[i][j]);
			}
		}

	}
	public static void main(String[] args) {
		DeckOfCards deckofcards = new DeckOfCards();
		deckofcards.Deck();
		
	}

}
