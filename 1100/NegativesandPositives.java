import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NegativesandPositives {
    static FastReader fr = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    // Constants
    static final int MOD = (int)1e9 + 7;
    static final int INF = (int)1e9;

    public static void main(String[] args) {
        int t = 1;
        t = fr.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        // write solution logic here
        long n = fr.nextLong();
        long arr[] = new long[(int)n];
        long sumAbsolute=0;
        long cntZ=0;
        long cntN=0;
        long min=Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextLong();
            if (arr[i]<0){
                cntN++;
            }
            if (arr[i]==0){
                cntZ++;
            }
            sumAbsolute+=Math.abs(arr[i]);
            min=Math.min(min,Math.abs(arr[i]));
        }
        if (cntN%2==0||cntZ>0){
            out.println(sumAbsolute);
        }
        else{
            out.println(sumAbsolute-2*min);
        }
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
