/**
 * Created by admin on 07/08/15.
 */

public class PatternPrinter {

    private static Character ch = '*';

    public static String lineHorizontal(int n){
        return lineHorizontal(n,ch.toString());
    }
    public static String lineHorizontal(int n,String s){
        String output = new String();
        for(int i=0;i<n;i++)
            output =output.concat(s);
        //output =output.concat("\n");
        return output;
    }

    public static String lineVertical(int n){
        return lineHorizontal(n,ch+"\n");

    }

    public static String lineHorizontal(int n,int l,int r){
        String padL = lineHorizontal(l," ");
        String padR = lineHorizontal(r," ");
        String str = lineHorizontal(n);
        return padL+str+padR ;
    }

    public static String triagleLeft(int n){
        String output = new String();
        for(int i=1;i<=n;i++)
            output = output + lineHorizontal(i)+"\n";
        return output ;
    }

    public static String triagleRight(int n){
        String output = new String();
        for(int i=1;i<=n;i++)
            output = output + lineHorizontal(i,n-i,0)+"\n";
        return output ;

    }

    public static String triagleIsoceles(int n){

        String output = new String();
        for(int i=1,j=1;i<=n;i++,j=j+2)
            output = output + lineHorizontal(j,(n*2-1-j)/2,(n*2-1-j)/2)+"\n";
        return output ;

    }

    public static String triagleIsocelesInv(int n){

        String output = new String();
        for(int i=1,j=2*n-1;i<=n;i++,j=j-2)
            output = output + lineHorizontal(j,(n*2-1-j)/2,(n*2-1-j)/2)+"\n";
        return output ;

    }

    public static String triagleIsocelesInvP(int n){

        String output = new String();
        for(int i=1,j=2*n-1;i<=n;i++,j=j-2)
            output = output + lineHorizontal(j,((n*2-1-j)/2)+1,(n*2-1-j)/2)+"\n";
        return output ;

    }

    public static String diamond(int n){

        return triagleIsoceles(n)+triagleIsocelesInvP(n-1 );
    }

    public static String diamondName(int n,String s){

        return triagleIsoceles(n-1)+s+"\n"+triagleIsocelesInv(n-1);
    }

    public static void printPattern(String s){
         System.out.println(s);
    }



    public static void main(String[] args){

        printPattern(lineHorizontal(1));
        printPattern(lineHorizontal(8));
        printPattern(lineVertical(3));
        printPattern(triagleLeft(3));
        printPattern(triagleRight(3));
        printPattern(triagleIsoceles(3));
        printPattern(triagleIsoceles(4));
        printPattern(triagleIsocelesInv(4));

        printPattern(diamond(3));
        printPattern(diamondName(4, "Bill"));
        printPattern(diamondName(4,"TDGSUn"));


    }

}
