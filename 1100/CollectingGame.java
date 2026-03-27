import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class CollectingGame {
    public static void main(String args[]){
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while(t-->0){
            int n=v.nextInt();
            ArrayList<Pair>l1=new ArrayList<>();
            for (int i=0;i<n;i++){
                int curr=v.nextInt();
                l1.add(new Pair(curr,i));
            }
            Collections.sort(l1,(a,b)-> a.val-b.val);

            long pfx[]=new long[n];
            pfx[0]=l1.get(0).val;
            for (int i=1;i<n;i++){
                pfx[i]=pfx[i-1]+l1.get(i).val;
            }

            long arr[]=new long[n];

            for (int i=0;i<l1.size();i++){
                long cnt=0;
                long sum=l1.get(i).val;
                int l=i+1;
                int r=l1.size()-1;
                if (i>0){
                    sum+=pfx[i-1];
                    cnt+=(i);
                }
                cnt+=BS(l,r,sum,l1,pfx);
                arr[l1.get(i).i]=cnt;
            }

            for (int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static int BS(int l,int r,long sum,ArrayList<Pair>l1,long pfx[]){
        int cnt=0;
        while (l<=r){
            int mid=(r-l)/2+l;
            if (l1.get(mid).val<=sum){
                long segmentSum = pfx[mid]-(l>0?pfx[l-1]:0);
                sum+=segmentSum;
                cnt+=mid-l+1;
                l=mid+1;
                r=pfx.length-1;
            }
            else{
                r=mid-1;
            }
        }
        return cnt;
    }
    static class Pair{
        int val;
        int i;
        public Pair(int a,int i){
            this.val =a;
            this.i=i;
        }
    }
}

//import java.util.*;
//public class CollectingGame {
//    public static void main(String args[]){
//        Scanner v = new Scanner(System.in);
//        int t = v.nextInt();
//        while(t-- > 0){
//            int n = v.nextInt();
//            ArrayList<Pair> l1 = new ArrayList<>();
//            for (int i = 0; i < n; i++){
//                int curr = v.nextInt();
//                l1.add(new Pair(curr, i));
//            }
//            Collections.sort(l1, (a, b) -> a.val - b.val);
//            long pfx[] = new long[n];
//            pfx[0] = l1.get(0).val;
//            for (int i = 1; i < n; i++){
//                pfx[i] = pfx[i - 1] + l1.get(i).val;
//            }
//            long arr[] = new long[n];
//
//            for (int i = 0; i < n; i++){
//                long sum = l1.get(i).val;
//                int cnt = 0;
//                if (i > 0){
//                    sum+=pfx[i-1];
//                    cnt+=i;
//                }
//                int j=i;
//                int found=i;
//                while (j < n){
//                    long target=sum;
//                    int l=j+1;
//                    int r=n-1;
//                    int idx=j;
//                    while (l<=r){
//                        int mid = (l + r) / 2;
//                        if (l1.get(mid).val<=target){
//                            idx = mid;
//                            l=mid+1;
//                        }
//                        else{
//                            r=mid-1;
//                        }
//                    }
//                    if (idx == j){
//                        break;
//                    }
//                    sum+=pfx[idx] - pfx[j];
//                    found+=(idx-j);
//                    j=idx;
//                }
//                arr[l1.get(i).i]=found;
//            }
//
//            for (int i = 0; i < n; i++){
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }
//    }
//    static class Pair{
//        int val;
//        int i;
//        public Pair(int a,int i){
//            this.val = a;
//            this.i = i;
//        }
//    }
//}