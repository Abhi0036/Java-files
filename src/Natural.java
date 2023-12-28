import java.util.Scanner;
class Natural
{
    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter no of term:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}