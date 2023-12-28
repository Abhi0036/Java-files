import java.util.Scanner;
class OddRange
{
    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter no of term:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(i=1;i<=n;i=i+2)
        {
            System.out.println(i);
        }
        System.out.println("for even no ");
        for(i=2;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
}
