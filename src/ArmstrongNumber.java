import java.util.Scanner;

// Step 1: Taking user input
// Step 2: Creating a variable temp which store the num value.
// Step 3: Creating variable sum and rem initializing with 0.
// Step 4: Using While loop to check if the number is equal to zero or not.
// Step 5: Separate the digit one by one and store into rem variable after every iteration.
// Step 6: Multiply rem three times and add with sum.
// Step 7: Divide the Number with 10, after separate the digit.
// Step 8: Checking if the sum and temp variable is same or not, if it is same then print "Armstrong Number"
// if not print "Not an Armstrong Number".

public class ArmstrongNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int rem = 0;

        while(num != 0)
        {
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }

        if (sum == temp)
        {
            System.out.println(temp+" is an Armstrong Number");
        }
        else
        {
            System.out.println(temp+" is not an Armstrong Number");
        }

    }
}
