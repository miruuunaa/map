//aufg4
class Electronik {

    public static int billig(int[] tastatur) {
        int minPreis = tastatur[0];
        for (int preis : tastatur) {
            if (preis < minPreis) {
                minPreis = preis;
            }
        }
        return minPreis;
    }

    public static int teureste(int[] tastatur, int[] usbDrives) {
        int maxPreis = 0;
        for (int preis : tastatur) {
            if (preis > maxPreis) {
                maxPreis = preis;
            }
        }
        for (int preis : usbDrives) {
            if (preis > maxPreis) {
                maxPreis = preis;
            }
        }
        return maxPreis;
    }

    public static int teuersteUSBDrive(int[] usbDrives, int budget) {
        int max = -1;
        for (int preis : usbDrives) {
            if (preis <= budget && preis > max) {
                max = preis;
            }
        }
        return max;
    }

    public static int maxBudget(int budget, int[] tastatur, int[] usbDrives) {
        int max = -1;

        for (int tastaturPreis : tastatur) {
            for (int usbPreis : usbDrives) {
                int total = tastaturPreis + usbPreis;
                if (total <= budget && total > max) {
                    max = total;
                }
            }
        }
        return max;
    }
}
