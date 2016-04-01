package functions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Permutations {


    /**
     *
     * @param num
     * @returns true if the number passed in is a palindrome, otherwise false
     */
    public static boolean isPalindrome(int num){
        String value = String.valueOf(num);
        return value.equals(new StringBuilder(value).reverse().toString());
    }


    /**
     * @param num Long
     * @return ArrayList<Long> of every possible permutation
     */
    public static ArrayList<Long> returnPermutations(Long num){

        char [] numbers = num.toString().toCharArray();
        ArrayList<Long> permutations = returnAllPermutations(numbers).stream().map(Long::valueOf).collect(Collectors.toCollection(ArrayList::new));

        return permutations;
    }


    /**
     *
     * @param numbers [] String
     * @return ArrayList<String> of every possible permutation
     */
    public static ArrayList<String> returnAllPermutations(char [] numbers){

        ArrayList<String> permutations = new ArrayList<>();

        //sort the array into lexicographic order and add as first permutation to the list
        Arrays.sort(numbers);
        String listString ="";
        for (char s : numbers)
        {
            listString += s+"";
        }
        permutations.add(listString);

        //find each permutation and add to the list
        do{
            nextPermutation(numbers);
            listString ="";
            for (char s : numbers)
            {
                listString += s+"";
            }
            permutations.add(listString);
        }while(hasNextPermutation(numbers));

        //return the list of permutations
        return permutations;
    }


    public static boolean hasNextPermutation(char[] array){
        int i;
        // Find the largest index k such that a[k] < a[k + 1]. If no such index
        // exists, the permutation is the last permutation.
        for (i = array.length - 2; i >= 0; i--) {
            if (array[i] < array[i + 1])
                return true;
        }
        return i >= 0;
    }

    /**
     *
     * @param array
     * generates the next permutation in an array
     */
    public static void nextPermutation(char[] array){
        int i, j;
        // Find the largest index k such that a[k] < a[k + 1]. If no such index
        // exists, the permutation is the last permutation.
        for (i = array.length - 2; i >= 0; i--) {
            if (array[i] < array[i + 1])
                break;
        }
        if (i < 0) {
            return;
        }

        // Find the largest index l such that a[k] < a[l]. Since k + 1 is such
        // an index, l is well defined and satisfies k < l.
        for (j = array.length - 1; j > i; j--) {
            if (array[j] > array[i])
                break;
        }

        // Swap a[k] with a[l].
        swap(array, i++, j);

        // Reverse the sequence from a[k + 1] up to and including the final
        // element a[n].
        for (j = array.length - 1; j > i; i++, j--) {
            swap(array, i, j);
        }

    }

    private static void swap(char[] array, int x, int y) {
        array[x] ^= array[y];
        array[y] ^= array[x];
        array[x] ^= array[y];
    }



    /**
     *
     * @param origNum the original number to be checked
     * @param permutation the proposed permutation to be checked against the origNum
     * @return true if the origNum and permutation are permutations of each other. Otherwise false is returned
     */
    public static boolean isPermutation(int origNum, int permutation){
        String origString = String.valueOf(origNum);
        String permutationString = String.valueOf(permutation);

        return isPermutation(origString, permutationString);
    }


    /**
     *
     * @param origNum the original number to be checked
     * @param permutation the proposed permutation to be checked against the origNum
     * @return true if the origNum and permutation are permutations of each other. Otherwise false is returned
     */
    public static boolean isPermutation(String origNum, String permutation){
        char [] origNumArray = origNum.toCharArray();
        char [] permutationArray = permutation.toCharArray();

        Arrays.sort(origNumArray);
        Arrays.sort(permutationArray);

        String origString ="";
        for(char c : origNumArray){
            origString+=c;
        }

        String permutationString ="";
        for(char c : permutationArray){
            permutationString=permutationString+c;
        }

        return origString.equals(permutationString);

    }
}
