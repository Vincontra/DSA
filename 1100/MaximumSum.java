import java.io.*;
import java.util.*;
public class MaximumSum {

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int k = fr.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = fr.nextLong();
            }
            Arrays.sort(a);
            long[] pref = new long[n + 1];
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + a[i];
            }
            long[] suf = new long[n + 1];
            for (int i = n - 1; i >= 0; i--) {
                suf[i] = suf[i + 1] + a[i];
            }
            long total = suf[0];
            long ans = 0;
            for (int x = 0; x <= k; x++) {
                int y = k - x;
                long removedSmall = pref[2 * x];
                long removedLarge = suf[n - y];
                long curr = total - removedSmall - removedLarge;
                ans = Math.max(ans, curr);
            }
            out.println(ans);
        }
        out.flush();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
