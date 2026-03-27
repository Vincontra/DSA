import java.util.Scanner;
public class NumbersBox {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int t = v.nextInt();
        while (t-- > 0) {
            int n = v.nextInt();
            int m = v.nextInt();
            int cntneg = 0;
            int cntz = 0;
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int val = v.nextInt();
                    sum += Math.abs(val);
                    min = Math.min(min, Math.abs(val));
                    if (val < 0) cntneg++;
                    if (val == 0) cntz++;
                }
            }
            if (cntneg % 2 == 0||cntz > 0) {
                System.out.println(sum);
            }else {
                System.out.println(sum - 2 * min);
            }
        }
    }
}
