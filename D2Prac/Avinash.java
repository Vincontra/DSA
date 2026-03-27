//import java.util.Scanner;
//public class Avinash {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        int arr[]={3,3,5,2,1,1};
//        // 1 should be the ans----->>>    0001
//        // 0001
//        // 0011
//        // 0011
//        // 0011
//        // 0010
//        // 0010
//
//        // 0011
//        // 0011
//        // 0101
//        // 0010
//        // 0001
//        // 0001
//
//
//        int a=0;
//        int b=0;
//        for (int i=0;i<=31;i++){
//            int xor=0;
//            for (int j=0;j<arr.length;j++){
//                int curr=arr[j];
//                int currNum=1<<i;
//                xor^=(currNum&curr);
//                if((currNum&curr)==0){
//                    a^=curr;
//                }else{
//                    b^=curr;
//                }
//            }
//            if(xor==1){
//                break;
//            }
//            else{
//                a=0;
//                b=0;
//            }
//        }
//        System.out.println(a+" "+b);
//
//    }
//}


