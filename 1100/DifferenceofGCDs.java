import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class DifferenceofGCDs {
    static FastReader fr=new FastReader();
    static PrintWriter out=new PrintWriter(System.out);
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

    public static void main(String[] args) {
        int t=1;
        t=fr.nextInt();
        while (t-->0){
            solve();
        }
        out.flush();

    }
    public static void solve(){
        long n=fr.nextLong();
        long l=fr.nextLong();
        long r=fr.nextLong();
        long arr[]=new long[(int)n];
        boolean  check=false;
        for (int i=0;i<n;i++){
            int idx=i+1;
            long N=(long)Math.ceil(l/idx);
            long M=(long)Math.floor(r/idx);
            if (idx*N>=l&& idx*N<=r){
                arr[i]=idx*N;
            }
            else{
                if (idx*M<=r&&idx*M>=l){
                    arr[i]=idx*M;
                }else{
                    check=true;
                    break;
                }
            }
        }
        if (!check){
            System.out.println("Yes");
            for (int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }else{
            System.out.println("No");
        }

    }
    public static long gcd(long a,long b){
        while (b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

}
