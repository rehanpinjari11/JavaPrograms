import java.util.Scanner;

//1. Import Scanner: We import the Scanner class to handle user input.
//2. Create Scanner Object: We create an instance of Scanner to read input from the user.
//3. Read Input: We use sc.nextInt() to get an integer input from the user.
//4. Initialize Sum: We initialize a variable sum to 0, which will be used to store the cumulative sum.
//5. For Loop: We loop from 1 to n and add each number to the sum.
//6. Print Result: We print the final sum.
//7. Close Scanner: We close the Scanner object to free up resources.

public class SumOfFirstNNatural {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }

        System.out.println(sum);

        sc.close();

    }
}
