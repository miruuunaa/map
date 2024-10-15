//aufg3

class Zahlen {
    public static int[] summe(int[] num1, int[] num2) {
        int[] result = new int[num1.length + 1];
        int carry = 0;
        for (int i = num1.length - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;//suma cifrei curente
            result[i + 1] = sum % 10;//cifra unitatilor
            carry = sum / 10;//cifra zecilor
        }
        result[0] = carry;//prima poz

        if (result[0] == 0) { //suma mai mica de 10
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
        int[] result = new int[num1.length];//stocare
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
    boolean negativ = (digit < 0);
    digit = Math.abs(digit);

    int[] result = new int[num.length + 1];
    int carry = 0;


    for (int i = num.length - 1; i >= 0; i--) {
        int product = num[i] * digit + carry;
        result[i + 1] = product % 10;
        carry = product / 10;
    }
    result[0] = carry;

    if (result[0] > 0) { //s a folosit carry
        int[] newResult = new int[result.length + 1];
        for (int i = 0; i < result.length; i++) {
            newResult[i + 1] = result[i];//pe poz 0 se pune carry
        }
        result = newResult;
    }

    int start = 0;
    while (start < result.length && result[start] == 0) {
        start++;
    }

    int[] finalResult = new int[result.length - start];
    for (int i = start; i < result.length; i++) {
            finalResult[i - start] = result[i];
    }
    if(negativ && finalResult.length>0){
        finalResult[0]=-finalResult[0];
    }
    return finalResult;

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
            int[] newResult = new int[result.length - start];//cate cifra sunt dupa primele 0
            for (int i = start; i < result.length; i++) {
                newResult[i - start] = result[i];//sunt asezate fara 0 de la inceput
            }
            return newResult;
        }

    }

}
