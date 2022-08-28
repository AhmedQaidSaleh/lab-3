import java.util.Scanner;

public class Q10TR {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("I can tell you how many days are in  month.");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number between 1 to 12 representing a month in the year: ");

        int monthInput = keyboard.nextInt();

        if (monthInput == 1)
        {
            System.out.println("You entered " + monthInput + " there are 31 days in Januaray. ");
        }
        else if (monthInput == 2)
        {
            System.out.println("You entered " + monthInput + " there are 28 days in Febuarary. ");
        } else if (monthInput == 3)
        {
            System.out.println("You entered " + monthInput + " there are 31 days in March. ");
        }
        else if (monthInput == 4)
        {
            System.out.println("You entered " + monthInput + " there are 30 days in April. ");
        }
        else if (monthInput == 5)
        {
            System.out.println("You entered " + monthInput + " there are 31 days in May. ");
        }
        else if (monthInput == 6)
        {
            System.out.println("You entered " + monthInput + " there are 30 days in June. ");
        }
        else if (monthInput == 7)
        {
            System.out.println("You entered " + monthInput + " there are 31 days in July. ");
        }
        else if (monthInput == 8)
        {
            System.out.println("You entered " + monthInput + " there are 31 days in Auguest. ");
        }
        else if (monthInput == 9)
        {
            System.out.println("You entered " + monthInput + " there are 30 days in September. ");
        }
        else if (monthInput == 10)
        {
            System.out.println("You entered " + monthInput + " there are 31 days in October. ");
        }
        else if (monthInput == 11)
        {
            System.out.println("You entered " + monthInput + " there are 30 days in November. ");
        }
        else  if (monthInput == 12)
        {
            System.out.println("You entered " + monthInput + " there are 31 days in December. ");
        }
        else
        {
            System.out.println("You entered " + monthInput + " which is invalid. ");
        }


    }
}
