import java.util.Scanner;

public class PerfectNumberInRange {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Starting range:");
        int num1 = sc.nextInt();

        System.out.println("Enter the Ending range:");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2 ; i++)
        {
            if (isPerfect(i))
            {
                System.out.println(i+ " ");
            }

        }
    }

    public static boolean isPerfect(int num)
    {
        int sum = 0;

        for (int i = 1; i <= num/2 ; i++)
        {
           if(num % i == 0)
           {
               sum = sum + i;
           }

        }

        return sum == num;
    }
}
