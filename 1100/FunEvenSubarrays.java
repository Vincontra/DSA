import java.util.Scanner;

public class FunEvenSubarrays {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0) {
            int n=v.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextInt();
            }
            int ans=0;
            int i=n-1;

            while(i>=0&&arr[i]==arr[n-1]){
                i--;
            }

            if (i==-1){
                System.out.println(0);
            }
            else{
                while (i>=0){
                    i=i-(n-1-i);
                    ans++;
                    while (i>=0&&arr[i]==arr[n-1]){
                        i--;
                    }
                }
                System.out.println(ans);
            }
        }
    }
    // Time Complexity (TC): O(n)
    // Space Complexity (SC): O(n)
}
