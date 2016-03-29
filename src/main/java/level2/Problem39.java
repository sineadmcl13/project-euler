package level2;

/**
 * https://projecteuler.net/problem=39
 * */

public class Problem39 {

	public static void main(String[] args){
        System.out.println(problem39());
	}

    public static int problem39(){
        int max_number = 1000;
        int [] solutions = new int [max_number];

        for (int i =0; i<max_number; i++){
            solutions[i] = 0;
        }

        for(int a =1; a<400; a++){

            for (int b =a+1; b<400; b++){

                double hypotenuse = Math.sqrt((a*a)+(b*b));

                if( hypotenuse == (int)hypotenuse ){
                    int perimeter = a+b+(int)hypotenuse;

                    if(perimeter < max_number){
                        solutions[perimeter]+= 1;
                    }
                }

            }
        }

        int answer=0;
        int maxSolutions=0;
        int count =0;

        for(int i : solutions){
            count++;
            if(i > maxSolutions){
                answer=count-1;
                maxSolutions=i;
            }
        }

        return answer;

    }
}
