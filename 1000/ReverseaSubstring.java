//import java.util.Scanner;
//public class ReverseaSubstring {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        int n=v.nextInt();
//        String curr=v.next();
//        boolean check=false;
//        int idx1=0;
//        int idx2=0;
//        boolean vis[]=new boolean[26];
//        for (int i=0;i<n-1;i++){
//            char c=curr.charAt(i);
//            if (!vis[c-'a']){
//                for (int j=i+1;j<n;j++){
//                    if (c-curr.charAt(j)>0){
//                        check=true;
//                        idx1=i;
//                        idx2=j;
//                        break;
//                    }
//                }
//                vis[c-'a']=true;
//            }
//            if (check){
//                break;
//            }
//        }
//        if (check){
//            System.out.println("YES");
//            System.out.println((idx1+1)+" "+(idx2+1));
//        }
//        else{
//            System.out.println("NO");
//        }
//
//
//    }
//}

//
//If the answer is "YES" then we always can reverse a substring of length 2
//        . So we need to check only pairs of adjacent characters in s
//        . If there is no such pair of characters si>si+1
//        for all i
//        from 1
//        to n−1
//        then the answer is "NO".
//
//        Why is it so? Consider the substring s[l;r]=slsl+1…sr
//        we have to reverse. It is obvious that sl>sr
//        , otherwise it is pointless to reverse this substring. Then consider two cases: sl≤sl+1
//        then sl+1>sr
//        (by transitivity) and then we can go to a smaller substring (s[l+1;r]
//        ); otherwise sl>sl+1
//        and it means that we can take the substring s[l;l+1]
//        .

import java.util.Scanner;
public class ReverseaSubstring {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        String curr=v.next();
        boolean check=false;
        int idx=0;
        for (int i=0;i<n-1;i++){
            if (curr.charAt(i)>curr.charAt(i+1)){
                check=true;
                idx=i;
                break;
            }
        }
        if (check){
            System.out.println("YES");
            System.out.println((idx+1)+" "+(idx+2));
        }else{
            System.out.println("NO");
        }

    }
}