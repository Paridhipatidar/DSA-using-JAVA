class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Use HashSet arrays to track digits seen in rows, columns, and boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse each cell
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                
                // Skip empty cells
                if (c == '.') continue;

                // Check row
                if (rows[i].contains(c)) return false;
                rows[i].add(c);
                
                // Check column
                if (cols[j].contains(c)) return false;
                cols[j].add(c);

                // Check box
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex].contains(c)) return false;
                boxes[boxIndex].add(c);
            }
        }

        return true;
    }
}
