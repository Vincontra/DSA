import java.util.*;
public class HouseRobber {
    public static void main(String[] args) {
        int nums[]={200,3,140,20};
        int gums[]={3,140,20,10};
        int t[]=new int[nums.length+1];
        for(int i=0;i<t.length;i++){
            t[i]=-1;
        }
        System.out.println(func(t,gums,nums.length));
    }
    public static int func(int t[],int nums[],int n){
        if(n<=0){
            return 0;
        }
        if(t[n]!=-1){
            return t[n];
        }
        return t[n]=Math.max((nums[n-1]+func(t,nums,n-2)),(func(t,nums,n-1)));
    }
}






