import java.util.*;
public class MEXorMixup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int pXor = xor(a - 1);
            if (pXor == b) {
                System.out.println(a);
            }
            else if ((pXor ^ b) != a) {
                System.out.println(a + 1);
            }
            else {
                System.out.println(a + 2);
            }
        }
    }
 public static int xor(int n) {
        // XOR of [0..n]
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0; // n % 4 == 3
    }
}



