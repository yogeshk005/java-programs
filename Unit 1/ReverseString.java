import java.util.*;

class ReverseString{
    public void main(String[] args){
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        for(int i=s.length();i > -1;i--)
            System.out.println("Given"+s+"\nRev:"+r);
            //System.out.println("using built in :"+s.reverse());
            String y = s.replace(s.charAt(2),'y');
            System.out.println("Old:"+s+"\ny="+y);
            String ss = s.substring(2,4);
            System.out.println("Substring from 2,4:"+ss);
    }
}