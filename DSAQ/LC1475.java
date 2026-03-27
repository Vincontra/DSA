import java.util.*;
class LC1475 {
//    public int[] finalPrices(int[] prices) {
//        //method 1
//        int n=prices.length;
//        int next[]=new int[n];
//        Stack<Integer>st=new Stack<>();
//        for(int i = n-1; i >= 0; --i) {
//            while (!st.isEmpty() && prices[st.peek()] > prices[i]){
//                st.pop();
//            }
//            next[i] = st.isEmpty() ? -1 : st.peek();
//            st.push(i);
//        }
//        for(int i=0;i<n;i++){
//            if(next[i]!=-1){
//                prices[i]-=prices[next[i]];
//            }
//        }
//        return prices;
//
//    }

    public int[] finalPrices(int[] prices) {
        //method 2
        //https://codeforces.com/blog/entry/143633
        int n=prices.length;
        int next[]=new int[n];
        for(int i=n-1;i>=0;--i){
            next[i]=i+1;
            while(next[i]!=n&&prices[i]<prices[next[i]]){
                next[i]=next[next[i]];
            }
        }
        for(int i=0;i<n;i++){
            if(next[i]!=n){
                prices[i]-=prices[next[i]];
            }
        }
        return prices;

    }
    public static void main(String[] args) {
        

    }
    }