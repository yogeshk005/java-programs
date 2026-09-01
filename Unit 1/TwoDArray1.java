import java.util.*;

class TwoDArray1{
    public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter rows:");
        int r = sc.nextInt();
        System.out.println("Enter the col:");
        int c = sc.nextInt();
        int [][] a=new int[r][c];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
                a[i][j] = sc.nextInt();
        } 
        System.out.println("Enter the input:");
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}