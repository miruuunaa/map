import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //aufgabe1
        System.out.println("Aufgabe 1");

        System.out.println("Geben Sie die Anzahl der Noten für Aufgabe 1 ein:");
        int n = scanner.nextInt(); //se citeste
        int[] noten = new int[n];

        System.out.println("Geben Sie die Noten ein:");
        for (int i = 0; i < n; i++) {
            noten[i] = scanner.nextInt();
        }

        System.out.println("Nicht ausreichende Noten(<40): " + BenotungsSystem.nichtAusreichend(noten));
        System.out.println("Durchschnittswert: " + BenotungsSystem.Durchschnitt(noten));
        System.out.println("Abgerundete Noten: " + Arrays.toString(BenotungsSystem.abgerundetNote(noten)));
        System.out.println("Maximale abgerundete Note: " + BenotungsSystem.max_abgerundet(noten));

        //aufgabe2
        System.out.println("Aufgabe 2");

        System.out.println("Geben Sie die Anzahl der Zahlen für Aufgabe 2 ein:");
        int m = scanner.nextInt();
        int[] numbers = new int[m];

        System.out.println("Geben Sie die Zahlen ein:");
        for (int i = 0; i < m; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Maximale Zahl: " + Array.findeMax(numbers));
        System.out.println("Minimale Zahl: " + Array.findeMin(numbers));
        System.out.println("Maximale Summe von n-1 Zahlen: " + Array.findeMaxSumme(numbers));
        System.out.println("Minimale Summe von n-1 Zahlen: " + Array.findeMinSumme(numbers));

        //aufgabe3
        int[] num1 = new int[9];
        int[] num2 = new int[9];
        System.out.println("Aufgabe 3");

        System.out.println("Geben Sie 9 Ziffern für num1 ein:");
        for (int i = 0; i < 9; i++) {
            num1[i] = scanner.nextInt();
        }

        System.out.println("Geben Sie 9 Ziffern für num2 ein:");
        for (int i = 0; i < 9; i++) {
            num2[i] = scanner.nextInt();
        }

        System.out.println("Geben Sie Digit1: ");
        int digit1= scanner.nextInt();
        System.out.println("Geben Sie Digit2: ");
        int digit2= scanner.nextInt();
        System.out.println("Summe: " + Arrays.toString(Zahlen.summe(num1, num2)));
        System.out.println("Differenz: " + Arrays.toString(Zahlen.differenz(num1, num2)));
        System.out.println("Multiplikation: " + Arrays.toString(Zahlen.multiplikation(num1,digit1)));
        System.out.println("Division: " + Arrays.toString(Zahlen.division(num1, digit2)));

        //aufgabe4
        System.out.println("Aufgabe 4");

        System.out.println("Geben Sie die Anzahl der Tastaturen ein:");
        int tastaturenZahl = scanner.nextInt(); //nr de tastaturi
        int[] tastaturen = new int[tastaturenZahl];

        System.out.println("Geben Sie die Preise der Tastaturen ein:");
        for (int i = 0; i < tastaturenZahl; i++) {
            tastaturen[i] = scanner.nextInt();
        }

        int billigsteTastatur = Electronik.billig(tastaturen);
        System.out.println("Billigste Tastatur: " + billigsteTastatur);

        System.out.println("Geben Sie die Anzahl der USB-Laufwerke ein:");
        int usbZahl = scanner.nextInt();
        int[] usbDrives = new int[usbZahl];

        System.out.println("Geben Sie die Preise der USB-Laufwerke ein:");
        for (int i = 0; i < usbZahl; i++) {
            usbDrives[i] = scanner.nextInt();
        }

        int teuresteGegenstand = Electronik.teureste(tastaturen, usbDrives);
        System.out.println("Teuerster Gegenstand: " + teuresteGegenstand);

        System.out.println("Geben Sie das Budget ein:");
        int budget = scanner.nextInt();

        int erreichbareUSB = Electronik.teuersteUSBDrive(usbDrives, budget);
        System.out.println("Teuerstes USB-Laufwerk, das Markus kaufen kann: " + erreichbareUSB);

        System.out.println("Maximale Geldbetrag, den Markus ausgeben kann: " + Electronik.maxBudget(budget, tastaturen, usbDrives));

        scanner.close();
    }
}
