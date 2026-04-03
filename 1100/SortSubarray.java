import java.util.Scanner;
public class SortSubarray {
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int arr[]=new int[n];
            int brr[]=new int[n];

            for (int i=0;i<n;i++){
                arr[i]=v.nextInt();
            }

            for (int j=0;j<n;j++){
                brr[j]=v.nextInt();
            }

            int firstidx=-1;
            int last=-1;

            boolean check=true;

            for (int i=0;i<n;i++){
                if (arr[i]!=brr[i]){
                    if (check){
                        firstidx=i;
                        check=false;
                    }else {
                        last=i;
                        break;
                    }
                }
            }

            if (last==-1){
                last=firstidx;
            }

            int i=firstidx-1;

            while (i>=0){
                if (brr[i]<=brr[i+1]){
                    i--;
                } else {
                    break;
                }
            }
            firstidx=i+1;

            int j=last+1;
            while (j<n){
                if (brr[j]>=brr[j-1]){
                    j++;
                }else {
                    break;
                }
            }
            last=j-1;
            System.out.println((firstidx+1)+" "+ (last+1));
        }
    }
}