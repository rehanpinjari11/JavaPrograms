import java.util.Scanner;

//1. Initialize Scanner: Create a Scanner object to read input from the user.
//2. Prompt for Input: Display a message asking the user to enter a number.
//3. Read Input: Store the user's input in an integer variable num.
//4. Initialize a Boolean Variable: Create a boolean variable b and set it to false. This variable will be used to indicate whether the number is a perfect square.
//5. Iterate to Check Perfect Square:
//   Loop through all integers starting from 1 up to the square root of num.
//   For each integer i, calculate its square (i * i).
//   If i * i is equal to num, set b to true.
//6. Check Result:
//   If b is true, print "It is a Perfect Square".
//   Otherwise, print "It is not a Perfect Number".

public class PerfectSquare {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        boolean b = false;

        for (int i = 1; i * i <= num ; i++)
        {
            if (i * i == num)
            {
                b = true;
            }

        }

        if (b)
        {
            System.out.println("It is a Perfect Square");
        }
        else
        {
            System.out.println("It is not a Perfect Number");
        }

    }
}
