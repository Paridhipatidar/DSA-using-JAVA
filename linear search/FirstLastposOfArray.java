class FirstLastposOfArray {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;

        if (nums.length == 0) {
            return arr;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] != target) {
                left++;
                continue;
            }

            if (nums[right] != target) {
                right--;
                continue;
            }

            // both left and right are pointing to target
            arr[0] = left;
            arr[1] = right;
            return arr;
        }

        return arr;
    }
}
