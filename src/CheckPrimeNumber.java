import java.util.Scanner;

// Step 1: Taking the User Input
// Step 2: Create a variable count initializing with zero.
// Step 3: Checking if the value of n is 0 or 1 if it is then return.
// Step 4: Using for loop to iterate the values that start with 2 and check till n/2 means half of the number.
// Step 5: Checking in if condition if the number is divisible by 2 then increase the count.
// Step 6: Then using if condition to check if the count of that number is 2 then print "Prime Number"
// Step 7: In else if count of the number is more than 2 then print the "Not a Prime Number".

public class CheckPrimeNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();

        int count = 2;

        if(n == 0 || n == 1)
        {
            return;
        }

        for (int i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }

        if (count == 2)
        {
            System.out.println(n+" is an Prime Number");
        }
        else
        {
            System.out.println(n+" is Not a Prime Number");
        }


    }
}
