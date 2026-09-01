import java.util.*;

class StringOps{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        /*for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }*/
        for(char ch: s.toCharArray()){
            System.out.println(ch);
        }
    }
}