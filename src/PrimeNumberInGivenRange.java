//1. Initialize a loop:
//   Loop variable n runs from 1 to 100.

//2. Check for non-prime numbers:
//   If n is 0 or 1, continue to the next iteration as these are not prime numbers.

//3. Initialize a counter:
//   Initialize count to 2. This count represents the number of factors of n. A prime number should have exactly 2 factors: 1 and itself.

//4. Inner loop to check factors:
//   Initialize a loop variable i running from 2 to n/2.
//   For each i, check if n is divisible by i.
//   If n is divisible by i, increment the count.

//5. Check if the number is prime:
//   After the inner loop, if count is still 2, it means n has only 2 factors (1 and itself), so it is a prime number.

//6. Print n as a prime number.

public class PrimeNumberInGivenRange {

    public static void main(String[] args)
    {
        for (int n = 1; n <= 100 ; n++)
        {
            if(n == 0 || n == 1)
            {
                continue;
            }

            int count = 2;

            for (int i = 2; i <= n/2 ; i++)
            {
                if (n % i == 0)
                {
                    count++;
                }

            }

            if (count == 2)
            {
                System.out.println("Prime Numbers "+n);
            }

        }

    }
}
