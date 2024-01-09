import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int a,b,ch,cal;
        System.out.println("Enter the value of a and b: ");
        Scanner r = new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Select the operation: ");
        ch=r.nextInt();
        if(ch==1)
        {
            cal=a+b;
            System.out.println("Addition: " +cal);
        }
        else if(ch==2)
        {
            cal=a-b;
            System.out.println("Subtraction: " +cal);
        }
        else if(ch==3)
        {
            cal=a*b;
            System.out.println("Multiplication: " +cal);
        }
        else if(ch==4)
        {
            cal=a/b;
            System.out.println("Division: " +cal);
        }
        else
        {
            cal=a%b;
            System.out.println("Reminder" +cal);
        }


    }
}
