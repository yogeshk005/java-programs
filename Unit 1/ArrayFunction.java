import java.util.*;

class ArrayFunction{
   static void disp(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static int[][] read(int r, int c, Scanner sc) {
        int[][] a = new int[r][c];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

   static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(),c = sc.nextInt();
        int [][]a = read(r,c),b = read(r,c);
        disp(a);
        disp(b);
        int[][] res = add(a,b);
        disp(res);
    }
    
}