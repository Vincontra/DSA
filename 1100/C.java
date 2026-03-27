import java.io.*;
import java.util.*;

public class C{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            long[] a = new long[n + 1]; // 1-indexed
            for (int i = 1; i <= n; i++) {
                a[i] = fr.nextLong();
            }

            long prefEven = 0, prefOdd = 0;
            long ans = 0;
            long prevDelta = 0; // Δ[0] = 0

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) prefEven += a[i];
                else prefOdd += a[i];

                long delta = prefEven - prefOdd;

                if (delta < prevDelta) {
                    ans += (prevDelta - delta);
                    delta = prevDelta; // enforce non-decreasing
                }

                prevDelta = delta;
            }

            out.println(ans);
        }

        out.flush();
    }
}
