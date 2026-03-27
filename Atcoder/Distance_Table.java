import java.util.Scanner;
public class Distance_Table {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int arr[]=new int[n-1];
        for (int i=0;i<arr.length;i++){
            arr[i]=v.nextInt();
        }
        int pfx[]=new int[n-1];
        pfx[0]=arr[0];
        for (int i=1;i<n-1;i++){
            pfx[i]=arr[i]+pfx[i-1];
        }
        int tobesub=0;
        for (int i=0;i<arr.length;i++){
            if (i!=0){
                tobesub=pfx[i-1];
            }
            for (int j=i;j< arr.length;j++){
                System.out.print(pfx[j]-tobesub+" ");
            }
            System.out.println();

        }


    }
}
