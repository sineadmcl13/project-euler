package level3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * https://projecteuler.net/problem=67
 */

public class Problem67 {

	public static void main(String [] args){
		System.out.println(problem67());
	}


	public static int problem67(){

		int[][] numberTriangle = readNumberTriangle();

		for(int i=numberTriangle.length-1; i>0; i--){

			for(int j = 0; j<numberTriangle[i].length-1; j++){
				numberTriangle[i-1][j] = numberTriangle[i-1][j]+ Math.max(numberTriangle[i][j], numberTriangle[i][j+1]);
			}
		}

		return numberTriangle[0][0];
	}

	private static int[][] readNumberTriangle(){

		int [][] numberGrid = new int[100][];
		try (BufferedReader br = new BufferedReader(new FileReader("projectFiles/problem67.txt")))
		{
			String fileOfNumbers;
			int i =0;
			while ((fileOfNumbers = br.readLine()) != null) {
				//read in each line and split them by spaces
				numberGrid[i++] = convertStringArrayToInts(fileOfNumbers.split("\\s"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return numberGrid;
	}


	private static int[] convertStringArrayToInts(String [] stringArray){
		int [] intArray = new int [stringArray.length];

		for(int i=0; i<stringArray.length; i++){
			intArray[i] = Integer.valueOf(stringArray[i]);
		}

		return intArray;
	}
}

