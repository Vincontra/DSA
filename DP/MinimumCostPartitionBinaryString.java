public class MinimumCostPartitionBinaryString {
    public static void main(String[] args) {
        String s = "1010";
        int e = 2;
        int f = 1;
        System.out.println(minCost(s, e, f));
    }
    public static long minCost(String s, int encCost, int flatCost) {
            int n=s.length();
            long pref[]=new long[n+1];
            for(int i=1;i<=n;i++){
                pref[i]=pref[i-1];
                if(s.charAt(i-1)=='1'){
                    pref[i]++;
                }
            }
            return func(s,encCost,flatCost,pref,1,n);
    }
    public static long func(String s,long encCost,long flatCost,long pref[],long l,long r){
            long cnt1=pref[(int)r]-pref[(int)l-1];
            long size=r-l+1;
            long cost;
            if(cnt1>0){
                cost=(long)(size*cnt1*encCost);
            }
            else{
                cost=(long)flatCost;
            }
            if(cnt1>0&&size%2==0){
                cost=(long)Math.min(cost,(long)func(s,encCost,flatCost,pref,l,l+(size/2)-1)+(long)func(s,encCost,flatCost,pref,l+(size/2),r));
            }
            return cost;
        }
    }





