class Solution {
    public String reverseWords(String s) {
        s = s.trim();
		s = s.replaceAll(" +", " ");
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = words.length-1; i > 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        sb.append(words[0]);
        return sb.toString();
    }
}