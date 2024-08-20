import java.util.Scanner;

//1. Read Input:
//   Prompt the user to enter a number.
//   Store the input number in a variable n.

//2. Initialize Variables:
//   Store the input number in a temporary variable temp.
//   Initialize a variable sum to 0. This will store the sum of the factorials of the digits of the number.

//3. Calculate Sum of Factorials of Digits:
//   Use a while loop to process each digit of the number.
//   In each iteration, extract the last digit of n using n % 10.
//   Calculate the factorial of the extracted digit.
//   Add the factorial value to sum.
//   Remove the last digit from n using n / 10.

//4. Check and Print Result:
//   After the loop ends, compare sum with temp.
//   If sum equals temp, print that the number is a Strong Number.
//   Otherwise, print that the number is not a Strong Number.

//5. Factorial Calculation:
//   Define a method factorial that takes an integer n and returns its factorial.
//   Use a for loop to calculate the factorial.

public class StrongNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (n != 0)
        {
            int digit = n % 10;
            sum = sum + factorial(digit);
            n = n / 10;
        }

        if (sum == temp)
        {
            System.out.println(temp+" is a Strong Number");
        }
        else
        {
            System.out.println(temp+" is not a Strong Number");
        }

    }

    public static int factorial(int n)
    {
        int fact = 1;

        for (int i = 1; i <= n ; i++)
        {
            fact = fact * i;

        }

        return fact;
    }
}
