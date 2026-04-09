class Solution {
    public String addBinary(String a, String b) {
        if (a.length() < b.length())
            return addBinary(b, a);

        StringBuilder sb = new StringBuilder();

        int carry = 0;
        int j = b.length() - 1;
        for (int i = a.length() - 1; i >= 0; i--, j--) {
            int sum = carry;

            if (a.charAt(i) == '1')
                sum += 1;

            if (j >= 0 && b.charAt(j) == '1')
                sum += 1;

            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry == 1)
            sb.append(carry);

        sb.reverse();
        String binary = sb.toString();

        return binary;
    }
}