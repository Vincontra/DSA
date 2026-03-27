//class Solution {
// recursive
//
//    static Boolean isSubsetSum(int arr[], int sum) {
//        boolean ans[]=new boolean[1];
//        function(ans,arr,sum,arr.length);
//        return ans[0];
//    }
//
//    public static void function(boolean ans[],int arr[],int sum,int n){
//        if (sum==0){
//            ans[0]=true;
//            return;
//        }
//        if (n==0){
//            return;
//        }
//
//        if (sum-arr[n-1]>=0){
//            function(ans,arr,sum-arr[n-1],n-1);
//        }else{
//            function(ans,arr,sum,n-1);
//        }
//
//        if (!ans[0]){
//            function(ans,arr,sum,n-1);
//        }
//    }
//}


//import java.util.Scanner;
//public class SubSetSumEqaulToK {
//    // solve by me first with recursion and then with memoization now will solve with top-down
//    public static void main(String[] args) {
//        //Scanner v=new Scanner(System.in);
//        int arr[]={2,3,7,8,10};
//        int sum=50;
//        boolean ans[]=new boolean[1];
//        boolean t[][]=new boolean[arr.length+1][sum+1];
//        if(function(t,ans,arr,sum,arr.length)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
//    }
//    public static boolean function(boolean t[][],boolean ans[],int arr[],int sum,int n){
//        if (sum==0){
//            return true;
//        }
//        if (n==0){
//            return false;
//        }
//        if (sum-arr[n-1]>=0){
//            return t[n][sum]=function(t,ans,arr,sum-arr[n-1],n-1)||function(t,ans,arr,sum,n-1);
//        }
//        else{
//            return t[n][sum]=function(t,ans,arr,sum,n-1);
//        }
//    }
//}


import java.util.*;
public class SubSetSumEqaulToK {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        //top down
        int arr[]={2,3,7,8,10};
        int sum=11;
        boolean t[][]=new boolean[arr.length+1][sum+1];
        for (int i=0;i<=arr.length;i++){
            for (int j=0;j<=sum;j++){
                if (j==0){
                    t[i][j]=true;
                }
            }
        }
        for (int i=1;i<=arr.length;i++){
            for (int j=1;j<=sum;j++){
                if (j-arr[i-1]>=0){
                    t[i][j]=(t[i-1][j-arr[i-1]])||(t[i-1][j]);
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        System.out.println(t[arr.length][sum]);
    }
}

