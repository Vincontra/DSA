import java.util.Scanner;

public class Traveling_2D {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int k=v.nextInt();
            int a=v.nextInt();
            int b=v.nextInt();
            long arr[][]=new long[n][2];

            for (int i=0;i<n;i++){
                arr[i][0]=v.nextInt();
                arr[i][1]=v.nextInt();
            }

            long srcx=arr[0][0];
            long srcy=arr[0][1];

            if (a>0){
                srcx=arr[a-1][0];
                srcy=arr[a-1][1];
            }

            long minx=Long.MAX_VALUE;
            long miny=Long.MAX_VALUE;

            long destx=arr[0][0];
            long desty=arr[0][1];

            if (b>0){
                destx=arr[b-1][0];
                desty=arr[b-1][1];
            }

            for (int i=0;i<k;i++){
                minx=Math.min(minx,Math.abs(arr[i][0]-srcx)+Math.abs(arr[i][1]-srcy));
                miny=Math.min(miny,Math.abs(arr[i][0]-destx)+Math.abs(arr[i][1]-desty));
            }

            long ans=Math.min(minx+miny,Math.abs(desty-srcy)+Math.abs(destx-srcx));
            if (k==0){
                System.out.println(Math.abs(desty-srcy)+Math.abs(destx-srcx));
            }else{
                System.out.println(ans);
            }

        }
    }
}
