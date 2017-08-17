package level3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://projecteuler.net/problem=61
 */

public class Problem61 {

	public static void main(String [] args){
		System.out.println(problem61());
	}


	public static int problem61(){

        Map<Integer, List<Integer>> numMap = new HashMap<>();
        List<Integer> triangleNums = new ArrayList<>();
        List<Integer> squareNums = new ArrayList<>();
        List<Integer> pentagonalNums = new ArrayList<>();
        List<Integer> hexagonalNums = new ArrayList<>();
        List<Integer> heptagonalNums = new ArrayList<>();
        List<Integer> octagonalNums = new ArrayList<>();

        for(int i =1000; i<9999; i++){
            if(isTriangular(i)){
                triangleNums.add(i);
            }
            if(isSquare(i)){
                squareNums.add(i);
            }
            if(isPentagonal(i)){
                pentagonalNums.add(i);
            }
            if(isHexagonal(i)){
                hexagonalNums.add(i);
            }
            if(isHeptagonal(i)){
                heptagonalNums.add(i);
            }
            if(isOctagonal(i)){
                octagonalNums.add(i);
            }
        }

        numMap.put(1, squareNums);
        numMap.put(2, pentagonalNums);
        numMap.put(3, hexagonalNums);
        numMap.put(4, heptagonalNums);
        numMap.put(5, octagonalNums);


        int [] foundNumbers = new int [6];

        for (int i : triangleNums){
            for(int j=0; j<6; j++){
                foundNumbers[j]=0;
            }
            foundNumbers[0] = i;

            List<Integer> numTwos = getNextCyclicNum(numMap, i);
            if(numTwos.size()>0){
                for(int j : numTwos){
                    foundNumbers[1]=j;

                    List<Integer> numThrees = getNextCyclicNum(numMap, j);
                    if(numThrees.size() > 0){
                        for(int k :numThrees){
                            foundNumbers[2]=k;
                            List<Integer> numFours = getNextCyclicNum(numMap, k);

                            if(numFours.size() > 0) {
                                for(int m : numFours){
                                    foundNumbers[3]=m;
                                    List<Integer> numFives = getNextCyclicNum(numMap, m);

                                    if(numFives.size() >0 ){
                                        for(int x : numFives){
                                            foundNumbers[4]=x;
                                            List<Integer> numSixs = getNextCyclicNum(numMap, x);

                                            if(numSixs.size() > 0) {
                                                for(int y : numSixs){
                                                    foundNumbers[5]=y;

                                                    if(checkIfEachNumType(foundNumbers)){

                                                        if(foundNumbers[5]%100==foundNumbers[0]/100){
                                                            return(i+j+k+m+x+y);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        return 0;
    }

    private static List<Integer> getNextCyclicNum(Map<Integer, List<Integer>> numMap, int previousNum){
        //iterate through the rest to get the fifth number in the cycle
        List<Integer> allNumsThatMatch = new ArrayList<>();

        for(int i =1; i<6; i++){
            List<Integer> nextNum = numMap.get(i);

            allNumsThatMatch.addAll(nextNum.stream().filter(w -> previousNum % 100 == w / 100).collect(Collectors.toList()));

        }
        return allNumsThatMatch;
    }

    private static boolean checkIfEachNumType(int [] nums){

        boolean [] found = new boolean [6];

        for(int num : nums){
            if(isHexagonal(num)){
                found[3]=true;
            }
            else if(isTriangular(num)){
                found[0]=true;
            }
            else if(isSquare(num)){
                found[1]=true;
            }
            else if(isPentagonal(num)){
                found[2]=true;
            }
            else if(isHeptagonal(num)){
                found[4]=true;
            }
            else if(isOctagonal(num)){
                found[5]=true;
            }

        }
        for(boolean b : found){
            if(!b){
                return false;
            }
        }
        return checkUniqueNumbers(nums);
    }

    private static boolean checkUniqueNumbers(int [] nums){
        for(int i =0; i<6; i++){
            for(int k=i+1; k<6; k++){
                if(nums[i]==nums[k]){
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isTriangular(double triNum){

        double num = (Math.sqrt(8*triNum+1)-1)/2;
        return num == (int) num;
    }

    private static boolean isSquare(double squareNum){
        double num = Math.sqrt(squareNum);
        return num == (int) num;
    }

    private static boolean isPentagonal(double pentNum){

        double num = (Math.sqrt(24*pentNum+1)+1)/6;
        return num == (int) num;
    }

    private static boolean isHexagonal(double hexNum){

        double num = (Math.sqrt(8*hexNum+1)+1)/4;
        return num == (int) num;
    }

    private static boolean isHeptagonal(double hexNum){

        double num = (Math.sqrt(40*hexNum+9)+3)/10;
        return num == (int) num;
    }

    private static boolean isOctagonal(double octNum){

        double num = (Math.sqrt(3*octNum+1)+1)/3;
        return num == (int) num;
    }

}

