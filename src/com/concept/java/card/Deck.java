package com.concept.java.card;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/9/17
 * Time: 12:51 AM
 * To change this template use File | Settings | File Templates.
 */
/*
*   Shuffle a deck of cards
*   O(n) Time Complexity
* */

public class Deck {

    private static int NUMBER_OF_JOKER = 2;
    private static int NUMBER_OF_CARD = 52;
    private static int CARD_COUNT_IN_SUIT = 13;

    private Card deck[];

    public Deck(){
        this(false);
    }

    public Deck(boolean includeJoker){
        this(includeJoker?NUMBER_OF_JOKER: 0);
    }

    public Deck(int noOfJoker){
        if(noOfJoker > NUMBER_OF_JOKER)
            throw new IllegalArgumentException("Max number of joker can be "+ NUMBER_OF_JOKER);
        this.deck = new Card[NUMBER_OF_CARD+noOfJoker];
        int cardCount = 0;
        for(CardSuit suit : CardSuit.values()){
            if(!suit.equals(CardSuit.JOKER)){
                for(int card = 1; card<= CARD_COUNT_IN_SUIT; card++){
                    this.deck[cardCount] = new Card(card, suit);
                    cardCount++;
                }
            }
        }
        for(int i =0 ;i< noOfJoker;i++){
           this.deck[cardCount]= new Card(CARD_COUNT_IN_SUIT+i+1, CardSuit.JOKER);
            cardCount++;
        }
    }

    public void shuffle(){
        for(int index = this.deck.length-1; index>=0; index--){
            int rnIndex = (int)(Math.random()*(index+1));
            Card temp  = this.deck[index];
            this.deck[index] = this.deck[rnIndex];
            this.deck[rnIndex] = temp;
        }
    }

    public Card[] getDeck() {
        return this.deck;
    }

    public static void main(String args[]){
         Deck deck = new Deck(1);
        for(Card card  : deck.getDeck()){
            System.out.print(card.toString());
        }
        deck.shuffle();
        System.out.println();
        for(Card card  : deck.getDeck()){
            System.out.print(card.toString());
        }
    }

}
