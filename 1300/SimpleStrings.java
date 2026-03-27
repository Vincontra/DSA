import java.util.*;

public class SimpleStrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;

        for (int i = 1; i < n; i++) {
            if (s[i] == s[i - 1]) {
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c != s[i - 1] && (i + 1 == n || c != s[i + 1])) {
                        s[i] = c;
                        break;
                    }
                }
            }
        }
        System.out.println(new String(s));
    }
}
