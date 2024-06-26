import java.util.*;
public class Bitmanipulation{
    public static void OddOrEven(int n){
        int bitMask=1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        } else {
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }


    public static int updateIthbit(int n, int i,int newBit){
        if(newBit == 0){
            return clearIthBit(n, 1);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearIthBits(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearBitinrange(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }

    public static int countSetbits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count ++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        // System.out.println((5&6));
        // System.out.println((5|6));
        // System.out.println((5 ^ 6));
        // System.out.println((~5));
        // System.out.println((6>>1));
        // System.out.println((5<<2));

        // OddOrEven(3);
        // OddOrEven(11);
        // OddOrEven(14);

        // System.out.println(getIthBit(10, 02));
        // System.out.println(setIthBit(10, 02));
        // System.out.println(clearIthBit(10, 01));

        // System.out.println(updateIthbit(10, 2, 1));

        //System.out.println(clearIthBits(10, 02));

        // System.out.println(clearBitinrange(10, 02, 04));

        System.out.println(countSetbits(10));
        }
        
    }

