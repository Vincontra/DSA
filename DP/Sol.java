import java.util.*;
class Sol {

    public long countSequences(int[] nums, long k) {
        HashMap<String,Long> hm = new HashMap<>();
        return (int)t(0,1L,1L, nums.length, k,nums,hm );
    }

    public long t(int i, long num, long den,int n,long k,int nums[],HashMap<String,Long>hm){
        if (i==n) {
            if(num==k*den){
                return 1;
            }
            return 0;
        }
        String K = i + "," + num + "," + den;
        if (hm.containsKey(K)){
            return hm.get(K);
        }
        long result=0;
        long x=nums[i];
        result+=t(i+1,num,den,n,k,nums,hm);  // kuch nhi kara leave wala choice

        // ek aur chiz isme aisa hai ki we need to rational form right
        // then to do that
        // manlo 12/18 hai abhi iska lowest form kya hoga jo rational bhi ho
        // 2/3 abhi one more eg is 4/6 iska bhi same hoga
        // to 12/18 and 4/6 are both equal to 2/3

        // q me kya bola hai the want unqiue choices
        // to manlo that may be still possible ki index same ho and aise kuch forms ho
        // but they are same to waha se ans ayega jo ki cnt faltu me increase krega

        // unko eliminate krne ka ek hi tarika reduce them to lowest form

        // uske ke liye gcd
         // manlo 12/18 so gcd=6 num/gcd and deno/gcd that is 2/3
        //khatam

        //nums[i]:(num/den)*x=(num*x)/den
        long mulNum=num*x;
        long mulDen=den;
        long g1=gcd(mulNum, mulDen);
        result+=t(i+1, mulNum/g1, mulDen/g1,n,k,nums,hm);

        //nums[i]:(num/den)/x=num/(den*x)
        long divNum=num;
        long divDen=den*x;
        long g2=gcd(divNum,divDen);
        result+=t(i+1, divNum/g2, divDen/g2,n,k,nums,hm);
        hm.put(K,result);
        return result;
    }

    public long gcd(long a, long b) {
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Sol sol = new Sol();
        int nums[]={5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        long k=30517578125L;
        System.out.println(sol.countSequences(nums,k));
    }
}