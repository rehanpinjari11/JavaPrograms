import java.util.Scanner;

//1. Import Scanner: Import the Scanner class to handle user input.
//2. Create Scanner Object: Create an instance of Scanner to read input from the user.
//3. Prompt for Input: Print prompts to ask the user for two numbers.
//4. Read Input: Use sc.nextInt() to read the two integers a and b from the user.
//5. Initialize Sum: Initialize a variable sum to 0 to keep track of the cumulative total.
//6. For Loop: Use a for loop to iterate from a to b (inclusive), adding each number to sum.
//7. Print Result: Print the total sum of the specified range.
//8. Close Scanner: Close the Scanner object to free up resources.

public class SumOfNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++)
        {
            sum = sum + i;
        }

        System.out.println("Total Sum of given range:");

        System.out.println(sum);

        sc.close();
    }
}
