import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class GCDPartition {
    static FastReader fr=new FastReader();
    static PrintWriter out=new PrintWriter(System.out);

    public static void main(String args[]){
        int t=1;
        t=fr.nextInt();
        while (t-->0){
            solve();
        }
        out.flush();

    }

    public static void solve(){
        int n=fr.nextInt();
        long arr[]=new long[n];
        long sum=0;
        for (int i=0;i<n;i++){
            arr[i]=fr.nextLong();
            sum+=arr[i];
        }
        long pfx[]=new long[n];
        pfx[0]=arr[0];
        for (int i=1;i<n;i++){
            pfx[i]=pfx[i-1]+arr[i];
        }
        long ans=1;
        for (int i=0;i<=n-2;i++){
            ans=Math.max(ans,gcd(pfx[i],sum-pfx[i]));
        }
        out.println(ans);
    }

    public static long gcd(long a,long b){
        while (b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

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
