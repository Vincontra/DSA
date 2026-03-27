import java.io.BufferedReader;
import java.util.*;
public class FairNumbers {
    public static void main(String args[]){
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            long n=v.nextLong();
            while(true){
                if (check(n)){
                    System.out.println(n);
                    break;
                }else{
                    n++;
                }
            }
        }

    }
    public static boolean check(long N){
        long n=N;
        while(n>0){
            long currdigit=n%10;
            if (currdigit!=0 && N%currdigit!=0){
                return false;
            }
            n/=10;
        }
        return true;

    }

}