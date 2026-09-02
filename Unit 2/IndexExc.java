import java.util.*;

class IndexExc{
    public static void main(String[]nniijic){
        Scanner sc = new Scanner(System.in);
        int [] a = {1,2,3};
        String s = "abc";
        System.out.println("n: ");
        try{
            int n = sc.nextInt();
            for(int i = 0;i<n;i++){
                System.out.println(a[i]);
            }
            for(int i=0;i<n;i++){
                System.out.println(s.charAt(i));
            }
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Array index exc");
        }
        catch(StringIndexOutOfBoundsException ae){
            System.out.println("String index exc");
        }
        catch(RuntimeException re){
            System.out.println("RE");
        }
    }
}

