import java.io.*;
import java.util.*;

public class E {
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
        long k = fr.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = fr.nextInt();

        // If k == 0 sum original
        if (k == 0) {
            long sum = 0;
            for (int x : a) sum += x;
            out.println(sum);
            return;
        }

        // first time laga rhe hai
        int[] b = change(a);
        if (k == 1) {
            long sum = 0;
            for (int x : b) sum += x;
            out.println(sum);
            return;
        }
        // iske baad to stable ho jayega so we dont need to do it further
        int[] c = change(b);
        long sum = 0;
        for (int x : c) {
            sum += x;
        }
        out.println(sum);
    }
    static int[] change(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        boolean[] present = new boolean[n + 2];
        for (int x : a) {
            if (x <= n + 1) {
                present[x] = true;
            }
        }
        int mex = 0;
        while (present[mex]){
            mex++;
        }

        // For each i compute mex(all except a[i])
        // Trick: if a[i] != mex then mex(all except a[i]) = mex
        // else we need to recompute by "removing" a[i]
        int[] freq = new int[n + 2];
        for (int x : a) {
            if (x <= n + 1) {
                freq[x]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != mex) {
                res[i] = mex;
            }
            else {
                // If we remove a[i], freq[a[i]] decreases
                if (freq[a[i]] > 1) {
                    res[i] = mex;
                } else {
                    // recompute mex when this element is excluded
                    int m2 = mex;
                    while (m2 <= n + 1 && freq[m2] > 0) {
                        m2++;
                    }
                    res[i] = m2;
                }
            }
        }
        return res;
    }

    // ---------- FastReader ----------
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}
