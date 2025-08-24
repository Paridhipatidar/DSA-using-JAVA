class FindPeakElement2 {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int left = 0, right = n - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            // Find row with max element in this column
            int maxRow = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }
            
            boolean leftIsGreater = mid - 1 >= 0 && mat[maxRow][mid - 1] > mat[maxRow][mid];
            boolean rightIsGreater = mid + 1 < n && mat[maxRow][mid + 1] > mat[maxRow][mid];
            
            if (!leftIsGreater && !rightIsGreater) {
                // Peak found
                return new int[]{maxRow, mid};
            } else if (leftIsGreater) {
                right = mid - 1; // move left
            } else {
                left = mid + 1; // move right
            }
        }
        
        return new int[]{-1, -1}; // should never reach here
    }
}
