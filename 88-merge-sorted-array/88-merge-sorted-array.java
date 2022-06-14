class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int all = n+m;
        int [] arr = new int[all];
        int num1 = 0;
        int num2 = 0;
        for (int i = 0;i < all;i++){
            if (num1 < m && num2 < n && nums1[num1] <= nums2[num2]){
                arr[i] = nums1[num1++];
            }
            else if (num1 < m && num2 < n && nums1[num1] > nums2[num2]){
                arr[i] = nums2[num2++];
            }
            else if (num1 < m){
                arr[i] = nums1[num1++];
            }
            else {
                arr[i] = nums2[num2++];
            }
        }
    for (int z = 0; z < all; z++){
        nums1[z] = arr[z];
    }
    }
}