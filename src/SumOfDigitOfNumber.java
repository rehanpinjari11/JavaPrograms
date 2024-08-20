import java.util.Scanner;

//1. Read Input:
//   Prompt the user to enter a number.
//   Store the input number in a variable num.

//2. Initialize Variables:
//   Initialize a variable sum to 0. This will store the sum of the digits of the number.

//3. Calculate Sum of Digits:
//   Use a while loop to process each digit of the number.
//   In each iteration, extract the last digit of num using num % 10.
//   Add the extracted digit to sum.
//   Remove the last digit from num using integer division num / 10.

//4. Print Result:
//   After the loop ends, print the result, which is the sum of the digits of the number.

public class SumOfDigitOfNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int sum = 0;

        while(num != 0)
        {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of the Digit of the Number is "+sum);

    }
}
