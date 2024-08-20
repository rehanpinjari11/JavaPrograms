import java.util.Scanner;

//1. Scanner Initialization:
//The program starts by creating a Scanner object to take user input.

//2. User Input:
//The user is prompted to enter the base and the exponent, which are read using the nextInt() method.

//3. Initialization:
//A long variable result is initialized to 1. This will store the final result.

//4. While Loop:
//The while loop runs as long as the exponent is not zero.
//In each iteration, the result is multiplied by the base.
//The exponent is decremented by 1.

//5. Output:
//Once the loop completes, the result is printed, which is the base raised to the power of the exponent.

//6. Closing Scanner:
//Finally, the Scanner object is closed to prevent resource leaks.

public class PowerOfNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Base:");
        int base = sc.nextInt();

        System.out.println("Enter the Exponent:");
        int exponent = sc.nextInt();

        long result = 1;

        while (exponent != 0)
        {
            result = result * base;
            --exponent;
        }

        System.out.println("Answer is " +result);

        sc.close();

    }
}
