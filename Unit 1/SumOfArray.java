import java.util.*;

class SumOfArray{
    public void main(String[] args){
        int[] arr = new int[100];
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i =0;i<n;i++)
            arr[i] = sc.nextInt();
        int s = 0;
        for(int i =0;i<n;i++)
            s+=arr[i];
        System.out.println("Sum : "+s);


    }
}