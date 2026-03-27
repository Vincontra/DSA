//import java.io.*;
//import java.util.*;
//public class NoCostTooGreat {
//
//    static final int N = 200_010;
//    static ArrayList<ArrayList<Integer>>pfac=new ArrayList<>(N + 1);
//
//    static void precompute() {
//        for (int i = 0; i <= N; i++) {
//            pfac.add(new ArrayList<>());
//        }
//        for (int i = 2; i <= N; i++) {
//            if (!pfac.get(i).isEmpty()) {
//                continue;
//            }
//            for (int j = i; j <= N; j += i)
//                pfac.get(j).add(i);
//        }
//    }
//
//    static void solve(FastReader fr,PrintWriter out){
//        int n=fr.nextInt();
//        int[] a = new int[n];
//        int[] b = new int[n];
//        for (int i = 0; i < n; i++) a[i] = fr.nextInt();
//        for (int i = 0; i < n; i++) b[i] = fr.nextInt();
//        int ans = 2;
//        HashMap<Integer,Integer>cnt=new HashMap<>();
//        for (int num:a){
//            for (int x : pfac.get(num)){
//                if (cnt.getOrDefault(x, 0) > 0)
//                    ans = 0;
//                cnt.put(x, cnt.getOrDefault(x, 0) + 1);
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int x : pfac.get(a[i]))
//                cnt.put(x, cnt.get(x) - 1);
//
//            for (int x : pfac.get(a[i] + 1)) {
//                if (cnt.getOrDefault(x, 0) > 0)
//                    ans = Math.min(ans, 1);
//            }
//            for (int x : pfac.get(a[i]))
//                cnt.put(x, cnt.get(x) + 1);
//        }
//        out.println(ans);
//    }
//
//    public static void main(String[] args) throws IOException {
//        FastReader fr = new FastReader(System.in);
//        PrintWriter out = new PrintWriter(System.out);
//        precompute();
//        int t = fr.nextInt();
//        while (t-- > 0) {
//            solve(fr, out);
//        }
//
//        out.flush();
//    }
//
//    // ---------- Fast Input ----------
//    static class FastReader {
//        BufferedReader br;
//        StringTokenizer st;
//        FastReader(InputStream in) {
//            br = new BufferedReader(new InputStreamReader(in));
//        }
//        String next() {
//            while (st == null || !st.hasMoreTokens()) {
//                try { st = new StringTokenizer(br.readLine()); }
//                catch (IOException e) { throw new RuntimeException(e); }
//            }
//            return st.nextToken();
//        }
//        int nextInt() { return Integer.parseInt(next()); }
//    }
//}



