import java.io.*;
import java.util.*;
public class Formathematiciansonly {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int t = v.nextInt();
        long mod = (long) 1e9 + 7;
        while (t-- > 0) {
            long a = v.nextLong();
            long b = v.nextLong();
            long c = v.nextLong();
            if (a % mod == 0) {
                long exp = modPow(b, c, mod);
                long exponent = (b == 0 || c == 0) ? modPow(b, c, 1) : 0;
                System.out.println(exponent == 0 ? 1 : 0);
            } else {
                long e = modPow(b, c, mod - 1);
                System.out.println(modPow(a, e, mod));
            }
        }
    }

    public static long modPow(long a, long b, long mod) {
        if (mod == 1) return 0;
        long res = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}