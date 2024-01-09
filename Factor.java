// find the factor of given number
import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number to find their factor: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+ " ");
            }
        }
    }
}
