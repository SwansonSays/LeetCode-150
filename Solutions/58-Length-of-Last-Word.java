/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
 */
class Solution58 {
    public static int lengthOfLastWord(String s) {
        int length = s.length();
        int count = 0;
        for(int i = length - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                count++;
            } else if(count > 0){
                return count;
            }
        }
        return count;
    }
}
