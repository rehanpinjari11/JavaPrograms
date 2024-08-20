import java.util.Scanner;

public class FibonacciSeriesUptoNth {

    public static void main(String[] args)
    {
        //Taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Ending Number:");
        int num = sc.nextInt();

        //Creating a variable a and b initializing with 0 and 1
        int a = 0, b = 1;

        //Print that values
        System.out.print(a + " " + b + " ");

        //for loop to which start from 1 till num - 2 because 2 numbers which already defined
        for (int i = 1; i <= num - 2 ; i++)
        {
            //Addition of two numbers which already defined and store into new variable i.e 'c'
            int c = a + b;
            System.out.print(c + " ");

            //replace the value with new value
            a = b;
            b = c;
            
        }


    }
}
