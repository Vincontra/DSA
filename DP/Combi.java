import java.util.*;

class Combi{

    public static int countUniqueCombinations(int[] arr, int k) {

        int n = arr.length;
        if (k > n) return 0;

        HashSet<String> unique = new HashSet<>();
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Initialize remaining for first window
        for (int i = k; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        for (int start = 0; start <= n - k; start++) {

            // Convert freq map to canonical string
            unique.add(buildKey(freq));

            // Slide window
            if (start + k < n) {

                // element leaving window → add to remaining
                int add = arr[start];
                freq.put(add, freq.getOrDefault(add, 0) + 1);

                // element entering window → remove from remaining
                int remove = arr[start + k];
                freq.put(remove, freq.get(remove) - 1);

                if (freq.get(remove) == 0) {
                    freq.remove(remove);
                }
            }
        }

        return unique.size();
    }

    // Build a sorted key from frequency map
    private static String buildKey(HashMap<Integer, Integer> freq) {

        List<Integer> keys = new ArrayList<>(freq.keySet());
        Collections.sort(keys);

        StringBuilder sb = new StringBuilder();
        for (int key : keys) {
            sb.append(key).append(":").append(freq.get(key)).append(",");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,1,1};
        int k = 2;

        System.out.println(countUniqueCombinations(arr, k));
    }
}