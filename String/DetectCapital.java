class DetectCapital {
    public boolean detectCapitalUse(String word) {
      int charCount = 0;
        for(int i =0; i< word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                charCount++;
            }
        }
        if(charCount==0){
            return true;
        }
        if(charCount==word.length()){
            return true;
        }
        if(charCount ==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        else{
            return false;
        }
  
    }
}
