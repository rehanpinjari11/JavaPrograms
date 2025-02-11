import java.util.Scanner;

public class FindingPrimeFactorOfNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        
        if(n > 0)
        {
            while(n % 2 == 0)
            {
                System.out.print(2 + " ");
                n = n / 2;
            }

            for (int i = 3; i <= n/2; i+=2)
            {
                while(n % i == 0)
                {
                    System.out.print(i + " ");
                    n = n / i;
                }
            }

            if(n > 2)
            {
                System.out.print(n);
            }
        }

    }
}
