import java.util.Scanner;
public class DifferentDivisors {
    static boolean arr[]=Seive(); // i make it global just to avoid recomputation each time:
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int d=v.nextInt();
            int first=1;
            int second=0;
            int cnt=0;
            for (int i=2;i<arr.length;i++){
                if (arr[i]){
                    if (i-first>=d){
                        second=first;
                        first=i;
                        cnt++;
                        if (cnt==2){
                            break;
                        }
                    }
                }
            }
            System.out.println(first*second);
        }

    }
    public static boolean[] Seive(){
        int n=100000;
        boolean arr[]=new boolean[n];
        for (int i=2;i<n;i++){
            arr[i]=true;
        }
        for (int i=2;i*i<n;i++){
            if(arr[i]){
                for (int j=i*i;j<n;j+=i){
                    arr[j]=false;
                }
            }
        }
        return arr;
    }
}
