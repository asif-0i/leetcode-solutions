 class Solution {  
    public void rotate(int[] nums, int k) {
        if (k == 0 || k == nums.length || nums.length == 1) return;
        int n = nums.length;
        int t = k%n; // if number of rotations is bigger than array size
        swap(nums, 0, n-1); // reverse the whole array
        swap(nums, 0, t-1); // reverse the first k elements
        swap(nums, t, n-1); // reverse the k+1 to T elements
    }

    private static void swap(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;

            l++;
            r--;
        }
    }
	
	/* time limit exceeds.
	public function rotate(int[] arr, int k) 
	{
		if (k == 0 || k == arr.length) return;
        int i = arr.length - 1;
        while (k != 0) {
            while (i >= 1) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;

                i -= 1;
            }
            i = arr.length - 1;
            k--;
        }
	} */
}    