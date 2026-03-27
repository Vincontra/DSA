import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;
public class Coprime {
    static FastReader fr = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    // Constants
    static final int MOD = (int)1e9 + 7;
    static final int INF = (int)1e9;

    public static void main(String[] args) {
        int t = 1; // default = 1 (Codeforces often gives multiple test cases)
        t = fr.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        // write solution logic here
        int n = fr.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= fr.nextInt();
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i=0;i<n;i++){
            hm.put(arr[i],i+1);  // max index we are storing for unique one:
        }
        for (int a:hm.keySet()){
            int currIdx=hm.get(a);
            int currNo=a;
//            boolean check[]=new boolean[1001];
            // do not visit the same number as currNo and the one where we have already checked
            for (int i:hm.keySet()){
                // this loop will iterate only upto 1000 times max
                int no=i;
                int idx=hm.get(i);
                    if (gcd(currNo,no)==1){
                        sum=Math.max(sum,currIdx+idx);
                    }
            }
        }
        if (sum==0){
            out.println(-1);
        }else{
            out.println(sum);
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
