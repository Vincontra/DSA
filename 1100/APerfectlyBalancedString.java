import java.util.HashSet;
import java.util.Scanner;

public class APerfectlyBalancedString {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            String s=v.next();
            HashSet<Character>hashSet=new HashSet<>();
            for (int i=0;i<s.length();i++){
                hashSet.add(s.charAt(i));
            }
            int len=hashSet.size();
            // iss length me har unique char ka hona imp hai nhi to diff>1 and hence not a bal string
            // abhi ppattern konsa hoga jo pehle isme len size ka milega wahi pateern repeat hona chhaie
            // othwerwise ans is NO
            StringBuilder pa=new StringBuilder();
            HashSet<Character>hs2=new HashSet<>();
            for (int i=0;i<len;i++){
                pa.append(s.charAt(i));
                hs2.add(s.charAt(i));
            }
            String pat=pa.toString();
            if (hs2.size()!=len){
                System.out.println("No");
            }
            else{
                // now each continuius substring of length len must match with pat till end
                // if few char are less in last segment then still char should match
                 // eg: abc is pat and last me e we have ab then it is matching
                // if it is like ba or ca then again NO
                int i=len;
                boolean check=false;
                while (i<s.length()){
                    int idx=0;
                    for (int j=i;j<s.length()&&idx<len;j++){
                        if (s.charAt(j)!=pat.charAt(idx)){
                            check=true;
                            break;
                        }
                        idx++;
                    }
                    if (check){
                        break;
                    }else{
                        i+=len;
                    }
                }
                if (!check){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}