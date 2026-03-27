import java.util.Scanner;
public class TenzingBooks {
    // this is my sol
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long x=v.nextLong();
            long a[]=new long[n];
            long b[]=new long[n];
            long c[]=new long[n];
            for (int i=0;i<n;i++){
                a[i]=v.nextLong();
            }
            for (int i=0;i<n;i++){
                b[i]=v.nextLong();
            }
            for (int i=0;i<n;i++){
                c[i]=v.nextLong();
            }

            long or=0;
            for (int i=0;i<n;i++){
                if (((or|a[i])|x)==x){
                    or|=a[i];
                }
                else{
                    break;
                }
            }
            for (int i=0;i<n;i++){
                if (((or|b[i])|x)==x){
                    or|=b[i];
                }
                else{
                    break;
                }
            }
            for (int i=0;i<n;i++){
                if (((or|c[i])|x)==x){
                    or|=c[i];
                }
                else{
                    break;
                }
            }

            if (x==or){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

//  this sol is by harsh sir
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        // Optimize input/output operations
//        Scanner scanner = new Scanner(System.in);
//
//        int t = scanner.nextInt(); // Number of test cases
//
//        while (t-- > 0) {
//            int n = scanner.nextInt(); // n: number of books in each stack
//            int x = scanner.nextInt(); // x: Tenzing's favorite number
//
//            // Precomputed OR results for each stack
//            List<Integer>[] pre = new ArrayList[3];
//            for (int i = 0; i < 3; i++) {
//                pre[i] = new ArrayList<>();
//                int s = 0; // Initialize current OR result
//                pre[i].add(s); // Start with 0 OR result
//
//                // Read each book's difficulty in the stack
//                for (int j = 0; j < n; j++) {
//                    int a = scanner.nextInt();
//
//                    // If adding this book changes the OR result, update it
//                    if ((s | a) != s) {
//                        s |= a;
//                        pre[i].add(s);
//                    }
//                }
//            }
//
//            boolean ans = false; // Flag to check if x can be achieved
//
//            // Check all combinations of OR results from the three stacks
//            for (int A : pre[0]) { // Iterate over precomputed OR results of stack 1
//                for (int B : pre[1]) { // Iterate over precomputed OR results of stack 2
//                    for (int C : pre[2]) { // Iterate over precomputed OR results of stack 3
//                        // Check if the combined OR result equals x
//                        if ((A | B | C) == x) {
//                            ans = true;
//                        }
//                    }
//                }
//            }
//
//            // Output the result for the current test case
//            System.out.println(ans ? "YES" : "NO");
//        }
//
//        // Time Complexity (TC): O(max(3*n, (31^3)))
//        // Space Complexity (SC): O(3*31)
//    }
//}