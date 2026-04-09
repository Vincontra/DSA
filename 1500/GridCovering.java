import java.util.Scanner;
public class GridCovering {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            // logic: if we want to traverse the row then that dimension must have gcd as 1
            // simliar to col as well
            // but one thing is even if this happens
            // if somehow we reach to start pos without marking all the grid cells
            // then it is impossible
            // how to check that
            // just check the gcd for n and m <3
            // this is just observation if the gcd is >=3 we will be at start pos without marking all
            // so after that also this cycle repeats so no use
            long n=v.nextLong(),m=v.nextLong(),a=v.nextLong(),b=v.nextLong();
            if (gcd(n,a)==1&&gcd(m,b)==1&&gcd(n,m)<3){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    public static long gcd(long a,long b){
        while (b!=0){
            long t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}
