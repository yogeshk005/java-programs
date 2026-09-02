import java.util.*;
class ArithExcDemo{
    public static void main(String[]arguments){
        Scanner sc = new Scanner(System.in);
        try{
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Q = "+(a/b));
        }
        catch(ArithmeticException ae){
            System.out.println("AE Occured");
            System.out.println(ae);
        }
        catch(Exception ime){
            System.out.println("IME Occured");
            System.out.println(ime);
        }
        catch(InputMismatchException ime){
            System.out.println("IME input");
            System.out.println(ime);
        }

    }
}