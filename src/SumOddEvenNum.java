import java.util.Scanner;
public class SumOddEvenNum
{
    public static void main(String[] args) {
        int n,i,sum1=0,sum2=0;
        System.out.println("Enter any no: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(i=1;i<=n;i=i+2)
        {
            sum1=sum1+i;
        }
        System.out.println("Addition of odd no "+sum1);
        System.out.println("   ");
        for(i=0;i<=n;i=i+2)
        {
            sum2=sum2+i;
        }
        System.out.println("Addition of even no " +sum2);
    }
}
