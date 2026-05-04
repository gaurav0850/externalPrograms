package org.example.tcscareers;

/**
 * Problem: Deck of Cards Game
 * You are given a deck of cards represented by an array of integers, where each integer denotes the value of a card.
 * Two players, Player A and Player B, play a game:
 * - Player A always picks the card from the front of the deck.
 * - Player B always picks the card from the back of the deck.
 * For each turn:
 * 1. If A's card value is greater than B's card value:
 * - Append '1' to the result.
 * - Remove only B's card from the deck.
 * <p>
 * 2. If B's card value is greater than A's card value:
 * - Append '2' to the result.
 * - Remove only A's card from the deck.
 * 3. If both card values are equal:
 * - Append 'O' to the result.
 * - Remove both cards from the deck.
 * The gaine continues until fewer than two cards remain.
 * Return the final result as a string representing the outcome of each turn.
 * <p>
 * Example 1
 * Input: deck = [5, 3, 7, 2]
 * Output: "122"
 * Explanation:
 * 5 vs 2 → 1 → remove 2
 * 5 vs 7 → 2 → remove 5
 * 3 vs 7 → 2 → remove 3
 * <p>
 * Example 2
 * Input: deck = [4, 6, 6, 4]
 * Output: "00"
 * Explanation:
 * 4 vs 4 - 0 → remove both
 * 6 vs 6 → 0 → remove both
 * Constraints
 * 1 <= deck.length <= 10^5
 * 0 <= deck[i] <= 10^9
 **/
public class PackOfDeck {
    public static void main(String[] args) {
        int[] input = new int[]{4, 6, 6, 4};
        System.out.println(calculate(input));

    }

    public static String calculate(int[] cards) {

        int numberOfCards = cards.length;

        if (cards.length < 2) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        int l = 0;
        int r = numberOfCards - 1;

        while(l<r) {
            if(cards[l]==cards[r]) {
                sb.append(0);
                l++;
                r--;
            } else if(cards[l]>cards[r]) {
                sb.append(1);
                r--;
            } else {
                sb.append(2);
                l++;
            }
        }
        return sb.toString();
    }
}
