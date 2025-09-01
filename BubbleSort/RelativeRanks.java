class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        // Pair each score with its original index
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i]; // score
            arr[i][1] = i;        // original index
        }
        // Bubble Sort (descending by score)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j][0] < arr[j + 1][0]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Assign ranks
        for (int i = 0; i < n; i++) {
            int index = arr[i][1]; // original index
            if (i == 0) result[index] = "Gold Medal";
            else if (i == 1) result[index] = "Silver Medal";
            else if (i == 2) result[index] = "Bronze Medal";
            else result[index] = String.valueOf(i + 1);
        }
        return result;
    }
}
