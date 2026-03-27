import java.util.Scanner;
public class Print1ToN {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        //Print(n);
       // System.out.println(Sum(n));
        //PrintN_To_1(n);
       // System.out.println(factorial(n));




    }

    public static void Print(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        Print(n-1);
        System.out.println(n);
    }
    public static int Sum(int n){
        if (n<=0){
            return -1;
        }
        if (n==1){
            return 1;
        }
        int s=Sum(n-1);
        return s+n;
    }
    public static void PrintN_To_1(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PrintN_To_1(n-1);

    }

    public static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
