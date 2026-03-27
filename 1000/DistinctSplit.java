//import java.util.*;
//public class DistinctSplit {
//    public static void main(String[] args) {
//        Scanner v = new Scanner(System.in);
//        int t = v.nextInt();
//        while (t-- > 0) {
//            int n = v.nextInt();
//            String curr = v.next();
//            HashSet<Character> hs = new HashSet<>();
//            int i = 0;
//            while (i < n && !hs.contains(curr.charAt(i))) {
//                hs.add(curr.charAt(i));
//                i++;
//            }
//            int lD = hs.size();
//            hs.clear();
//            while (i < n) {
//                hs.add(curr.charAt(i));
//                i++;
//            }
//            int lS = lD + hs.size();
//
//            hs.clear();
//            int j = n - 1;
//            while (j >= 0 && !hs.contains(curr.charAt(j))) {
//                hs.add(curr.charAt(j));
//                j--;
//            }
//            int rD = hs.size();
//            hs.clear();
//            while (j >= 0) {
//                hs.add(curr.charAt(j));
//                j--;
//            }
//            int rS = rD + hs.size();
//            System.out.println(Math.max(lS, rS));
//        }
//    }
//}
import java.util.*;
public class DistinctSplit {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            String curr=v.next();
            int pfx[]=new int[n];
            int sfx[]=new int[n];
            boolean seenpfx[]=new boolean[26];
            int unique=0;
            for (int i=0;i<n;i++){
                int c=curr.charAt(i)-'a';
                if (!seenpfx[c]){
                    seenpfx[c]=true;
                    unique++;
                }
                pfx[i]=unique;
            }
            boolean seensfx[]=new boolean[26];
            unique=0;
            for (int i=n-1;i>=0;i--){
                int c=curr.charAt(i)-'a';
                if (!seensfx[c]){
                    seensfx[c]=true;
                    unique++;
                }
                sfx[i]=unique;
            }
            int ans=0;
            for (int i=1;i<n;i++){
                ans=Math.max(ans,pfx[i-1]+sfx[i]);
            }
            System.out.println(ans);
        }
    }
}