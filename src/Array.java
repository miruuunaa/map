class Array {

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }


    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }


    public static int findMaxSum(int[] numbers) {
        int min = findMin(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum - min;
    }


    public static int findMinSum(int[] numbers) {
        int max = findMax(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum - max;
    }
}
