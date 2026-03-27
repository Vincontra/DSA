import java.io.*;
import java.util.*;
public class Main {
    static FastReader fr = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    // Constants
    static final int MOD = (int)1e9 + 7;
    static final int INF = (int)1e9;

    public static void main(String[] args) {
        int t = 1; // default = 1 (Codeforces often gives multiple test cases)
        t = fr.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        // write solution logic here
        int n = fr.nextInt();

        // Example: minimum number of steps to make sum using {5,4,3,2,1}
        int count = 0;
        for (int i = 5; i > 0; i--) {
            count += n / i;
            n %= i;
        }

        out.println(count);
    }

    // -------- Utility functions --------
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (int)((1L * a * b) / gcd(a, b));
    }

    static long modPow(long a, long b, long mod) {
        long res = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }

    // -------- FastReader --------
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
