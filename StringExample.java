import java.util.*;

public class StringExample{
    public static void main(String args[]){
        // String str="Hello";
        // System.out.println(str);
        // String str2 = new String("Hello asish");
        // System.out.println(str2);

        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the string:");
        // String s = sc.nextLine();
        // System.out.println("The entered string:");
        // System.out.println(s);

        String name = "Asish Kuamr Barik";
        System.out.println(name.length());

        //concatenation
        String firstname = "Asish";
        String middleName = "Kumar";
        String lastName = "Barik";
        String fullname = firstname +  " " + middleName + " " + lastName;
        System.out.println(fullname);
    }
}