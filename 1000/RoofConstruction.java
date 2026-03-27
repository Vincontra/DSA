import java.util.*;
public class RoofConstruction {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
             n-=1;
            int cnt=0;
            int N=n;
            while(N>1){
                cnt++;
                N/=2;
            }
            int Ans=1<<cnt;
            for (int i=Ans-1;i>=0;i--){
                System.out.print(i+" ");
            }
            for (int i=Ans;i<=n;i++){
                System.out.print(i+" ");
            }
            System.out.println();


        }

    }
}
