import java.io.*;
import java.util.*;

public class YarikandArray {
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
        int nextInt() throws IOException { return Integer.parseInt(next()); }
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = fr.nextInt();
            }
            int ans = arr[0];
            int curr = arr[0];
            for (int i = 1; i < n; i++) {
                if (Math.abs(arr[i] % 2)!=Math.abs(arr[i - 1] % 2)) {
                    curr=Math.max(arr[i], curr + arr[i]);  // -1 4 -1 0 5 -4
                }
                else {
                    curr=arr[i];
                }
                ans=Math.max(ans, curr);
            }
            out.println(ans);
        }
        out.flush();
    }
}
