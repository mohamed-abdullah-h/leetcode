class Solution {
    
    public int search(int[] nums, int target,int first,int last){

        int mid = first+(last-first)/2;
        if (last <= first) return mid;
        int mid_num = nums[mid];
        if (target == mid_num) return mid;
        if (target < mid_num){
            return search(nums,target,first,mid);
        }
        else if (target > mid_num){
            return search(nums,target,mid+1,last);
        }
    else return mid;

    }
    public int searchInsert(int[] nums, int target) {
        return search(nums,target,0,nums.length);
    }
}