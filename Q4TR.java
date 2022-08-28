import java.util.Scanner;

public class Q4TR {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input number less then ten billion : ");

        if (in.hasNextLong())
        {
            long   n = in.nextLong();
            if (0 < n)
            {
                n *=-1;
            }
            if (n >= 10000000000l)
            {
                System.out.println("Number is greater or equals 10,000,000,000");
            }
            else
            {
                int d =0 ;
               d= 1;
                if (n >=10 && n<100)
                {
                    d = 2;
                }
                else if (n >=100 && n<1000)
                {
                    d =3;
                }
                System.out.println("number of digits in the number : "+d);
            }
        }
        else
        {
            System.out.println("The Number is not an intger");
        }
    }
}
