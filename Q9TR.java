import java.util.Scanner;

public class Q9TR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputMonth = 0;
        int inputDay = 0;
        System.out.println("I can what season it is if you tell me the number indecating the month and one indecating the day. ");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number from 1 to 12 to indecate the month: ");
        inputMonth = keyboard.nextInt();

        boolean validInput = true;
        if (inputMonth > 12 || inputMonth < 1) {
            System.out.println(inputMonth + " is not a valid month.");
            validInput = false;
        }
        else{
            System.out.print("Please enter a number from 1 to 31 to indecate the day: ");
            inputDay = keyboard.nextInt();
            if (inputDay > 31 || inputMonth < 1) {
                System.out.println(inputDay + " is not a valid day.");
                validInput = false;
            }
        }
        if (validInput){
            String season = "";
            if (inputMonth == 1 || inputMonth == 2 || inputMonth == 3){
                season = "Winter";
            }
            else if (inputMonth == 4 || inputMonth == 5 || inputMonth == 6){
                season = "Spring";
            }
            else if (inputMonth == 7 || inputMonth == 8 || inputMonth == 9){
                season = "Summer";
            }
            else{
                season = "Fall";
            }

            if (inputMonth % 3 == 0 && inputDay >= 21){
                if (season.equalsIgnoreCase("Winter")){
                    season = "Spring";
                }
                else if (season.equalsIgnoreCase("Spring")){
                    season = "Summer";
                }
                else if(season.equalsIgnoreCase("Summer")){
                    season = "Fall";
                }
                else{
                    season = "Winter";
                }
            }
            System.out.println("I think it is\t" + season);
        }
        else{
            System.out.println(validInput + " data so quitting.");
        }
    }
}
