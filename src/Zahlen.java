//aufg3
class Zahlen {

    public static int[] summe(int[] num1, int[] num2) {
        int[] result = new int[num1.length + 1];
        int carry = 0;

        for (int i = num1.length - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;

        if (result[0] == 0) {
            int[] newResult = new int[result.length - 1];
            for (int i = 1; i < result.length; i++) {
                newResult[i - 1] = result[i];
            }
            return newResult;
        } else {
            return result;
        }

    }

    public static int[] differenz(int[] num1, int[] num2) {
        int[] result = new int[num1.length];
        int borrow = 0;

        for (int i = num1.length - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }

        return result;
    }

    public static int[] multiplikation(int[] num, int digit) {
        int[] result = new int[num.length + 1];
        int carry = 0;

        for (int i = num.length - 1; i >= 0; i--) {
            int product = num[i] * digit + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }

        result[0] = carry;

        if (result[0] == 0) {
            int[] newResult = new int[result.length - 1];
            for (int i = 1; i < result.length; i++) {
                newResult[i - 1] = result[i];
            }
            return newResult;
        } else {
            return result;
        }

    }

    public static int[] division(int[] num, int digit) {
        int[] result = new int[num.length];
        int remainder = 0;

        for (int i = 0; i < num.length; i++) {
            int current = remainder * 10 + num[i];
            result[i] = current / digit;
            remainder = current % digit;
        }

        int start = 0;
        while (start < result.length && result[start] == 0) {
            start++;
        }

        if (start == result.length) {
            return new int[]{0};
        } else {
            int[] newResult = new int[result.length - start];
            for (int i = start; i < result.length; i++) {
                newResult[i - start] = result[i];
            }
            return newResult;
        }

    }

}
