class Solution {
    
    public boolean isValidChar(char c){

        return ((c >= 'A' && c <= 'Z') ||
               (c >= 'a' && c <= 'z') ||
               (c >= '0' && c <= '9'));
    }

    public boolean isPalindrome(String s) {

        
        if(s.isEmpty()) return false;

        int beg = 0, end = s.length() -1;

        while(beg < end){
            
            if(!isValidChar(s.charAt(beg))) {beg++;continue;};
            if(!isValidChar(s.charAt(end))) {end--;continue;};
            
            if(Character.toLowerCase(s.charAt(beg)) != Character.toLowerCase(s.charAt(end))){
                     return false;
            }
           beg++;
           end--;
        }

        return true;
    }

}
