package functions;

import java.util.ArrayList;

/**
 * Created by sineadmclaughlin on 28/03/2016.
 */
public class NumberUtils {

    /**
     *
     * @param n int
     * @return true or false depending if the passed integer is pandigital
     */
    public static boolean IsPandigital(int n)
    {
        int digits = 0; int count = 0; int tmp;

        for (; n > 0; n /= 10, ++count)
        {
            if ((tmp = digits) == (digits |= 1 << (n - ((n / 10) * 10) - 1)))
                return false;
        }

        return digits == (1 << count) - 1;
    }

    /**
     *
     * @param numString String to be checked
     * @return true or false depending if the passed integer is pandigital
     */
    public static boolean IsPandigital(String numString)
    {
        Integer num = Integer.parseInt(numString);
        return IsPandigital(num);
    }


    /**
     *
     * @param num
     * @return arrayList of the digits contained in the number passed in as parameter
     */
    public static ArrayList<Integer> returnDigits(String num){
        int size = num.length();
        ArrayList<Integer> digits= new ArrayList<Integer>();
        for(int i=0; i<size; i++){
            digits.add(Integer.parseInt(num.substring(i,i+1)));
        }
        return digits;
    }

    /**
     *
     * @param integer number
     * @return arrayList of the digits contained in the number passed in as parameter
     */
    public static ArrayList<Integer> returnDigits(int num){
        return returnDigits(String.valueOf(num));
    }

}
