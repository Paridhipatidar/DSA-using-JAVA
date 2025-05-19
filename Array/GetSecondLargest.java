class GetSecondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
        if (arr.length < 2) {
            return -1;
        }
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            }
            else if (num < first && num > second) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
