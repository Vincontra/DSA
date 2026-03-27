
import java.util.*;
class MinimizeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }
            // Count wrap points
            int[] wrapCount = new int[M];
            for (int x : A) {
                int k = (M - x) % M;  // shift where this element wraps
                wrapCount[k]++;
            }

            long curr = sum;
            long minSum = curr;

            // Sweep through k=1..M-1
            for (int k = 1; k < M; k++) {
                // If we shift by 1 more:
                // All elements +1 → sum += N
                curr += N;

                // Wrapping elements subtract M each
                curr -= (long) wrapCount[k] * M;

                minSum = Math.min(minSum, curr);
            }

            sb.append(minSum).append("\n");
        }
        System.out.print(sb.toString());
    }
}
