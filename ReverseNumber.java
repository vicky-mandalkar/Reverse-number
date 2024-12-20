package Interview_Coding_Question_Practice;

import java.util.Scanner;

public class ReverseNumber
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a any number :");
            int n=sc.nextInt();
            int reverse = 0;
            while(n != 0)
            {
                int remainder = n % 10;
                reverse = reverse * 10 + remainder;
                n = n/10;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }
    }

// output=Enter a any number :
// 123456
// The reverse of the given number is: 654321
