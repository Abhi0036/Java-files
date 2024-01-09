import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        int a,b,temp;
        System.out.println("Enter any two nuber for swapping");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before swapping: " + a+ " "+b );
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: " + a+ " "+b );


    }
}
