public class Countofsubsetwithgivendifference {
    public static void main(String[] args) {
        // s1-s2=diff;
        // s1+s2=total
        // 2*s1=total+diff;
        // s1=(total+diff)/2;
        // same q as cnt of subset having sum=s1;

        int arr[]={5,2,6,4};
        int diff=3;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        sum+=diff;
        if(sum%2==1){
            System.out.println(0);// no valid subsetes exist
        }
        else{
            sum/=2;
            int t[][]=new int[arr.length+1][sum+1];
            for (int i=0;i<=arr.length;i++){
                t[i][0]=1;
            }
            for (int i=1;i<=arr.length;i++){
                for (int j=0;j<=sum;j++){
                    if (j-arr[i-1]>=0){
                        t[i][j]=t[i-1][j-arr[i-1]]+t[i-1][j];
                    }else{
                        t[i][j]=t[i-1][j];
                    }
                }
            }
            System.out.println(t[arr.length][sum]);
        }
    }
}
