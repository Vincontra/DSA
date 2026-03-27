//import java.util.*;
//public class BeautifulNumbers {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        int t=v.nextInt();
//        while (t-->0){
//            long x=v.nextLong();
//            long sum=0;
//            ArrayList<Long>l1=new ArrayList<>();
//            while (x>0){
//                long d=x%10;
//                sum+=d;
//                l1.add(d);
//                x/=10;
//            }
//            Collections.reverse(l1);
//            l1.subList(1,l1.size()).sort(Collections.reverseOrder());
//            long ans=0;
//
//            if (l1.size()>=2&&l1.get(0)-1>=l1.get(1)){
//                ans++;
//                sum-=l1.get(0)-1;
//            }
//            int i=1;
//            while(sum>9&&i<l1.size()){
//                sum-=l1.get(i);
//                ans++;
//                i++;
//            }
//            System.out.println(ans);
//        }
//    }
//}


import java.util.*;
public class BeautifulNumbers {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            long x=v.nextLong();
            long sum=0;
            ArrayList<Long>l1=new ArrayList<>();
            while (x>0){
                long d=x%10;
                sum+=d;
                l1.add(d);
                x/=10;
            }
            Collections.reverse(l1);
            if (l1.size()>1){
                l1.subList(1,l1.size()).sort(Collections.reverseOrder());
            }
            long ans=0;
            long fR=l1.get(0)-1;
            boolean fU=false;
            int i=1;
            while (sum>9){
                long oR=(i<l1.size())?l1.get(i):-1;
                if (!fU&&fR>=oR){
                    sum-=fR;
                    fU=true;
                }
                else {
                    sum-=oR;
                    i++;
                }
                ans++;
            }
            System.out.println(ans);
        }
    }
}