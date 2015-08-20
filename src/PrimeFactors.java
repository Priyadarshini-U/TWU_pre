/**
 * Created by admin on 19/08/15.
 */

import java.util.ArrayList;

public class PrimeFactors {


    static ArrayList<Integer> generate(int n)
    {
        ArrayList<Integer> output = new ArrayList<Integer>();

        while (n%2 == 0)
        {
            output.add(2);
            n = n/2;
        }

        for (int i = 3; i <= Math.sqrt(n); i = i+2)
        {
            if(n%i == 0)
                output.add(i);
            while (n%i == 0)
                n = n/i;

        }

        if (n > 2){
            output.add(n);
        }

        return output;
    }

    public static void main (String[] main){

        System.out.println(generate(1));
        System.out.println(generate(30));
        System.out.println(generate(31));


    }



}
