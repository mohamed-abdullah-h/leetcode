class Solution {
    public int maxSubArray(int[] nums) {
       return max_subArray(nums,0,nums.length-1);
    }
    public int max_subArray(int [] nums,int l,int h){
        if (l==h)return nums[l];
        int mid = (l+h)/2;
        return Math.max(Math.max(max_subArray(nums,l,mid),max_subArray(nums,mid+1,h)),
                       cross_max(nums,l,mid,h));
    }

    public int cross_max(int [] nums,int l,int mid,int h){
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        for (int i =mid ; i>=l; i--){
            sum = sum+nums[i];
            if (sum > leftSum){
                leftSum = sum;
            }
        }
        sum = 0;
        for (int i =mid+1 ; i<=h; i++){
            sum = sum+nums[i];
            if (sum > rightSum){
                rightSum = sum;
            }
        }
        sum = leftSum+rightSum;
        return Math.max(Math.max(leftSum,rightSum),sum);
    }
}