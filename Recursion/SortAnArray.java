import java.util.*;
public class SortAnArray {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int arr[]={1,10,11,3};
        sort(arr,0);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void sort(int arr[],int idx){
        if (idx==arr.length){
            return;
        }
        int minIdx=0;
        int Min=Integer.MAX_VALUE;
//        for (int i=idx;i<arr.length;i++){
//            if (arr[i]<min){
//                min=arr[i];
//                minIdx=i;
//            }
//        }
        int curr=min(idx,arr,minIdx,Min);
        int temp=arr[curr];
        arr[curr]=arr[idx];
        arr[idx]=temp;
        sort(arr,idx+1);
    }
    public static int min(int idx,int arr[],int minIdx,int min){
        if (idx==arr.length){
            return minIdx;
        }
        if (min>arr[idx]){
            min=arr[idx];
            minIdx=idx;
        }
        return min(idx+1,arr,minIdx,min);

    }
}
