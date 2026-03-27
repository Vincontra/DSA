//import java.util.HashMap;
//import java.util.Scanner;
//public class EggDroppingProblem {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        HashMap<String,Integer>hashMap = new HashMap<>();
//        System.out.println(solve(1,2,hashMap));
//    }
//    public static int solve(int e,int f,HashMap<String,Integer>hm) {
//        if (f==0||f==1){
//            return f;
//        }
//        if (e==1){
//            return f;
//        }
//        int min=Integer.MAX_VALUE;
//        String Key=e+"_"+f;
//        if (hm.containsKey(Key)){
//            return hm.get(Key);
//        }
//        for (int k=1;k<=f;k++){
//            String a=(e-1)+"_"+(f-k);
//            int breakNhiHoga=0;
//
//            if (hm.containsKey(a)){
//                breakNhiHoga=hm.get(a);
//            }
//            else{
//                breakNhiHoga=solve(e,f-k,hm);
//            }
//
//            String b=(e-1)+"_"+(k-1);
//            int breakHoga=0;
//            if (hm.containsKey(b)){
//                breakHoga=hm.get(b);
//            }
//            else{
//                breakHoga=solve(e-1,k-1,hm);
//            }
//            // apne ko worst case me best ans chahiye
//            // worst case yane 2 me se kisi ek me apna
//            // best ans ayega
//
//            int temp=1+Math.max(breakHoga,breakNhiHoga);
//            min=Math.min(min,temp);
//        }
//        hm.put(Key,min);
//        return min;
//    }
//}

import java.util.Scanner;
class SuperEggDropLc {
    public int superEggDrop(int k, int n) {
        int t[][] = new int[k+1][n+1];
        for(int i=0;i<=k;i++){
            for (int j=0;j<=n;j++){
                t[i][j]=-1;
            }
        }
        return solve(k,n,t);
    }
    public int solve(int e,int f,int t[][]){
        if(f==0||f==1){
            return f;
        }
        if(e==1){
            return f;
        }
        if(t[e][f]!=-1){
            return t[e][f];
        }
        int min=Integer.MAX_VALUE;
        int low=1;
        int high=f;
        while(low<=high){
            int mid=low+(high-low)/2;
            int breakNhiHoga;
            int breakHoga;
            if (t[e][f-mid]!=-1){
                breakNhiHoga=t[e][f-mid];
            }else{
                breakNhiHoga=solve(e,f-mid,t);
            }
            if(t[e-1][mid-1]!=-1)
            {
                breakHoga=t[e-1][mid-1];
            }
            else{
                breakHoga=solve(e-1,mid-1,t);
            }
            int temp=1+Math.max(breakHoga, breakNhiHoga);
            min=Math.min(min,temp);
            if (breakHoga>breakNhiHoga){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
//        for(int k=1;k<=f;k++){
//            int breakNhiHoga;
//            int breakHoga;
//            if(t[e][f-k]!=-1)
//            {
//                breakNhiHoga=t[e][f-k];
//            }
//            else{
//                breakNhiHoga=solve(e,f-k,t);
//            }
//
//            if(t[e-1][k-1]!=-1)
//            {
//                breakHoga=t[e-1][k-1];
//            }
//            else{
//                breakHoga=solve(e-1,k-1,t);
//            }
//            int temp=1+Math.max(breakHoga, breakNhiHoga);
//            min=Math.min(min,temp);
//        }

        return t[e][f]=min;
    }

    public static void main(String[] args) {
        SuperEggDropLc superEggDropLc = new SuperEggDropLc();
        Scanner v=new Scanner(System.in);
        int k=v.nextInt();
        int f=v.nextInt();
        System.out.println(superEggDropLc.superEggDrop(k,f));

    }
}