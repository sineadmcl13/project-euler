package level1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 *  https://projecteuler.net/problem=22
 **/

public class Problem22 {

	public static void main(String [] args){
		System.out.println(problem22());
	}

	public static BigInteger problem22(){
		BigInteger totalNameScore = BigInteger.ZERO;

        ArrayList<String> listOfNames = readListOfNames();

        //sort the names in alphabetical order
        Collections.sort(listOfNames);

        //for each name in the listOfNames, calculate its score and add to the total
        for (int i=0; i<listOfNames.size();i++){
            int score = 0;

            for(char j : listOfNames.get(i).toCharArray()){
                score += j-'A'+1;
            }
            int nameScore = score * (i+1);

            totalNameScore=totalNameScore.add(BigInteger.valueOf(nameScore));

        }

        return totalNameScore;

	}

    public static ArrayList<String> readListOfNames(){
        ArrayList<String> listOfNames = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader("projectFiles/problem22.txt"))) {

            String fileOfNames;
            String[] names = {};
            while ((fileOfNames = br.readLine()) != null) {
                names = fileOfNames.split(",");
            }

            //remove quotes from names and add to the arrayList
            for (String s : names) {
                s = s.replaceAll("^\"|\"$", "");
                listOfNames.add(s);
            }

            return listOfNames;

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<String>();
        }

    }

	
}
