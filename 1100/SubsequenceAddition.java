import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class SubsequenceAddition {
    static FastReader fr = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
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
        for (int i=0;i<n;i++){
            arr[i]=fr.nextInt();
        }
        Arrays.sort(arr);
        long pfx[]=new long[n];
        pfx[0]=arr[0];
        for (int i=1;i<n;i++){
            pfx[i]=pfx[i-1]+arr[i];
        }
        if (arr[0]==1){
            boolean check=true;
            for (int i=1;i<n;i++){
                if (arr[i]>pfx[i-1]){
                    check=false;
                    break;
                }
            }
            if (check){
                out.println("Yes");
            }else{
                out.println("No");
            }
        }
        else{
            out.println("No");
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
