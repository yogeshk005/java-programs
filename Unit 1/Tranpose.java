import java.util.*;

class Transpose{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int r = sc.nextInt(),c=sc.nextInt();
        int[][]a = read(r,c);
        disp(a);
        int[][] t = transpose(a);
        disp(t);
    }
    static int[][] transpose(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        
        int[][] t = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
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

    static void disp(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

}