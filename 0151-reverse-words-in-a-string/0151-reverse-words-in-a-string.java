class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        int i = s.length() - 1;

        while(i >= 0) {

            //Skip spaces
            while(i >= 0 && s.charAt(i) == ' ') i--;

            if(i < 0) break;

            int end = i;

            //Move to start of the word
            while(i >= 0 && s.charAt(i) != ' ') i--;

            //add space only if not first word
            if(sb.length() > 0) sb.append(' ');

            //add word correctly
            sb.append(s.substring(i+1, end+1));

        }

        return sb.toString();
    }
}