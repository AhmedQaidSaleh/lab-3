import java.util.Scanner;

public class Q6TR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,z,y;
        System.out.println("input the first number : ");
        x = in.nextInt();
        System.out.println("input the 2 number : ");
        y = in.nextInt();
        System.out.println("input the 3 number : ");
        z = in.nextInt();
        if (x < y && y < z)
        {
            System.out.println("Increasing order");
        }
        else if (x > y && y > z)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither Increasing or Decreasing order");
        }
    }

}
