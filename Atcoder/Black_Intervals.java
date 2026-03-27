import java.util.Scanner;
public class Black_Intervals {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        int q = v.nextInt();
        int arr[] = new int[q];
        for (int i = 0; i < q; i++) {
            arr[i] = v.nextInt();
        }
        // 0 means white
        // 1 means black
        int a[] = new int[n + 2];
        int ans = 0;

        for (int i = 0; i < q; i++) {
            int idx = arr[i];
            if (idx == 1) {
                if (a[idx] == 0) {
                    if (a[idx + 1] == 0) {
                        ans++;
                    } else if (a[idx + 1] == 1) {
                        // no change to ans
                    }
                    a[idx] = 1;
                    System.out.println(ans);
                } else {
                    if (a[idx + 1] == 0) {
                        ans--;
                    }
                    a[idx] = 0;
                    System.out.println(ans);
                }

            } else if (idx == n) {
                if (a[idx] == 0) {
                    if (a[idx - 1] == 0) {
                        ans++;
                    }
                    a[idx] = 1;
                    System.out.println(ans);
                } else {
                    if (a[idx - 1] == 0) {
                        ans--;
                    }
                    a[idx] = 0;
                    System.out.println(ans);
                }

            } else {
                if (a[idx] == 0) {
                    if (a[idx - 1] == 0 && a[idx + 1] == 0) {
                        ans++;
                    } else if (a[idx - 1] == 1 && a[idx + 1] == 1) {
                        ans--;
                    }

                    a[idx] = 1;
                    System.out.println(ans);
                } else {
                    if (a[idx - 1] == 1 && a[idx + 1] == 1) {
                        ans++;
                    } else if (a[idx - 1] == 0 && a[idx + 1] == 0) {
                        ans--;
                    }

                    a[idx] = 0;
                    System.out.println(ans);
                }
            }
        }
    }
}
