import java.util.*;
public class Miscproblems{
    public static void main(String args[]){
        int a = 9;
        int b = 3;
        swap(a,b);
    }



    static void swap(int a , int b){
        System.out.println("Original values before swap:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Values after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}