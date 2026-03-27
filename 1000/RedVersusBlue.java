//import java.util.Scanner;
//public class RedVersusBlue {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        int t=v.nextInt();
//        while (t-->0){
//            int n=v.nextInt();
//            int r=v.nextInt();
//            int b=v.nextInt();
//            int KitneRhoneChahiye = (int) Math.ceil(r * 1.0 / (b + 1));
//            StringBuilder sb=new StringBuilder();
//            while(r>0){
//                int add=Math.min(r,KitneRhoneChahiye);
//                for (int j=0;j<add;j++){
//                    sb.append('R');
//                }
//                r-=add;
//                if (b>0){
//                    sb.append('B');
//                    b-=1;
//                }
//                if (r-b==1){
//                    while (r>0){
//                        sb.append('R');
//                        if (b>0){
//                            sb.append('B');
//                            b--;
//                        }
//                        r--;
//                    }
//                }
//            }
//            System.out.println(sb.toString());
//        }
//    }
//}
import java.util.*;
public class RedVersusBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            int p = r / (b + 1);
            int q = r % (b + 1);
            StringBuilder sb = new StringBuilder(n);
            for (int i = 0; i <= b; i++) {
                for (int j = 0; j < p; j++) sb.append('R');
                if (i < q) sb.append('R');
                if (i < b) sb.append('B');
            }
            System.out.println(sb);
        }
    }
}

