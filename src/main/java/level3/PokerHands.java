package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://projecteuler.net/problem=54
 *
 */

class PokerHands {

    private static  List<String> cardOrder =  new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"));

    private static Comparator<String> handCompare = (card1, card2) -> {

        String cardNum1 = card1.substring(0,1);
        String cardNum2 = card2.substring(0,1);

        if(cardOrder.indexOf(cardNum1)>cardOrder.indexOf(cardNum2)){
            return 1;
        }else if (cardOrder.indexOf(cardNum1)<cardOrder.indexOf(cardNum2)){
            return -1;
        }else if (cardOrder.indexOf(cardNum1)==cardOrder.indexOf(cardNum2)){
            return 0;
        }

        return  0;
    };


    private static int HIGH_CARD = 1;
    private static int ONE_PAIR =2;
    private static int TWO_PAIR =3;
    private static int THREE_OF_A_KIND = 4;
    private static int STRAIGHT = 5;
    private static int FLUSH = 6;
    private static int FULL_HOUSE = 7;
    private static int FOUR_OF_A_KIND = 8;
    private static int STRAIGHT_FLUSH = 9;
    private static int ROYAL_FLUSH = 10;


    public static int handLabel(List<String> hand){
        Collections.sort(hand, handCompare);
        String [] card = new String[5];
        String [] suit = new String[5];

        for(int i =0; i<5; i++){
           card[i]=hand.get(i).substring(0,1);
           suit[i]=hand.get(i).substring(1);
        }

        if(checkIfRoyalFlush(card, suit)){
            return ROYAL_FLUSH;
        }
        else if(checkIfStraightFlush(card, suit)){
            return STRAIGHT_FLUSH;
        }
        else if(checkIfFourOfAKind(card)){
            return FOUR_OF_A_KIND;
        }
        else if(checkIfFullHouse(card)){
            return FULL_HOUSE;
        }
        else if(checkIfFlush(suit)){
            return FLUSH;
        }
        else if(checkIfStraight(card)){
            return STRAIGHT;
        }
        else if(checkIfThreeOfKind(card)){
            return THREE_OF_A_KIND;
        }
        else if(checkIfTwoPair(card)){
            return TWO_PAIR;
        }
        else if(checkIfOnePair(card)){
            return ONE_PAIR;
        }
        return HIGH_CARD;
    }

    private static boolean checkIfRoyalFlush(String [] card, String [] suit){
        //Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.
        for(String s : suit){
            if(!s.equals(suit[0])){
                return false;
            }
        }
        String [] order = {"T","J","Q","K","A"};

        for(int i=0; i<5; i++){
            if(!card[i].equals(order[i])){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfStraightFlush(String [] card, String [] suit){
        //Straight Flush: All cards are consecutive values of same suit.
        for(String s : suit){
            if(!s.equals(suit[0])){
                return false;
            }
        }
        int temp = cardOrder.indexOf(card[0]);
        for(int i=1; i<5; i++){
            if(cardOrder.get(temp+1).equals(card[i])){
                temp++;
            }else{
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfFourOfAKind(String [] card){
        //Four of a Kind: Four cards of the same value.

        String temp = card[0];
        int count = 1;
        for(int i=1; i<5; i++){
            if(card[i].equals(temp)){
                count++;
            }

            if(count==4){
                return true;
            }
        }
        temp = card[1];
        count = 1;
        for(int i=2; i<5; i++){
            if(!card[i].equals(temp)){
                break;
            }
            count++;
            if(count==4){
                return true;
            }
        }

        return false;
    }

    private static boolean checkIfFullHouse(String [] card){
        //Full House: Three of a kind and a pair.
        int numToStartCheck =0;
        int numOfCardsNeeded=0;
        String temp = card[0];
        int count = 1;
        for(int i=1; i<5; i++){
            if(card[i].equals(temp)){
                count++;
            }
            if(count==3){
                numToStartCheck=3;
                numOfCardsNeeded=2;
                break;
            }
            if(count==2){
                numToStartCheck=2;
                numOfCardsNeeded=3;
            }

        }
        temp = card[numToStartCheck];
        count = 1;
        for(int i=numToStartCheck+1; i<5; i++){
            if(!card[i].equals(temp)){
                break;
            }
            count++;
            if(count==numOfCardsNeeded){
                return true;
            }
        }

        return false;
    }

    private static boolean checkIfFlush(String [] suit){
        //Flush: All cards of the same suit.
        for(String s : suit) {
            if (!s.equals(suit[0])) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfStraight(String [] card){
        //Straight: All cards are consecutive values
        int temp = cardOrder.indexOf(card[0]);
        for(int i=1; i<5; i++){
            if(cardOrder.get(temp+1).equals(card[i])){
                temp++;
            }else{
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfThreeOfKind(String [] card){
        //Three of a Kind: Three cards of the same value.

        for(int i=0; i<5; i++){
            String temp = card[i];
            int count = 1;
            for(int j=i+1; j<5; j++) {
                if (card[j].equals(temp)) {
                    count++;
                }
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkIfTwoPair(String [] card){
        //Two Pairs: Two different pairs.
        boolean foundOnePair = false;
        for(int i=0; i<5; i++){
            String temp = card[i];
            int count = 1;
            for(int j =i+1; j<5; j++){
               if(card[j].equals(temp)){
                   count++;
               }
               if(count==2){
                   if(foundOnePair){
                       return true;
                   }
                   else {
                       foundOnePair=true;
                       break;
                   }
               }

            }

        }
        return false;
    }

    private static boolean checkIfOnePair(String [] card){
        //One Pair: Two cards of the same value.

        for(int i=0; i<5; i++){
            String temp = card[i];
            int count =1;
            for(int j =i+1; j<5; j++){
                if(card[j].equals(temp)){
                    count++;
                }
                if(count==2){
                    return true;
                }
            }
        }
        return false;
    }

    static int returnHighCard(List<String> hand){
        Collections.sort(hand, handCompare);
        String [] card = new String[5];

        for(int i =0; i<5; i++){
            card[i]=hand.get(i).substring(0,1);
        }

        return cardOrder.indexOf(card[4]);

    }

    static int returnPairHighCard(List<String> hand){
        //One Pair: Two cards of the same value.
        Collections.sort(hand, handCompare);
        String [] card = new String[5];
        for(int i =0; i<5; i++){
            card[i]=hand.get(i).substring(0,1);
        }

        for(int i=0; i<5; i++){
            String temp = card[i];
            int count =1;
            for(int j =i+1; j<5; j++){
                if(card[j].equals(temp)){
                    count++;
                }
                if(count==2){
                    return cardOrder.indexOf(card[j]);
                }
            }
        }
        return 0;
    }

}

