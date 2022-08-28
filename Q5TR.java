import java.util.Scanner;

public class Q5TR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,z,y;
        System.out.println("input the first number : ");
        x = in.nextInt();
        System.out.println("input the 2 number : ");
        y = in.nextInt();
        System.out.println("input the 3 number : ");
        z = in.nextInt();
        if (x == y && x==z)
        {
            System.out.println("all number are equal");
        }
        else if ((x == y) || (x == z) || (z == y))
        {
            System.out.println("neither all number equal or different");
        }
        else
        {
            System.out.println("all number are different");
        }
    }

}
