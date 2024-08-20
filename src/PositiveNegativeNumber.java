import java.util.Scanner;

//1. Import Statement: Import the Scanner class from the java.util package to read input from the user.
//2. Scanner Object: Create a Scanner object sc to read input from the console.
//3. Prompt User: Print a message to prompt the user to enter a number.
//4. Read Input: Use sc.nextInt() to read an integer input from the user.
//5. Conditional Check:
//   If the number is greater than zero (n > 0), print "Positive Number".
//   If the number is less than zero (n < 0), print "Negative Number".
//   If the number is zero (n == 0), print "Zero".

public class PositiveNegativeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0)
        {
            System.out.println("Positive Number");
        }
        else if (n < 0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Zero");
        }

    }
}
