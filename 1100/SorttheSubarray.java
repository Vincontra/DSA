import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SorttheSubarray {
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
        int n=fr.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=fr.nextInt();
        }
        for (int i=0;i<n;i++){
            brr[i]=fr.nextInt();
        }
        int start = 0;
        int end = 0;
        int len = Integer.MIN_VALUE;
        int i = 1;
        while (i<n){
            if (brr[i - 1] <= brr[i]) {
                i++;
            }
            else {
                if (len < i - start) {
                    len = i - start;
                    end = i - 1;
                }
                start = i;
                i++;
            }
        }
        if (len < n-start) {
            len=n-start;
            end=n-1;
        }
        out.println((end - len + 2) + " " + (end + 1));
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
