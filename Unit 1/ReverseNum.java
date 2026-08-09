import java.util.*;

class ReverseNum{
    public void main(String[] args){
        System.out.println("Enter the number to reverse ");
        Scanner sc = new Scanner(System.in);
        int reverse = 0;
        int n = sc.nextInt();
        while(n!=0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n=n/10;
        }
        System.out.println("reversed number is :"+reverse);
    }
}