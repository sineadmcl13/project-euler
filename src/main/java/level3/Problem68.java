package level3;

import functions.Permutations;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://projecteuler.net/problem=68
 */

public class Problem68 {

	public static void main(String [] args){
		System.out.println(problem68());
	}


	public static Long problem68(){

		List<Long> solutions = new ArrayList<>();
		List<String> permutations = Permutations.returnPermutations("123456789");

		for(String permutation : permutations){
			int [] numbers = getIntArray(permutation);

			if(isMagicGonRing(numbers)){
				solutions.add(getSolution(numbers));
			}
		}

		Collections.sort(solutions);
        return solutions.get(solutions.size()-1);

    }


	private static int[] getIntArray(String number){
		int [] numbers = new int[9];

		for(int i =0; i<number.length(); i++){
			numbers[i]=Integer.valueOf(number.substring(i,i+1));
		}
		return numbers;
	}

	private static boolean isMagicGonRing(int[] numbers){

		int lineTotal=numbers[0]+numbers[1]+numbers[2];

		if(lineTotal==numbers[3]+numbers[2]+numbers[4]){
			if(lineTotal==numbers[5]+numbers[4]+numbers[6]){
				if(lineTotal==numbers[7]+numbers[6]+numbers[8]){

					return lineTotal==10+numbers[8]+numbers[1] ;

				}else return false;
			}else return false;
		}else return false;
	}


	private static Long getSolution(int[] numbers){

		String solution = "";
		List<String> gonRingLine = new ArrayList<>();
		gonRingLine.add(""+numbers[0]+numbers[1]+numbers[2]);
		gonRingLine.add(""+numbers[3]+numbers[2]+numbers[4]);
		gonRingLine.add(""+numbers[5]+numbers[4]+numbers[6]);
		gonRingLine.add(""+numbers[7]+numbers[6]+numbers[8]);
		gonRingLine.add(""+10+numbers[8]+numbers[1]);

		List<Integer> list = new ArrayList<>();
		list.add(numbers[0]);
		list.add(numbers[3]);
		list.add(numbers[5]);
		list.add(numbers[7]);
		list.add(10);

		int minIndex = list.indexOf(Collections.min(list));

		solution=solution+gonRingLine.get(minIndex);

		for(int i = minIndex+1; ;){
			if(i==4){
				solution=solution+gonRingLine.get(i);
				i=0;
			}else {
				solution=solution+gonRingLine.get(i);
				i++;
			}
			if(i==minIndex){
				break;
			}


		}

		return Long.valueOf(solution);
	}


}

