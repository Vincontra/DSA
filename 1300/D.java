import java.io.*;
import java.util.*;
public class D {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        StringBuilder out = new StringBuilder();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++){
                b[i] = fr.nextInt();
            }
            ArrayList<ArrayList<Integer>> pos = new ArrayList<>(n + 1);
            for (int i = 0; i <= n; i++) {
                pos.add(new ArrayList<>());
            }
            for (int i = 0; i < n; i++){
                pos.get(b[i]).add(i);
            }
            boolean ok = true;
            int[] a = new int[n];
            int label = 0;
            for (int v = 1; v <= n; v++) {
                int cnt = pos.get(v).size();
                if (cnt == 0) continue;
                if (cnt % v != 0) { ok = false; break; }

                for (int start = 0; start < cnt; start += v) {
                    label++;
                    for (int k = 0; k < v; k++) {
                        int idx = pos.get(v).get(start + k);
                        a[idx] = label;
                    }
                }
            }

            if (!ok) {
                out.append("-1\n");
            } else {
                for (int i = 0; i < n; i++) {
                    out.append(a[i]);
                    if (i + 1 < n) out.append(' ');
                }
                out.append('\n');
            }
        }
        System.out.print(out.toString());
    }
}
