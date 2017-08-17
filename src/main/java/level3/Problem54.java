package level3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://projecteuler.net/problem=54
 * */

public class Problem54 {

	public static void main(String[] args){
	    System.out.print(problem54());
	}


    public static int problem54(){

        List<String> games = returnGamesFromFile();

        int count = 0;

        for(String s :games){
            List<String> player1 = new ArrayList<>();
            List<String> player2 = new ArrayList<>();
            String [] cards = s.split(" ");

            player1.addAll(Arrays.asList(cards).subList(0, 5));
            player2.addAll(Arrays.asList(cards).subList(5, 10));


            int player1Hand = PokerHands.handLabel(player1);
            int player2Hand = PokerHands.handLabel(player2);

            count += workOutWhoWon(player1, player2, player1Hand, player2Hand);
        }

        return count;

    }



    private static List<String> returnGamesFromFile(){

        List<String> games = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("projectFiles/problem54.txt")))
        {
            String fileOfPoker;
            while ((fileOfPoker = br.readLine()) != null) {
                //read in names and split them by commas
                games.add(fileOfPoker);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return games;
    }


    private static int workOutWhoWon(List<String> player1, List<String> player2, int player1Hand, int player2Hand) {
        if(player1Hand>player2Hand){
            return 1;
        }else if (player1Hand==player2Hand){
            if(player1Hand==1){
                if(PokerHands.returnHighCard(player1)>PokerHands.returnHighCard(player2)){
                    return 1;
                }
            }else if(player1Hand==2){
                if(PokerHands.returnPairHighCard(player1)>PokerHands.returnPairHighCard(player2)){
                    return 1;
                }
            }

        }
        return 0;
    }

}

