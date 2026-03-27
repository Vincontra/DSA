//import java.util.ArrayList;
//import java.util.Scanner;
//public class TheSecretNumber {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        int t=v.nextInt();
//        while (t-->0){
//            long n=v.nextLong();
//            ArrayList<Long>l1=new ArrayList<>();
//            int i=1;
//            while(true){
//                if (n>=1+(int)Math.pow(10,i)&&n%(1+(int)Math.pow(10,i))==0){
//                    l1.add(n/(1+(int)Math.pow(10,i)));
//                }
//                else{
//                    break;
//                }
//                i++;
//            }
//            System.out.println(l1.size());
//            for (int j=0;j<l1.size();j++){
//                System.out.print(l1.get(j)+" ");
//            }
//            System.out.println();
//
//        }
//    }
//}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class TheSecretNumber {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int t = v.nextInt();
        while (t-- > 0) {
            long n = v.nextLong();
            ArrayList<Long> l1 = new ArrayList<>();
            int i = 1;
            while (true) {
                long divisor = 1 + (long) Math.pow(10, i);
                if (divisor >n) {
                    break;
                }
                if (n % divisor == 0) {
                    l1.add(n / divisor);
                }
                i++;
            }
            Collections.sort(l1);
            System.out.println(l1.size());
            for (int j=0;j<l1.size();j++){
                if (j==l1.size()-1){
                    System.out.println(l1.get(j));
                }else{
                    System.out.print(l1.get(j)+" ");
                }
            }
        }
    }
}
