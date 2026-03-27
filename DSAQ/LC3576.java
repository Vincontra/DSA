class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        int cntNeg1=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1)cntNeg1++;
        }
        int cnt1=nums.length-cntNeg1;
        if(cnt1%2==1&&cntNeg1%2==1){
            System.out.println("vdkbvd");
            return false;
        }
        else if(cntNeg1%2==0&&cnt1%2==0)
        {
            // lets go with negative first
            int ans=0;
            int i=0;
            while(i<n){
                if(nums[i]==-1 &&i!=n-1){
                    int j=i+1;
                    while(j<n){
                        if(nums[j]==-1){
                            ans+=j-i;
                            i=j+1;
                            break;
                        }
                        j++;

                    }

                }else{
                    i++;
                }

            }
            if(ans<=k){
                return true;
            }

            ans=0;
            i=0;
            while(i<n){
                if(nums[i]==1 &&i!=n-1){
                    int j=i+1;
                    while(j<n){
                        if(nums[j]==1){
                            ans+=j-i;
                            i=j+1;
                            break;
                        }
                        j++;
                    }
                }else{
                    i++;
                }

            }

            if(ans<=k){
                return true;
            }

            return false;

        }
        else if(cntNeg1%2==0){
            //neg
            for(int i=0;i<=n-2;i++){
                if(nums[i]==-1){
                    nums[i]*=-1;
                    nums[i+1]*=-1;
                    k--;
                }
            }


        }
        else{
            //pos
            for(int i=0;i<=n-2;i++){
                if(nums[i]==1){
                    nums[i]*=-1;
                    nums[i+1]*=-1;
                    k--;
                }
            }
        }
        if(k>=0){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Solution o=new Solution();
        int nums[]={1,-1,1,-1,1};
        int k=3;
        System.out.println(o.canMakeEqual(nums,k));
    }
}