import java.util.*;
public class TrafficLight {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int t = v.nextInt();
        while (t-- > 0) {
            int n = v.nextInt();
            char curr = v.next().charAt(0);
            String trav = v.next();
            if (curr == 'g') {
                System.out.println(0);
                continue;
            }
            trav += trav;
            int i = 0;
            int max = 0;
            while (i < trav.length()) {
                while (i < trav.length() && trav.charAt(i) != curr) {
                    i++;
                }
                int j = i + 1;
                if(j<trav.length()){
                    while (j < trav.length() && trav.charAt(j) != 'g') {
                        j++;
                    }
                }
                else{
                    break;
                }
                if (j < trav.length()) {
                    max = Math.max(max, j - i);
                }
                i = j + 1;
            }
            System.out.println(max);
        }
    }
}
