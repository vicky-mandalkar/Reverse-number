package Interview_Coding_Question_Practice;
import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num:");
        int n=sc.nextInt();
        int  Fnum=0,Snum=1;
        int Nextnum;
        for (int i=1;i<=n;i++){
            System.out.print(Fnum+" ");
            Nextnum=Fnum+Snum;
            Fnum=Snum;
            Snum=Nextnum;
        }

    }
}

