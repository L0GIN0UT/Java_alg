package Java_alg;

import java.util.ArrayList;
import java.util.List;

public class lect1Algo{

    public static void main(String[] args){
        // List<Integer> avaliDiviner = findSimpleNum(100);
        // for(Integer integer : avaliDiviner){
        //     System.out.println(integer);
        // }
        System.out.println(fib(9));
    }


    public static List<Integer> findAvailableDiviner(int number){
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= number; i++){
            if (number % i == 0){
                res.add(i);
            }
        }
        return res;
    }

    public static List<Integer> findSimpleNum(int max){
        int counter = 0;
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= max; i++){
            boolean simple = true;
            for(int j = 2; j < i; j++){
                counter++;
                if (i % j == 0){
                    simple = false;
                }
            }
            if(simple){
                res.add(i);   
            }
        }
        System.out.println(counter);
        return res;
    }

    public static int fib(int position){
        if (position == 1 || position == 2){
            return 1;
        }
        return fib(position - 1) + fib(position - 2);
    }

}