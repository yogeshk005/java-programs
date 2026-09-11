class NestedTry{
    public static void main(String[]ssss){
        try{
            int a = 5,b = 0;
            int[]arr = {1,2,3};
            System.out.println(arr[-5]);
            try{
                System.out.println(a/b);
            }
            catch(ArithmeticException ae){
                System.out.println("Ae");
            }
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("AIOBE");
        }
    }
}