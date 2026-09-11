import java.util.*;
class CustomExc1{
    public static void main(String[]jkjj){
        int n = new Scanner(System.in).nextInt();
        try{
            if(n>0)
                System.out.println("All good");
            else
                throw new NegNumExc("Negative number");
        }
        catch(NegNumExc nne){
            System.out.println(nne);
    }
    }
}

class NegNumExc extends Exception{
    NegNumExc(String msg){
        super(msg);
        System.out.println("Custom message");
    }
}