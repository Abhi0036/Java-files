import java.util.Scanner;
class elseIf
{
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter the marks");
        Scanner ref=new Scanner(System.in);
        marks=ref.nextInt();
        if(marks>80)
        {
            System.out.println("topper");
        }
        else if(marks<80 && marks>=60)
        {
            System.out.println("first");
        }
        else
        {
            System.out.println("second");
        }
    }
}
