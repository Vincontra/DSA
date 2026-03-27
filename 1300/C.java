import java.io.*;
import java.util.*;
public class C {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        StringBuilder sb = new StringBuilder();
        int t = fr.nextInt();
        while (t-- > 0) {
            long a = fr.nextLong();
            long b = fr.nextLong();
            if ((a % 2 == 0 && b % 2 == 1) || (a % 2 == 1 && (b % 4 == 2))) {
                sb.append(-1).append('\n');
                continue;
            }
            if ((a % 2 == 1) && (b % 2 == 1)) {
                sb.append(a * b + 1).append('\n');
                continue;
            }
            sb.append(a * (b / 2) + 2).append('\n');
        }
        System.out.print(sb.toString());
    }
    static class FastReader {
        BufferedReader br; StringTokenizer st;
        FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { return null; }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}
