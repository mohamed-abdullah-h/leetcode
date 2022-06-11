class Solution {
    public void swap(int [] nums,int index){
        for (int i = index+1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
    }
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i< k;i++){
            if (nums[i]==val){
                k--;
                swap(nums,i);
                --i;
            }
        }
        return k;
    }
}