import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LiHuaandPattern {
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
        long k=fr.nextLong();
        int arr[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=fr.nextInt();
            }
        }
        int brr[][]=ArrayAfterRotation(arr);
        int cnt=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i][j]!=brr[i][j]){
                    cnt++;
                }
            }
        }
        cnt/=2;
        if (cnt <= k) {
            long extra = k - cnt;
            if (extra % 2 == 0 || n % 2 == 1) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
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

    public static int[][] ArrayAfterRotation(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int brr[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                brr[n-1-i][m-1-j]=arr[i][j];
            }
        }
        return brr;
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
