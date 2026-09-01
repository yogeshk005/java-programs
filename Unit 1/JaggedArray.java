import java.util.*;

class JaggedArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Row count");
        int r = sc.nextInt();
        int[][] a = new int[r][];
        for (int i=0;i<a.length;i++){
            System.out.println("Number of cols for row:"+i);
            int c = sc.nextInt();
            a[i]=new int[c];
            for(int j=0;j<a[i].length;j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println("Array:");
        int sum=0;
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+",");
            System.out.println();
        }
    }
}