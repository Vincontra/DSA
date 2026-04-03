class Solution {
    static long mod=(int)1e9+7;
    static long fact[];
    public int countVisiblePeople(int n, int pos, int k) {
        fact=new long[n+1];
        fact[0]=1;
        for (int i=1;i<=n;i++){
            fact[i]=(fact[i-1])*i%mod;
        }
        int left=pos;
        int right=n-pos-1;
        long ans=0;
        for (int i=Math.max(0,k-right);i<=Math.min(left,k);i++){
            ans=(ans+NCR(left,i)*NCR(right,k-i))%mod;
        }
        return (int)((ans*2)%mod);
    }
    static long NCR(int n,int r){
        if (r<0||r>n){
            return 0;
        }
        long a=fact[n];
        long b=fact[n-r]%mod*fact[r]%mod;
        return (a*(modPow(b,mod-2,mod))%mod)%mod;
    }
    static long modPow(long a, long b, long mod) {
        long res = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}
