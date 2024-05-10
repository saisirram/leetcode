class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int carry = 1;
        int lastIdx = -1;
        if (digits[length - 1] < 9) {
            digits[length - 1] += 1;
            return digits;
        } else {
            digits[length - 1] = 0;
            for (int i = length -2 ; i>=0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += carry;
                    carry = 0;
                    break;
                }
            }
        }
        if (carry == 1) {
            int[] newDigits = new int[length + 1];
            newDigits[0] = 1;
            for (int i = 1; i<newDigits.length; i++) {
                newDigits[i] = digits[i-1];
            }
            return newDigits;
        }
        return digits;
    }
}