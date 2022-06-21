class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
    Arrays.sort(nums);
    int temp = nums[0];
    int rept = (nums.length/2);
    for (int i = 1; i < nums.length;i++){
        if (nums[i] == temp){
            ++count;
        }
        else {
            temp = nums[i];
            count=1;
        }
        if (count > rept) return nums[i];
    }
    return nums[0];
    }
}