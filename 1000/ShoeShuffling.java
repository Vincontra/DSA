//import java.util.Scanner;
//public class ShoeShuffling {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        int t=v.nextInt();
//        while (t-->0){
//            int n=v.nextInt();
//            int arr[]=new int[n];
//            for (int i=0;i<n;i++){
//                arr[i]=v.nextInt();
//            }
//            boolean check=false;
//            int cnt=0;
//            for (int i=n-2;i>=0;i--){
//                if (arr[i+1]>=arr[i]){
//                    cnt++;
//                }
//            }
//            if (arr[0]>=arr[n-1]){
//                cnt++;
//            }
//            if (cnt==n){
//                for (int i=2;i<=n;i++){
//                    System.out.print(i+" ");
//                }
//                System.out.println(1);
//            }else{
//                System.out.println(-1);
//            }
//        }
//
//    }
//}

import java.lang.reflect.Array;
import java.util.*;
public class ShoeShuffling {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextInt();
            }
            ArrayList<Integer>res=new ArrayList<>();
            int i=0;
            boolean ch=false;
            while (i<n){
                int j=i;
                while (j<n&&arr[j]==arr[i]){
                    j++;
                }
                int len=j-i;
                if (len==1){
//                    System.out.println(-1);
                    ch=true;
                    break;
                }
                else{
                    rotateArray(res,i,j);
                }
                i=j;
            }
            if (ch){
                System.out.print(-1);
            }
            else{
                for (int a:res){
                    System.out.print(a+" ");
                }
            }
            System.out.println();

        }
    }

    public static void rotateArray(ArrayList<Integer>res,int sp,int ep){
        int first=sp+1;
       for (int i=sp+1;i<ep;i++){
           res.add(i+1);
       }
       res.add(first);
    }

}

