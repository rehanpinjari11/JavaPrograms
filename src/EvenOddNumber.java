import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args)
    {
        //Taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();

        //Check if the number is divisible by 2 then print Even Number
        if (n % 2 == 0)
        {
            System.out.println(n+" is an Even Number");
        }

        //If the number is not divisible by 2 then print Odd Number
        else
        {
            System.out.println(n+" is an Odd Number");
        }

    }
}
