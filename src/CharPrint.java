import java.util.Scanner;
class CharPrint{
    public static void main(String[] args) {
        char ch;
        System.out.println("please enter the character");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        System.out.println(ch);
    }
}