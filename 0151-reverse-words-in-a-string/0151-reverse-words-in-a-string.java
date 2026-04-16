class Solution {
    public String reverseWords(String s) {
        // "  hello  world  "
        //  l              r
        int left = 0;
        int right = s.length() - 1;

        while(left < s.length() && s.charAt(left) == ' ') left++;
        // "  hello  world  "
        //    l            r

        while(right >= 0 && s.charAt(right) == ' ') right--; 
        // "  hello  world  "
        //    l          r

        StringBuilder sb = new StringBuilder();
        while(left <= right) {
            if(s.charAt(left) != ' ') sb.append(s.charAt(left));
            else if(s.charAt(left - 1) != ' ') sb.append(s.charAt(left));

            left++;
            
        }
        // sb=hello world

        int i = 0;
        int j = sb.length() - 1;

        while(i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }
        // sb=dlrow olleh
        //    s
        //    e

        int st = 0;
        int end = 0;

        while(st < sb.length()) {
            while(end < sb.length() && sb.charAt(end) != ' ') end++;
                // sb=dlrow olleh
                //    s
                //         e

            // Reverse between s and (e-1)
            i = st;
            j = end - 1;
            while(i < j) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);

                i++;
                j--;
            }
            // sb=world olleh
            //      i
            //      j

            st = end + 1;
            end = end + 1;
            // sb=dlrow olleh
            //          s
            //          e

        }

        return sb.toString();
    }
}