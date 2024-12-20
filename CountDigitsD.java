package Interview_Coding_Question_Practice;
import java.util.Scanner;

public class CountDigitsD {
    public static int cntDig(int n,int d){
        if(n==0 && d==0){
            return 1;
        }
        if (n<0){
            n=-n;
        }
        int cnt=0;
        while (n!=0){
            int dig=n%10;

            if(dig==d){
                cnt++;
            }
            n=n/10;

        }
        return  cnt;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int D=sc.nextInt();
        System.out.println("the total count of digit "+ D +"occuring in the numbew "+N+"is :"+cntDig(N,D));

    }
}
//123322323
//        3
//the total count of digit 3occuring in the numbew 123322323is :4