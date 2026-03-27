import java.util.*;
public class c{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        StringBuilder vinay=new StringBuilder();
        while(t-->0){
            int n=v.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=v.nextLong();
            }
            long base=0;
            for(int i=0;i<n;i++){
                base+=(i%2==0?a[i]:-a[i]);
            }
            long mnOp=Long.MAX_VALUE,mxEp=Long.MIN_VALUE;
            long mxEm=Long.MIN_VALUE,mnOm=Long.MAX_VALUE;
            int mnOi=Integer.MAX_VALUE,mxOi=Integer.MIN_VALUE;
            int mnEi=Integer.MAX_VALUE,mxEi=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int idx=i+1;
                if((idx&1)==1){
                    long vp=2*a[i]+idx,vm=2*a[i]-idx;
                    mnOp=Math.min(mnOp,vp);
                    mnOm=Math.min(mnOm,vm);
                    mnOi=Math.min(mnOi,idx);
                    mxOi=Math.max(mxOi,idx);
                }
                else{
                    long vp=2*a[i]+idx,vm=2*a[i]-idx;
                    mxEp=Math.max(mxEp,vp);
                    mxEm=Math.max(mxEm,vm);
                    mnEi=Math.min(mnEi,idx);
                    mxEi=Math.max(mxEi,idx);
                }
            }
            long gain=0;
            if(mxEp!=Long.MIN_VALUE && mnOp!=Long.MAX_VALUE) {
                gain=Math.max(gain,mxEp-mnOp);
            }
            if(mxEm!=Long.MIN_VALUE && mnOm!=Long.MAX_VALUE) {
                gain=Math.max(gain,mxEm-mnOm);
            }
            if(mxOi!=Integer.MIN_VALUE && mnOi!=Integer.MAX_VALUE){
                gain=Math.max(gain,mxOi-mnOi);
            }
            if(mxEi!=Integer.MIN_VALUE && mnEi!=Integer.MAX_VALUE){
                gain=Math.max(gain,mxEi-mnEi);
            }
            vinay.append(base+gain).append('\n');
        }
        System.out.print(vinay);
        v.close();
    }
}
