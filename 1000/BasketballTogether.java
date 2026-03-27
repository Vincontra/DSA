//import java.util.*;
//public class BasketballTogether {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        long n=v.nextLong();
//        long d=v.nextLong();
//        long arr[]=new long[(int)n];
//        for (int i=0;i<n;i++){
//            arr[i]=v.nextLong();
//        }
//        Arrays.sort(arr);
//        int cnt=0;
//        long i=n-1;
//        long j=0;
//        while (j<=i){
//            //long req=((d+arr[(int)i]-1)/arr[(int)i]);  // we are taking ceil here:
//            long req=((d+1)+arr[(int)i]-1)/arr[(int)i];
//            req-=1;// as the biggest one is alredy cnted we need the smaller ones so -1
//            boolean check=false;
//            long cursum=arr[(int)i];
//            while (req-->0){
//                if (j>i||j==i){
//                    check=true;
//                    break;
//                }
//                cursum+=cursum;
//                j++;
//            }
//            if (!check&&cursum>d){
//                cnt++;
//            }
//            i--;
//        }
//        System.out.println(cnt);
//    }
//}

import java.util.*;
public class BasketballTogether {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        long n=v.nextLong();
        long d=v.nextLong();
        long arr[]=new long[(int)n];
        for (int i=0;i<n;i++){
            arr[i]=v.nextLong();
        }
        Arrays.sort(arr);
        int cnt=0;
        long i=n-1;
        long j=0;
        while (j<=i){
            long req=((d+1)+arr[(int)i]-1)/arr[(int)i]; // ceil((d+1)/arr[i])
            boolean check=false;
            if (i-j+1<req){  // enough hai ki nhi that's what we are checking
                break;
            }
            j+=(req-1);
            cnt++;
            i--;
        }
        System.out.println(cnt);
    }
}

