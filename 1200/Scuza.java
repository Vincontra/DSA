import java.util.Scanner;

public class Scuza {
    public static void main(String args[]){
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int q=v.nextInt();
            long arr[]=new long[n];
            for (int i=0;i<n;i++)arr[i]=v.nextLong();
            long pfx[]=new long[n];
            pfx[0]=arr[0];
            long pfxmax[]=new long[n];
            pfxmax[0]=arr[0];
            for (int i=1;i<n;i++){
                pfx[i]=pfx[i-1]+arr[i];
                pfxmax[i]=Math.max(pfxmax[i-1],arr[i]);
            }
            for (int i=0;i<q;i++){
                long curr=v.nextLong();
                if (curr==0){
                    System.out.print(0+" ");
                }
                else{
                    int lo=0;
                    int hi=arr.length-1;
                    int idx=0;
                    boolean check=false;
                    while (lo<=hi){
                        int mid=(hi-lo)/2+lo;
                        if (pfxmax[mid]<=curr){
                            check=true;
                            idx=mid;
                            lo=mid+1;
                        }else{
                            hi=mid-1;
                        }
                    }
                    if (check){
                        System.out.print(pfx[idx]+" ");
                    }else{
                        System.out.print(0+" ");
                    }

                }
            }
            System.out.println();
        }
    }
}
