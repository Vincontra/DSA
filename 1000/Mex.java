import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner v = new Scanner(System.in);
        int t = v.nextInt();
        while (t-- > 0) {
            int n = v.nextInt();
            String curr = v.next();
            int j = 0;
            for (int i = 1; i < curr.length(); i++) {
                if (curr.charAt(i)=='1'){
                    System.out.print(j+" ");
                    j=i;
                }
                else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
