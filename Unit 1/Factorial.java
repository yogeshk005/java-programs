import java.util.Scanner;

class Factorial{
    public void main(String[] aaa){
        Scanner sc = new Scanner(System.in);
        System.out.print("n =");
        int n = sc.nextInt();
        System.out.println(n + "! =" + fact(n));
    }
    int fact(int n){
        int f = 1;
        for(int i = 1; i <= n; i++)
            f *= i;
        return f;

    }
}