import java.util.*;
public class ArrayMerging {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int t = v.nextInt();
        while (t-- > 0) {
            int n = v.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) a[i] = v.nextInt();
            for (int i = 0; i < n; i++) b[i] = v.nextInt();
            HashMap<Integer, Integer> streakA = GetAns(a);
            HashMap<Integer, Integer> streakB = GetAns(b);
            int ans = 0;
            HashSet<Integer> allkeys = new HashSet<>();
            allkeys.addAll(streakA.keySet());
            allkeys.addAll(streakB.keySet());
            for (int key : allkeys) {
                int total = streakA.getOrDefault(key, 0) + streakB.getOrDefault(key, 0);
                ans = Math.max(ans, total);
            }
            System.out.println(ans);
        }
    }
public static HashMap<Integer, Integer> GetAns(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                cnt++;
            }
            else{
                hm.put(arr[i - 1], Math.max(hm.getOrDefault(arr[i - 1], 0), cnt));
                cnt = 1;
            }
        }
        hm.put(arr[arr.length - 1], Math.max(hm.getOrDefault(arr[arr.length - 1], 0), cnt));
        return hm;
    }
}
//we have to find the contigues freq of each element in both arrays and max sum of them will be ans
//Because while merging, we can place the two streaks next to each other.