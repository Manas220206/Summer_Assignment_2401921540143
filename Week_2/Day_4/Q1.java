class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }
}