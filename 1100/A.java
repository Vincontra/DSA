import java.util.*;
public class A{
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int t = v.nextInt();
        while (t-- > 0) {
            long n = v.nextLong();
            long a = v.nextLong();
            long b = v.nextLong();
            if ( ( (n - b) & 1L ) == 1L ) {
                System.out.println("NO");
            }
            else if (a <= b) {
                System.out.println("YES");
            }
            else {
                System.out.println( ( (n - a) & 1L ) == 0L ? "YES" : "NO" );
            }
        }
    }
}
