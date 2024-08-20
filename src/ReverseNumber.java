import java.util.Scanner;

//1. Importing Scanner:
//   The Scanner class is imported to read input from the console.

//2. Main Method:
//   The main method is the entry point of the program.

//3. Reading User Input:
//   A Scanner object sc is created to read input.
//   The program prompts the user to enter a number.
//   The number is read using sc.nextInt() and stored in the variable num.

//4. Reversing the Number:
//   A variable reverse is initialized to 0 to store the reversed number.
//   A while loop runs as long as num is not zero.
//   Inside the loop:
//   The last digit of num is obtained using num % 10 and stored in digit.
//   This digit is added to reverse after shifting the current digits of reverse to the left by multiplying by 10.
//   The last digit is then removed from num using integer division num / 10.

//6. Output:
//   Finally, the reversed number is printed to the console.

public class ReverseNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int reverse = 0;

        while(num != 0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reverse Number is "+reverse);

    }
}
