import java.util.Scanner;
class UserInput
{
    public static void main(String[] args) {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println(a+" "+b);

    }
}