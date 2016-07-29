package edu.ucsb.cs56.projects.games.poker;

import java.io.Serializable;
import java.util.*;


/**
   Class that represents a poker player
*/
public class Player implements Serializable {
    private Hand pokerHand;
    private int chips;
    private int wins;
    public PokerGame delegate;

    /**
     * Creates a Poker player with a designated number of chips
     * @param int number of chips, the Deck of Cards
     */
    public Player(int chips, Deck deck) {
	this.pokerHand = new Hand(deck);
        this.chips = chips;
        this.wins = 0;
    }

    /**
     * Get Player's Hand
     * @return Hand
     */
    public Hand getHand() {
        return pokerHand;
    }

    /**
     * Get Player's Chips
     * @return int
     */
    public int getChips() {
        return chips;
    }

    /**
     * Set number of chips player has
     * @param chips number of chips to give to player
     */
    // Might never need to be used---Check later
    public void setChips(int chips) {
        this.chips = chips;
    }

    /**
     * Get number of player wins
     * @return int type
     */
    public int getWins() {
        return wins;
    }

    /**
     * Increment player's wins by one
     */
    public void win() {
        wins += 1;
    }

    /**
     * Bet chips
     * @param _chips number of chips to bet
     * @return int type: number of chips bet
     */
    public void bet(int chipsBet) {
        if (chipsBet <= 0)
	    ; // Assert an Error "Not Valid"
	else if (chipsBet > chips)
	    ; // Assert an Error "Not Enough Chips"
	else
	    chips -= chipsBet;
    }

    /**
     * Fold hand, calls delegate fold method
     */
    // Might never need to be used---Check later
    public void foldHand() {
        delegate.fold();
    }
}