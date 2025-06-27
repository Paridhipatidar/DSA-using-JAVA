class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;        // rows
        int m = matrix[0].length;     // columns

        int[][] transpose = new int[m][n]; // Transposed matrix has dimensions m x n

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j]; // Swap row with column
            }
        }

        return transpose;
    }
}
