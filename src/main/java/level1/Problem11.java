package level1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=11
 **/

public class Problem11 {

    public static void main(String [] args){
        System.out.println(problem11());
    }


    public static BigInteger problem11(){
        String [][] numberGrid = generateNumberGrid();

        BigInteger rightLeft = generateMaxLeftRightNum(numberGrid);
        BigInteger upDown = generateMaxUpDownNum(numberGrid);
        BigInteger topLeftDiagonal = generateTopLeftDiagonal(numberGrid);
        BigInteger bottomLeftDiagonal = generateBottomLeftDiagonal(numberGrid);

        BigInteger maxProduct = BigInteger.ZERO;

        if(maxProduct.compareTo(rightLeft)==-1)
            maxProduct=rightLeft;
        if(maxProduct.compareTo(upDown)==-1)
            maxProduct=upDown;
        if(maxProduct.compareTo(topLeftDiagonal)==-1)
            maxProduct=topLeftDiagonal;
        if(maxProduct.compareTo(bottomLeftDiagonal)==-1)
            maxProduct=bottomLeftDiagonal;

        return maxProduct;
    }


    public static String[][] generateNumberGrid(){
        String [][] numberGrid = new String[20][];
        try (BufferedReader br = new BufferedReader(new FileReader("projectFiles/problem11.txt")))
        {
            String fileOfNumbers;
            int i =0;
            while ((fileOfNumbers = br.readLine()) != null) {
                //read in each line and split them by spaces
                numberGrid[i++] = fileOfNumbers.split("\\s");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberGrid;
    }


    public static BigInteger generateMaxLeftRightNum(String [][] numberGrid){
        BigInteger maxNum = BigInteger.ZERO;

        for(int i =0; i<numberGrid.length; i++){

            for(int j =0; j<=16; j++){
                BigInteger product = new BigInteger(numberGrid[i][j])
                        .multiply(new BigInteger(numberGrid[i][j+1]))
                        .multiply(new BigInteger(numberGrid[i][j+2]))
                        .multiply(new BigInteger(numberGrid[i][j+3]));

                if(product.compareTo(maxNum)==1) maxNum=product;
            }
        }
        return maxNum;
    }

    public static BigInteger generateMaxUpDownNum(String [][] numberGrid){
        BigInteger maxNum = BigInteger.ZERO;

        for(int i =0; i<=16; i++){
            for(int j =0; j<numberGrid[0].length; j++){

                BigInteger product = new BigInteger(numberGrid[i][j])
                        .multiply(new BigInteger(numberGrid[i+1][j]))
                        .multiply(new BigInteger(numberGrid[i+2][j]))
                        .multiply(new BigInteger(numberGrid[i+3][j]));

                if(product.compareTo(maxNum)==1) maxNum=product;
            }
        }
        return maxNum;
    }

    public static BigInteger generateTopLeftDiagonal(String [][] numberGrid){
        BigInteger maxNum = BigInteger.ZERO;

        for(int i =0; i<=16; i++){
            for(int j=0; j<=16; j++){

                BigInteger product = new BigInteger(numberGrid[i][j])
                        .multiply(new BigInteger(numberGrid[i+1][j+1]))
                        .multiply(new BigInteger(numberGrid[i+2][j+2]))
                        .multiply(new BigInteger(numberGrid[i+3][j+3]));

                if(product.compareTo(maxNum)==1) maxNum=product;
            }
        }
        return maxNum;
    }

    public static BigInteger generateBottomLeftDiagonal(String [][] numberGrid){
        BigInteger maxNum = BigInteger.ZERO;

        for(int i =numberGrid.length-1; i>=3; i--){
            for(int j=0; j<=16; j++){

                BigInteger product = new BigInteger(numberGrid[i][j])
                        .multiply(new BigInteger(numberGrid[i-1][j+1]))
                        .multiply(new BigInteger(numberGrid[i-2][j+2]))
                        .multiply(new BigInteger(numberGrid[i-3][j+3]));

                if(product.compareTo(maxNum)==1) maxNum=product;
            }
        }
        return maxNum;
    }

}
