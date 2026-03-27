//import java.util.*;
//
//public class DeletiveEditing {
//    public static void main(String[] args) {
//        Scanner v = new Scanner(System.in);
//        int tc = v.nextInt();
//        while (tc-- > 0) {
//            String s = v.next();
//            String T = v.next();
//
//            HashMap<Character, Integer> hm = new HashMap<>();
//            HashMap<Character, Integer> hm1 = new HashMap<>();
//
//            // Count frequency in s
//            for (int i = 0; i < s.length(); i++) {
//                hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
//            }
//
//            // Count frequency in T
//            for (int i = 0; i < T.length(); i++) {
//                hm1.put(T.charAt(i), hm1.getOrDefault(T.charAt(i), 0) + 1);
//            }
//
//            boolean check = false;
//            // If T requires more of any char than S has → impossible
//            for (int i = 0; i < T.length(); i++) {
//                char c = T.charAt(i);
//                if (hm.getOrDefault(c, 0) < hm1.get(c)) {
//                    check = true;
//                    break;
//                }
//            }
//
//            if (check) {
//                System.out.println("NO");
//                continue;   // ⬅️ skip deletion logic
//            }
//
//            // Otherwise, do deletion simulation
//            boolean[] visited = new boolean[26];
//            StringBuilder sb = new StringBuilder(s);
//
//            for (int i = 0; i < sb.length(); i++) {
//                char c = sb.charAt(i);
//                if (!visited[c - 'A']) {
//                    int s1 = hm.get(c);
//                    int t1 = hm1.getOrDefault(c, 0);
//                    int diff = s1 - t1; // delete this many
//                    int cnt = 0;
//
//                    // remove diff occurrences from left to right
//                    for (int j = 0; j < sb.length() && cnt < diff; j++) {
//                        if (sb.charAt(j) == c) {
//                            sb.deleteCharAt(j);
//                            j--; // adjust index after deletion
//                            cnt++;
//                        }
//                    }
//                    visited[c - 'A'] = true;
//                }
//            }
//
//            if (sb.toString().equals(T)) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
//}


import java.util.*;
public class DeletiveEditing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            String t = sc.next();
            int n1 = s.length();
            int n2 = t.length();
            int[] arr = new int[n2];
            boolean possible = true;
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < n2; i++) {
                char target = t.charAt(n2 - i - 1);
                int max = sb.lastIndexOf(String.valueOf(target));
                if (max == -1) {
                    possible = false;
                    break;
                }
                arr[n2 - 1 - i] = max;
                sb.setCharAt(max, '1');
            }
            for (int i = 1; i < n2; i++) {
                if (!(arr[i] > arr[i - 1])) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
