package level1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem18 {

	public static void main(String [] args){
		System.out.println(problem18());
	}


	public static int problem18(){

		int[][] numberTriangle = readNumberTriangle();

        for(int i=numberTriangle.length-1; i>0; i--){

            for(int j = 0; j<numberTriangle[i].length-1; j++){
                numberTriangle[i-1][j] = numberTriangle[i-1][j]+ Math.max(numberTriangle[i][j], numberTriangle[i][j+1]);
			}
        }

        return numberTriangle[0][0];
	}

	public static int[][] readNumberTriangle(){

		int [][] numberGrid = new int[15][];
		try (BufferedReader br = new BufferedReader(new FileReader("projectFiles/problem18.txt")))
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


	public static int[] convertStringArrayToInts(String [] stringArray){
		int [] intArray = new int [stringArray.length];

		for(int i=0; i<stringArray.length; i++){
			intArray[i] = Integer.valueOf(stringArray[i]);
		}

		return intArray;
	}
}
