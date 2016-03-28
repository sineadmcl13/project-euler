package level1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=13
 **/

public class Problem13 {

    public static void main(String [] args){
        System.out.println(problem13());
    }

    public static String problem13(){
        try (BufferedReader br = new BufferedReader(new FileReader("projectFiles/problem13.txt")))
        {
            String number;
            BigInteger total = BigInteger.ZERO;

            while ((number = br.readLine()) != null) {
                //read in each line and add to the total
                total=total.add(new BigInteger(number));
            }
            return String.valueOf(total).substring(0,10);

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}