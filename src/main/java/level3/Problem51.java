package level3;

import functions.Factors;

import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=51
 * */

public class Problem51 {


	public static void main(String[] args){
        System.out.println(problem51());
	}


    public static String problem51(){
        ArrayList<String> pattern6Digits = getListOfNumbers();


        for(String s :pattern6Digits){
            for(int i=0; i<10; i++){
                String replacedFirstOne =s;
                replacedFirstOne=replacedFirstOne.replaceFirst("1", ""+i+"");

                for(int k =0; k<10;k++){
                    String replacedSecondOne = replacedFirstOne;
                    replacedSecondOne=replacedSecondOne.replaceFirst("1", ""+k+"");

                    int count =0;
                    String temp = replacedSecondOne;
                    for(int j=0; j<10; j++){
                        replacedSecondOne=temp;
                        replacedSecondOne = replacedSecondOne.replace('0', Character.forDigit(j, 10));

                        if(Factors.isPrime(Integer.parseInt(replacedSecondOne))){
                            count++;
                        }

                        if(count==8){
                            //prints out the answer without the 0 digits replaced so i replaced them manually myself with 1's to get 121313
                            return temp.replace("0", "1");
                        }

                    }
                }
            }
        }

        return "";

    }


    private static ArrayList<String> getListOfNumbers() {
        ArrayList<String> patternDigits = new ArrayList<>();

        //create pattern on 0 and 1's. 0's is the repeating digits, 1's get replaced with digits 1-9
        String pattern = "000003";
        for (int i = 0; i<pattern.length()-2; i++){

            for(int j =i+1; j<pattern.length()-1; j++){

                String newPattern=replaceCharAt(pattern,i,'1');
                newPattern=replaceCharAt(newPattern,j,'1');
                patternDigits.add(newPattern);
            }

        }

        return patternDigits;
    }


    private static String replaceCharAt(String s, int pos, char c) {
        return s.substring(0, pos) + c + s.substring(pos + 1);
    }


}

