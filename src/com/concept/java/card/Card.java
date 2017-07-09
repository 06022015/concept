package com.concept.java.card;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/9/17
 * Time: 12:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Card {

    private static int ACE = 1;
    private static int JACK = 11;
    private static int QUEEN = 12;
    private static int KING = 13;

    private final CardSuit suit;
    private final int value;

    public Card(){
        this.suit = CardSuit.JOKER;
        this.value = 0;
    }

    public Card(int value, CardSuit suit) {
        this.suit = suit;
        if(CardSuit.JOKER != suit && value < ACE && value> KING){
            throw new IllegalArgumentException("Invalud playing card value");
        }
        this.value = value;
    }


    public CardSuit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value=" + value +
                '}';
    }
}
