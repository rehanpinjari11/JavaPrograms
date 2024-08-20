import java.util.Scanner;

// Step 1: Taking user input
// Step 2: Taking num1 for starting number and num2 for Ending number.
// Step 3: Creating for loop that Start with num1(Starting value) till num2(Ending value).
// Step 2: In for loop creating a variable check variable which store the i value.
// Step 3: Creating variable sum and rem initializing with 0.
// Step 4: Using While loop to check if the number is equal to zero or not.
// Step 5: Separate the digit one by one and store into rem variable after every iteration.
// Step 6: Multiply rem three times and add with sum.
// Step 7: Divide the Number with 10, after separate the digit.
// Step 8: Checking if the sum is equal to the i value, then print all the i values which same as the sum

public class ArmstrongNumberGivenRange {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Starting Number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the Ending Number:");
        int num2 = sc.nextInt();

        for (int i = num1; i < num2 ; i++)
        {
            int sum = 0;
            int rem = 0;
            int temp = i;

            while(temp != 0)
            {
                rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
            }

            if(sum == i)
            {
                System.out.println("Armstrong Numbers is "+i);
            }


        }

    }
}
