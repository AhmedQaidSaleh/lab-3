import java.util.Scanner;

public class Q3TR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a number: ");
       int n = in.nextInt();
       if (n>0)
       {
           System.out.println("positive");
       }
       else if (n<0)
       {
           System.out.println("negative ");
       }
       else
       {
           System.out.println("zero");
       }
    }
}
