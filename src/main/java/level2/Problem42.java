package level2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=42
 * */

public class Problem42 {

	public static void main(String[] args){
        System.out.println(problem42());
	}


    public static int problem42(){

        ArrayList<Double> triangleNumbers = getTriangleNumbers();

        int count =0;
        try (BufferedReader br = new BufferedReader(new FileReader("projectFiles/problem42.txt")))
        {

            String fileOfWords;
            String[] words = {};
            while ((fileOfWords = br.readLine()) != null) {
                //read in names and split them by commas
                words = fileOfWords.split(",");
            }

            //remove quotes from names and add to the arrayList
            for(String s :words){
                s = s.replaceAll("^\"|\"$", "");
                if(triangleNumbers.contains((double) returnNumberScore(s))){
                    count++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;

    }


    public static ArrayList<Double> getTriangleNumbers(){
        ArrayList<Double> triangleNumbers = new ArrayList<Double>();

        for (double n =1; n< 20; n++){
            triangleNumbers.add((n/2)*(n+1));
        }

        return triangleNumbers;
    }

	public static int returnNumberScore(String word){
		int score = 0;

		for(char j : word.toCharArray()){
			score += j-'A'+1;
		}
		return score;
	}

}
