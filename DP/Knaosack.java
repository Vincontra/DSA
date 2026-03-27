import java.util.Scanner;
public class Knaosack {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int wt[]={1,2,3,4,5};
        int val[]={3,4,5,6,7};
        int maxC=10;
        int n=wt.length;
        int ans=Knap(wt,val,maxC, n);
        System.out.println(ans);
    }
    public static int Knap(int wt[],int val[],int maxC,int n){
        if (n==0||maxC==0){
            return 0;
        }
        if (wt[n-1]<=maxC){
            return Math.max(val[n-1]+Knap(wt,val,maxC-wt[n-1],n-1),Knap(wt,val,maxC,n-1));
        }else{
            return Knap(wt,val,maxC,n-1);
        }
    }
}
