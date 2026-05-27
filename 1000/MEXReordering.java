import java.util.Scanner;

public class MEXReordering {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int arr[]=new int[n];
            int cntz=0;
            int cnto=0;
            for (int i=0;i<n;i++){
                arr[i]=v.nextInt();
                if (arr[i]==0)cntz++;
                if (arr[i]==1)cnto++;
            }

            if (cntz==0){
                System.out.println("No");
            }
            else if (cntz==1){
                System.out.println("Yes");
            }
            else{
                if (cnto==0){
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                }
            }
        }
    }
}
