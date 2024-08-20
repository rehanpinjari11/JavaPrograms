import java.util.Scanner;

public class FactorOfNumber {

    public static void main(String[] args)
    {
        //Taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        //for loop to iterate the values till that number
        for (int i = 1; i <= num ; i++)
        {
            //if condition to check if the number is divisible by the numbers which starts from 1
            if (num % i == 0)
            {
                System.out.println("Factor of a " +num+ " is: "+i);
            }
            
        }

    }
}
