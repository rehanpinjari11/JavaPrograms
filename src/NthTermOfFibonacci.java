import java.util.Scanner;

//1. Initialize the Scanner:
//Create a Scanner object to read input from the user.

//2. Input the Value of N:
//Prompt the user to enter the value of num (the position in the Fibonacci sequence).

//3. Initialize Fibonacci Series Variables:
//Initialize three integer variables:
//a to 0 (the first term of the Fibonacci sequence).
//b to 1 (the second term of the Fibonacci sequence).
//c to 0 (a temporary variable to store the next term in the sequence).

//4. Handle Base Cases:
//If num is 1, print 0 (since the first term of the Fibonacci sequence is 0).
//If num is 2, print 1 (since the second term of the Fibonacci sequence is 1).

//5. Calculate the Nth Term for General Case:
//Use a loop to iterate from 1 to num - 2:
//In each iteration, calculate the next term c as the sum of a and b.
//Update a to be the value of b.
//Update b to be the value of c.

//6. Output the Nth Term:
//After the loop ends, c will contain the Nth term of the Fibonacci sequence.
//Print the value of c.

public class NthTermOfFibonacci {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of num");
        int num = sc.nextInt();

        int a = 0, b = 1;
        int c = 0;

        if (num == 1)
        {
            System.out.println(0);
        }
        
        else if (num == 2)
        {
            System.out.println(1);
        }
        
        else
        {
            for (int i = 1; i <= num - 2 ; i++)
            {
                c = a + b;
                a = b;
                b = c;
                
            }

            System.out.println("The Number at given Value is "+c);

//            System.out.println(c);
        }

    }
}
