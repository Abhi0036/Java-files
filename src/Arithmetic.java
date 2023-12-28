import java .util.Scanner;
class Arithmetic
{
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two number...");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Addition"+(a+b));
        System.out.println("Subtration"+(a-b));
        System.out.println("Multiplication"+(a*b));
        System.out.println("division"+(a/b));
        System.out.println("Remainder"+(a%b));

    }
}
