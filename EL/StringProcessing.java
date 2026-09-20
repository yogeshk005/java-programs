import java.util.*;
class StringProcessing{
    public static void main(String[]sss){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = sc.nextLine();
        System.out.println("Enter the registration number: ");
        String registration = sc.nextLine();
        String[]words = name.trim().split("\\s+"); 
        String result = "";
        String createId = "";
        for(int i=0;i<words.length;i++){
            createId = words[i].substring(0,1);
            result += words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase() + " ";
            createId += registration.substring(registration.length()-4);
        }
        System.out.println("Processed name: " + result.trim());
        System.out.println("Generated ID: " +   createId);
    }
}