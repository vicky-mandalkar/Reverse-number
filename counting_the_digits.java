package Interview_Coding_Question_Practice;

import java.util.Scanner;

public class counting_the_digits {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        while (n>0){
            n=n/10;
            count++;

        }
        System.out.println(" digit is "+count);
    }
}
