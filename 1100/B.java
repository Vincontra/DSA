import java.util.*;
import java.io.*;

public class B{

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            long k = Long.parseLong(nk[1]);

            String[] arr = br.readLine().split(" ");
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(arr[i]);
            }
            long[] result = Arrays.copyOf(a, n);
            int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
            boolean found = false;
            for (int p : primes) {
                if (gcd(k, p) == 1) {
                    long[] temp = Arrays.copyOf(a, n);
                    long maxOps = 0;
                    boolean canSolve = true;

                    for (int i = 0; i < n; i++) {
                        long rem = temp[i] % p;
                        if (rem != 0) {
                            long target = (p - rem) % p;
                            long j = 0;
                            for (long attempt = 1; attempt < p; attempt++) {
                                if ((attempt * k) % p == target) {
                                    j = attempt;
                                    break;
                                }
                            }
                            if (j == 0) {
                                canSolve = false;
                                break;
                            }
                            temp[i] += j * k;
                            maxOps = Math.max(maxOps, j);
                        }
                    }
                    if (canSolve && maxOps <= k) {
                        result = temp;
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                for (int i = 0; i < n; i++) {
                    result[i] += k;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(result[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}