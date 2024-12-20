package Interview_Coding_Question_Practice;

import java.util.Scanner;

public class Fibonacci_Ntn_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int First=0;
        int Second=1;
        if (n<=0){
            System.out.println("n is nevar zero and negative");
        }
        if(n==1){
            System.out.println(First);
        } else if (n==2) {
            System.out.println(Second);

        }
        else {
            int curr=0;
            for (int i=3;i<=n;i++){
                curr=First+Second;
                First=Second;
                Second=curr;
            }
            System.out.println("the" +n+ "th febinacci no is "+curr);
        }
    }

}
//output=6
//the6th febinacci no is 5
