import java.util.*;

class Array1{
    public void main(String[] args){
        //String a[] = {1,2,3,4,5};
        //System.out.println(a);{will print address not elements}
        int [] a = new int[100];
        System.out.println("SIze:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        /*(int item: a)
            System.out.println(item);*/
        System.out.println("Array:");
        for (int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}