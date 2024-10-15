//aufg2

class Array {
    public static int findeMax(int[] zahlen) {
        int max = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl > max) {
                max = zahl;
            }
        }
        return max;
    }


    public static int findeMin(int[] zahlen) {
        int min = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl < min) {
                min = zahl;
            }
        }
        return min;
    }


    public static int findeMaxSumme(int[] zahlen) {
        int min = findeMin(zahlen);//valoarea minima din array
        int sum = 0;
        for (int zahl : zahlen) {
            sum += zahl;
        }
        return sum - min;
    }


    public static int findeMinSumme(int[] zahlen) {
        int max = findeMax(zahlen);
        int sum = 0;
        for (int zahl : zahlen) {
            sum += zahl;
        }
        return sum - max;
    }
}
