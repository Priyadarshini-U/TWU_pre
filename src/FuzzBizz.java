/**
 * Created by admin on 10/08/15.
 */
public class FuzzBizz {



    public static void printNumbers(int N){


        for(int i=1;i<=N;i++){
            String s="";

            if (i % 3 == 0)
                s=s.concat("Fizz");
            if( i% 5 ==0)
                s=s.concat("Buzz");
            if(s.length()<1)
                s=s.concat(Integer.toString(i));

            System.out.println(s);
        }
    }


    public static void generate(int N){

    }
    public static void main(String[] args){

        printNumbers(100);
    }

}
