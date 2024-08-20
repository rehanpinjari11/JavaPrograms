import java.util.Scanner;

//1. Import the Scanner class: This is used to take input from the user.
//2. Main Method: This is the entry point of the program.
//3. Scanner Object: Create a Scanner object to read user input.
//4. Read Input: Prompt the user to enter a number and store it in an integer variable.
//5. Initialize Variables: Initialize sum to 0 and temp to the input number.
//6. Calculate Sum of Divisors: Use a for loop to find all divisors of the number and add them to sum.
//7. Check Perfect Number: Compare the sum of divisors (sum) with the original number (temp).
//8. Print Result: Print whether the number is a perfect number or not.

public class PerfectNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        for (int i = 1; i <= num/2 ; i++)
        {
            if (num % i == 0)
            {
                sum = sum + i;
            }
        }

        if (sum == temp)
        {
            System.out.println(temp+" is a Perfect Number");
        }
        else
        {
            System.out.println(temp+" is not a Perfect Number");
        }

    }
}
