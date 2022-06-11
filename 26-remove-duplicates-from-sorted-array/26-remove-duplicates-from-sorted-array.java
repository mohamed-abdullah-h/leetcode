class Solution {
    public int removeDuplicates(int[] nums) {
      int r_count=0;
        int x = 0;
        for (int i = 1;i<nums.length;i++){
            if (nums[i] >= nums[nums.length-1])break;
            if (nums[i-1] == nums[i]){
                r_count++;
                for (int j=i+1;j<nums.length;j++){
                    if (nums[j-1] == nums[j]){
                        r_count++;
                    }
                    else {
                        break;
                    }
                }
            }
            x=i;
            while (r_count>0){
                nums[x] = nums[x+r_count];
                x++;
                r_count--;
            }
        }
        int k = nums.length;
        for (int i=nums.length-1;i>0; i--){
            if (nums[i] == nums[i-1]){
                k--;
            }
            else break;
        }
        return k;
    }
}