import java.io.*;
import java.util.*;
import java.math.*;

public class A{
    static FastReader fr = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        int t = fr.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        int n = fr.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) a[i] = fr.nextInt();
        for (int i = 0; i < n; i++) b[i] = fr.nextInt();
        for (int i = 0; i < n; i++) c[i] = fr.nextInt();

        long cnt1 = 0, cnt2 = 0;

        for (int j = 0; j < n; j++) {
            if (check(a, b, j, 0, n)) cnt1++;
        }

        for (int j = 0; j < n; j++) {
            if (check(b, c, 0, j, n)) cnt2++;
        }

        out.println(cnt1 * cnt2 * n);
    }

    static boolean check(int[] arr, int[] brr, int j, int k, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[(i + j) % n] >= brr[(i + k) % n]) {
                return false;
            }
        }
        return true;
    }


    // ---------- FastReader ----------
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

        int[] readIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = nextInt();
            return arr;
        }

        long[] readLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = nextLong();
            return arr;
        }
    }
}