//class Solution {
//    public int kthGrammar(int n, int k) {
//        String s = "0";
//        int level = 1;
//        StringBuilder curr = new StringBuilder(s);
//        Func(s, n, level, curr, k);
//        return curr.charAt(k - 1)-'0';
//    }
//
//    public static void Func(String s, int n, int level, StringBuilder curr, int k) {
//        if (level==n||curr.length()>=k){
//            return;
//        }
//        Insert(curr,s,0,k);
//        Func(curr.toString(),n,level + 1, curr, k);
//    }
//
//    public static void Insert(StringBuilder curr, String s, int i, int k) {
//        if (i==s.length()||curr.length()>=k){
//            return;
//        }
//        if(s.charAt(i)=='0'){
//            curr.append('1');
//        }
//        else{
//            curr.append('0');
//        }
//        Insert(curr, s, i + 1, k);
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.kthGrammar(3,2));
//
//    }
//}


public class KthSymInGrammer {
    public static void main(String[] args) {
        System.out.println(func(2,2));

    }
    public static int func(int n,int k){
        if (n==1&&k==1){
            return 0;
        }

        int mid=(1<<(n-1))/2;
        if (k<=mid){
            return func(n-1,k);
        }
        else{
            int tog=(func(n-1, k-mid));
            if (tog==0){
                return 1;
            }else{
                return 0;
            }
        }
    }
}