/**
 * Zero Cool Quiz
 * Created by Logan on 7/14/14.
 */

/**
Objective:
Write a program that prints the numbers from 1 to 100.
1. For multiples of three print "Zero" instead of the number
2. For the multiples of five print "Cool".
3. For numbers which are multiples of both three and five print "ZeroCool"
*/

public class Main
{
    public static void main(String[] args)
    {
        for(int i=1; i<=100; i++)
        {
            if (i % 3 == 0 && i % 5 != 0)  // multiples of three
            {
                System.out.println("Zero"); // Displays "Zero"
            }
            else if (i % 3 != 0 && i % 5 == 0) // multiples of five
            {
                System.out.println("Cool"); // Displays "Cool"
            }
            else if (i % 3 == 0 && i % 5 == 0) // multiples of five and three
            {
                System.out.println("ZeroCool"); // Displays "ZeroCool"
            }
            else
            {
            System.out.println(i); // Displays the number
            }
        }
    }
}
