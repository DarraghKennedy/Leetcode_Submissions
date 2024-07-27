class Solution {
    public int lengthOfLastWord(String s) {
        // Split the string by spaces
        String[] array = s.trim().split(" ");
        
        // Get the last word
        String lastWord = array[array.length - 1];
        
        // Initialize count
        int count = 0;
        
        // Count the number of characters in the last word
        for (int i = 0; i < lastWord.length(); i++) {
            if (lastWord.charAt(i) != ' ') {
                count++;
            }
        }
        
        return count;
    }
}
