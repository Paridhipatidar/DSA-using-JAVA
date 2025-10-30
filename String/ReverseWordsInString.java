class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String reversed="";
        for(int i=words.length-1;i>=0;i--){
           reversed=reversed+words[i];
           if(i>0) 
           reversed=reversed+" ";
        }
        return reversed;
    }
}
