import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args)
    {
        //Taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        //Create a fact variable with initializing with 1
        int fact = 1;

        //for loop to iterate the value from 1 till the number and multiply by the fact and again store inside the fact

        for (int i = 1; i <= num ; i++)
        {
            fact = fact * i;

        }

        //Print the fact
        System.out.println("Factorial of "+num+ " is: " + fact);

    }
}
