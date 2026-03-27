public class MinimumNo_InsertionPalindrome {
    public int minInsertions(String s) {
        String x = s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        String y = sb.reverse().toString();
        int t[][] = new int[x.length() + 1][y.length() + 1];
        for (int i = 1; i <= x.length(); i++) {
            for (int j = 1; j <= y.length(); j++) {
                if (x.charAt((i - 1)) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }
            }
        }
        int len = t[x.length()][y.length()];
        return x.length() - len;
    }
    public static void main(String[] args) {

    }

}
