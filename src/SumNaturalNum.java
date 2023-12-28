import java.util.Scanner;
public class SumNaturalNum
{
    public static void main(String[] args) {
        int n,i,sum=0;
        System.out.println("Enter any no: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Addition "+sum);

    }
}