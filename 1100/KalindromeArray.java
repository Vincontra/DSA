import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class KalindromeArray {
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
            int n = fr.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextInt();
            }
            boolean check = true;
            int a1 = 0;
            int a2 = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != arr[n - 1 - i]) {
                    a1 = arr[i];
                    a2 = arr[n - 1 - i];
                    check = false;
                    break;
                }
            }

            if (check) {
                out.println("YES");
            } else {
                // try removing a1
                boolean ok1 = true;
                ArrayList<Integer> l1 = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (arr[i] != a1) {
                        l1.add(arr[i]);
                    }
                }
                for (int i = 0; i < l1.size(); i++) {
                    if (!l1.get(i).equals(l1.get(l1.size() - 1 - i))) {
                        ok1 = false;
                        break;
                    }
                }

                // try removing a2
                boolean ok2 = true;
                ArrayList<Integer> l2 = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (arr[i] != a2) {
                        l2.add(arr[i]);
                    }
                }
                for (int i = 0; i < l2.size(); i++) {
                    if (!l2.get(i).equals(l2.get(l2.size() - 1 - i))) {
                        ok2 = false;
                        break;
                    }
                }

                if (ok1 || ok2) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
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
