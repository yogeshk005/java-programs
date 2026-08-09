import java.util.*;

public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check :");
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println(a+" is Even number");
        }
        else{
            System.out.println(a+" is Odd number");
        }
    }
}