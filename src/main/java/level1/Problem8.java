package level1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *  https://projecteuler.net/problem=8
 **/

public class Problem8 {

    public static void main(String [] args){
        System.out.println(problem8());
    }

    public static long problem8(){
        char[] num = readNumberFromFile().toCharArray();
        long maxProduct = 0;

        for(int i = 0; i<num.length-13; i++){
            long product = 1;
            for(int j=0; j<13; j++){
                product*=Character.getNumericValue(num[j+i]);
            }
            if(product>maxProduct){
                maxProduct=product;
            }
        }

        return maxProduct;
    }

    public static String readNumberFromFile(){
        String largeNum = "";
        try (BufferedReader br = new BufferedReader(new FileReader("projectFiles/problem8.txt")))
        {
            String fileNumberLine;
            while ((fileNumberLine = br.readLine()) != null) {
               largeNum += fileNumberLine;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return largeNum;
    }
}
