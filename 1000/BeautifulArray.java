// logic:
// if sum is strictly less than k*b then there is no answer at all so ------> -1;
// then if sum>=k*b:
// we can have the max number which we can have in that array is nearest number to sum but in range of [k*b,k*b+(k-1)];
// whatever number closest to sum we can put
// then after puttiing it sum-thatnum and then this result/(n-1) that number we have to put at other places if and only if that much n-1 exist(check case 1 you will understand)
// if exist simply put it and print the array and if there are not enough numbers just print -1
import java.util.*;
public class BeautifulArray {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int t = v.nextInt();
        while (t-- > 0) {
            long n = v.nextLong();
            long k = v.nextLong();
            long b = v.nextLong();
            long s = v.nextLong();
            long minSum = k * b;
            long maxSum = k * b + n * (k - 1);
            // impossible
            if (s < minSum || s > maxSum) {
                System.out.println(-1);
                continue;
            }
            long[] arr = new long[(int) n];
            arr[0] = Math.min(s, k * b + (k - 1));
            long rem = s - arr[0];
            for (int i = 1; i < n && rem > 0; i++) {
                long give = Math.min(rem, k - 1);
                arr[i] = give;
                rem -= give;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

//    To start with, the sum of the numbers in the array s
//        cannot be less, than k⋅b
//        (where k
//        is the number by which we divide, and b
//        is beauty (s≥k⋅b
//        ))
//
//        It is important, that s≤k⋅b+(k−1)⋅n
//        . Let's assume that is not true. Consider the sum of divisible parts of numbers in the array: it obviously does not exceed k⋅b
//        , thus the sum of remainders is at least (k−1)⋅n+1
//        , which means, that at least one of the numbers' remainders is k
//        , which is impossible by definition of the remainder.
//
//        That way we got the criteria for the existence of the answer: k⋅b≤s≤k⋅b+(k−1)⋅n
//        .
//
//        If there does exist an answer, then we can use the following algorithm:
//
//        Assign k⋅b
//        to any of the n
//        cells of the array.
//        Iterate over all the cells (including the cell from the previous item) and add min(s−sum,k−1)
//        to the current cell, where sum
//        is the current sum of the elements.