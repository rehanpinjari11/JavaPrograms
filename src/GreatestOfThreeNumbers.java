public class GreatestOfThreeNumbers {

    //Step 1: Initialize Variables:
    //Declare and initialize three integer variables num1, num2, and num3 with the given values.

    //Step 2: Comparison Logic:
    //Compare num1 with num2.
    //If num1 is greater than num2, print that num1 is the greatest among the three numbers.
    //Else, compare num2 with num3.
    //If num2 is greater than num3, print that num2 is the greatest among the three numbers.
    //If neither num1 is greater than num2 nor num2 is greater than num3, print that num3 is the greatest among the three numbers.

    public static void main(String[] args)
    {

        int num1 = 546;
        int num2 = 65;
        int num3 = 112;

        //Using
        if(num1 > num2)
        {
            System.out.println(num1+" is the Greatest among Three Numbers");
        }
        else if (num2 > num3)
        {
            System.out.println(num2+" is the Greatest among Three Numbers");
        }
        else
        {
            System.out.println(num3+" is the Greatest among Three Numbers");
        }
    }
}
