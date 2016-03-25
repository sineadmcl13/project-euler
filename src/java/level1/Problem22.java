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

		ArrayList<String> listOfNames = new ArrayList<String>();
		BigInteger totalNameScore = new BigInteger("0");
		

		try (BufferedReader br = new BufferedReader(new FileReader("projectFiles/problem22.txt")))
		{
 
			String fileOfNames;
			String [] names = {};
			while ((fileOfNames = br.readLine()) != null) {
				//read in names and split them by commas
				names = fileOfNames.split(",");
			}
			
			//remove quotes from names and add to the arrayList
			for(String s :names){
				s = s.replaceAll("^\"|\"$", "");
				listOfNames.add(s);
			}
			
			//sort the names in alphabetical order
			Collections.sort(listOfNames);

			//for each name in the listOfNames, calculate its score and add to the total
			
			for (int i=0; i<listOfNames.size();i++){
				int score = 0;
//				System.out.println(listOfNames.get(i));
				
				for(char j : listOfNames.get(i).toCharArray()){
					score += j-'A'+1;
				}
//				System.out.println(score);
				int nameScore = score * (i+1);
				
				totalNameScore=totalNameScore.add(new BigInteger(String.valueOf(nameScore)));
				
			}
			
			System.out.println(totalNameScore);

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
	
}
