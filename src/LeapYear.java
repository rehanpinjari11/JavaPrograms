import java.util.Scanner;

//Start
//Declare an integer variable year.
//Prompt the user to enter a year.
//Read the input year from the user.
//Check if the year is a leap year using the following conditions:
//If the year is divisible by 4 and not divisible by 100, or the year is divisible by 400:
//Print that the year is a leap year.
//Otherwise:
//Print that the year is not a leap year.
//End

public class LeapYear {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println(year+" is a Leap Year");
        }
        else
        {
            System.out.println(year+" is not a Leap Year");
        }

    }
}
