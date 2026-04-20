class Solution {
    public String addBinary(String a, String b) {

        if(a.length() < b.length()) {
            return addBinary(b, a);
        }

        StringBuilder sb = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;


        while(i >= 0) {
            int sum = carry + (a.charAt(i) - '0');

            if(j >= 0)
                sum += b.charAt(j) - '0';

            sb.append(sum % 2);
            carry = sum / 2;

            j--;
            i--;
        }

        if(carry == 1) sb.append(carry);

        

        return sb.reverse().toString();
    }
}