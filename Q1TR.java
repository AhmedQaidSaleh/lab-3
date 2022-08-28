import java.util.Scanner;

public class Q1TR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=1;
        int m = -1;
        System.out.print("a. ");
        if (n<-m)
        {System.out.println(n);}
        else {
            System.out.println(m);
        }

        //int n=1;
        //int m = -1;
        System.out.print("b. ");
        if (-n>=m)
        {System.out.println(n);}
        else {
            System.out.println(m);
        }
        double x= 0;
        double y = 1;

        System.out.print("c. ");
        if (Math.abs(x-y)<1)
        {System.out.print(x);}
        else {
            System.out.println(y);
        }
        double z= Math.sqrt(2);
        double v = 2;

        System.out.print("d. ");
        if (z*z==v)
        {System.out.println(z);}
        else {
            System.out.println(v);
        }



    }
}
