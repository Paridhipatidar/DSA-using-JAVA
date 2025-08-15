class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int r = 0;        // start at first row
        int c = cols - 1; // start at last column
        
        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] > target) {
                c--; // move left
            } else {
                r++; // move down
            }
        }
        return false;
    }
}
