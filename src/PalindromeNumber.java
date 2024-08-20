import java.util.Scanner;

//1. Import the Scanner class: This is used to take input from the user.
//2. Main Method: This is the entry point of the program.
//3. Scanner Object: Create a Scanner object to read user input.
//4. Read Input: Prompt the user to enter a number and store it in an integer variable.
//5. Initialize Variables: Initialize sum to 0 and temp to the input number.
//6. Reverse the Number: Use a while loop to reverse the digits of the input number.
//7. Check Palindrome: Compare the reversed number (sum) with the original number (temp).
//8. Print Result: Print whether the number is a palindrome or not.

public class PalindromeNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int sum = 0, temp;
        temp = num;

        while(num > 0)
        {
            int rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }

        if (sum == temp)
        {
            System.out.println(temp+" is a Palindrome Number");
        }
        else
        {
            System.out.println(temp+" is not a Palindrome Number");
        }

    }
}
