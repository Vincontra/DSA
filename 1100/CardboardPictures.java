import java.util.Scanner;
public class CardboardPictures {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long c=v.nextLong();
            long sum=0;
            long sumSq=0;
            for (int i=0;i<n;i++){
                int val=v.nextInt();
                sumSq+=(long)val*val;
                sum+=val;
            }
            long l=1;
            long h=1000000000;
            while (l<=h){
                long midW=(h-l)/2+l;
                long val=func(n,midW,sum,sumSq,c);
                if (c==val){
                    System.out.println(midW);
                    break;
                }
                else if (c>val){
                    l=midW+1;
                }else{
                    h=midW-1;
                }
            }
        }
    }
    public static long func(int n,long midW,long sum,long sumSq,long c){
        long res=0;

        if (midW>0 && n>Long.MAX_VALUE/(4*midW*midW)){
            return c+1;
        }
        res+=4*n*midW*midW;
        if (res>c){
            return c+1;
        }

        if (midW>0&&sum>Long.MAX_VALUE/(4*midW)){
            return c+1;
        }
        res+=4*midW*sum;
        if (res>c){
            return c+1;
        }
        res+=sumSq;
        return res;
    }
}