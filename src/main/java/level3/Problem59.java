package level3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * https://projecteuler.net/problem=59
 */

public class Problem59 {

	public static void main(String [] args){
		System.out.println(problem59());
	}


	public static int problem59(){
        List<Integer> encryptedChars = returnEncryptedCharsFile();

        int[]key = getKey(encryptedChars);

        ArrayList<Integer> unEncryptedChars = new ArrayList<>();

        for(int i = 0; i<encryptedChars.size(); i++){

            if(i%3 == 0){
                unEncryptedChars.add(encryptedChars.get(i)^key[0]);
            }else if (i%3 == 1){
                unEncryptedChars.add(encryptedChars.get(i)^key[1]);
            }else{
                unEncryptedChars.add(encryptedChars.get(i)^key[2]);
            }
        }

        int sum =0;
        for(int i : unEncryptedChars){
            sum+=i;
        }

        return sum;
    }


    private static List<Integer> returnEncryptedCharsFile(){

        List<Integer> encryptedChars= new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("projectFiles/problem59.txt")))
        {
            String fileOfAscii;
            String [] characters = {};
            while ((fileOfAscii = br.readLine()) != null) {
                characters = fileOfAscii.split(",");
            }

            for(String s: characters){
                encryptedChars.add(Integer.parseInt(s));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return encryptedChars;
    }

    private static int[] getKey(List<Integer> encryptedChars){
        //split into 3 columns because we know the key is 3 letters long
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        List<Integer> array3 = new ArrayList<>();

        for(int i=0; i<encryptedChars.size(); i++){

            if(i%3 == 0){
                array1.add(encryptedChars.get(i));
            }else if (i%3 == 1){
                array2.add(encryptedChars.get(i));
            }else{
                array3.add(encryptedChars.get(i));
            }
        }

        int[]key = new int[3];
        key[0] = getKeyFromLetters(array1);
        key[1] = getKeyFromLetters(array2);
        key[2] = getKeyFromLetters(array3);

        return key;
    }



    private static int getKeyFromLetters(List<Integer> encryptedLetters) {
        //assuming that the most common character is the space character, find it and xor with ascii code for space(32) to find the original key
        Map<Integer, Integer> m = new HashMap<>();

        for (int a : encryptedLetters) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        int max = -1;
        int mostFrequent = -1;

        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue() > max) {
                mostFrequent = e.getKey();
                max = e.getValue();
            }
        }

        return (mostFrequent^32);

    }

}

