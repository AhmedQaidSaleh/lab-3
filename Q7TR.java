import java.util.Scanner;

public class Q7TR {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x,z,y;
        System.out.println("input the first number : ");
        x = in.nextInt();
        System.out.println("input the 2 number : ");
        y = in.nextInt();
        System.out.println("input the 3 number : ");
        z = in.nextInt();
        if ((x <= y && y < z) || (x < y && y <= z) || (x > y && y >= z) || (x >= y && y > z))
        {
            System.out.println("in order");
        }
        else
        {
            System.out.println("not order");
        }
    }
}

