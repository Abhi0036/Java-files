import java.util.Scanner;
class Check
{
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character:");
        Scanner r = new Scanner(System.in);
        ch=r.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("vowel");
        }
        else {
            System.out.println("consonant");
        }
    }
}