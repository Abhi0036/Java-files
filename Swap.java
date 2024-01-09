//swaping of two numbers without using third variables

import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int a,b,temp;
        System.out.println("Enter any two nuber for swapping: ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before swapping: " + a+ " "+b );
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("After swapping: " + a+ " "+b );


    }
}

