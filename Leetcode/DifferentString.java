import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class DifferentString {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            String s = v.next();
            // if it is pal then no otherwise always yes---> this is wrong as aba then we can have aab
            // only not possible when all are eq
//            int l=0;
//            int r=s.length()-1;
//            boolean check=false;
//            while (l<r){
//                if (s.charAt(l)!=s.charAt(r)){
//                    check=true;
//                    break;
//                }
//                l++;
//                r--;
//            }
//            if (check){
//                System.out.println("Yes");
//                StringBuilder stringBuilder = new StringBuilder(s);
//                System.out.println(stringBuilder.reverse().toString());
//            }else{
//                System.out.println("No");
//            }
            HashSet<Character>hashSet=new HashSet<>();
            for (int i=0;i<s.length();i++)hashSet.add(s.charAt(i));
            if (hashSet.size()==1){
                System.out.println("No");
            }else{
                System.out.println("Yes");
                ArrayList<Character>l1=new ArrayList<>();
                for (int i=0;i<s.length();i++){
                    l1.add(s.charAt(i));
                }
                Collections.sort(l1);
                StringBuilder stringBuilder = new StringBuilder();
                for (int i=0;i<s.length();i++){
                    stringBuilder.append(l1.get(i));
                }
                if (s.equals(stringBuilder.toString())){
                    System.out.println(stringBuilder.reverse());
                }else{
                    System.out.println(stringBuilder.toString());
                }

            }
        }
    }
}
