class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            // Split the sentence by spaces and count the words
            int wordCount = sentences[i].split(" ").length;
            if (wordCount > max) {
                max = wordCount;
            }
        }
        return max;
    }
}
