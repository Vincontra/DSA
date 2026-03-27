import java.util.*;

class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int[] freq = new int[26];  
        Map<String, Integer> seen = new HashMap<>();

        // Base state: all zeros seen at index -1
        String zeroKey = Arrays.toString(new int[26]);
        seen.put(zeroKey, -1);

        int ans = 0;

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;

            // Find minimum non-zero frequency
            int min = Integer.MAX_VALUE;
            for (int f : freq) {
                if (f > 0) min = Math.min(min, f);
            }

            // Normalize the pattern relative to min frequency
            int[] norm = new int[26];
            for (int j = 0; j < 26; j++) {
                norm[j] = (freq[j] == 0) ? 0 : freq[j] - min;
            }

            // Convert to key
            String key = Arrays.toString(norm);

            // If pattern was seen before → balanced substring found
            if (seen.containsKey(key)) {
                ans = Math.max(ans, i - seen.get(key));
            } else {
                seen.put(key, i);
            }
        }

        return ans;
    }
}
