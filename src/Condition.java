import java.util.Scanner;
class Condition
{
    public static void main(String[] args) {
        int age,percnt;
        System.out.println("Enter Your Age and percentage");
        Scanner r=new Scanner(System.in);
        age=r.nextInt();
        percnt=r.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible for voting");
        }

        if(percnt>=60)
        {
            System.out.println("Eligible for superset");
        }
        System.out.println("Thank You");
    }
}
