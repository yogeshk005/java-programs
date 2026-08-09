import java.util.*;

class SumOfDigits{
    public void main(String[] args){
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int sum = 0;

         while(a!=0){
             int digit = a%10;
             sum = sum + digit;
             a=a/10;
         }
         System.out.println("Sum is :"+sum);
    }
}