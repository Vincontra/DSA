import java.util.*;
//public class JosephusProblem {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        int n=v.nextInt();
//        int k=v.nextInt();
//        ArrayList<Integer>list=new ArrayList<>();
//        for (int i=1;i<=n;i++){
//            list.add(i);
//        }
//        int ans=solve(list, 0,k);
//        System.out.println(ans);
//    }
//    public static int solve(ArrayList<Integer>list,int idx,int k){
//        if (list.size() == 1) {
//            return list.get(0);
//        }
//        idx=(idx+k-1)%list.size();
//        list.remove(idx);
//        return solve(list,idx,k);
//    }
//}

class Solution {
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer>l1=new ArrayList<>();
        for(int i=1;i<=n;i++){
            l1.add(i);
        }
        int idx=0;
        solve(idx,l1,k);
        return l1.get(0);
    }
    public static void solve(int idx,ArrayList<Integer>l1,int k){
        if(l1.size()==1){
            return;
        }
        idx=(idx+k-1)%l1.size();
        l1.remove(idx);
        solve(idx,l1,k);
    }

    public static void main(String[] args) {
        int ans=findTheWinner(6,5);
        System.out.println(ans);
    }
}