//aufg1
import java.util.ArrayList;
import java.util.List;

class BenotungsSystem {
    public static List<Integer> nichtAusreichend(int[] noten) {
        List<Integer> nichtAusreichend = new ArrayList<>();
        for (int grade : noten) {
            if (grade < 40) {
                nichtAusreichend.add(grade);
            }
        }
        return nichtAusreichend;
    }

    public static double Durchschnitt(int[] noten) {
        int sum = 0;
        for (int grade : noten) {
            sum += grade;
        }
        double average = (double) sum / noten.length;
        return Math.round(average * 100.0) / 100.0;
    }

    public static int[] abgerundetNote(int[] noten) {
        int[] abgerundedNote = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            abgerundedNote[i] = abgerundet(noten[i]);
        }
        return abgerundedNote;
    }

    private static int abgerundet(int note) {
        if (note < 38) {
            return note;
        }
        int nachsteMultipelVonFunf = ((note / 5) + 1) * 5;
        if (nachsteMultipelVonFunf - note < 3) {
            return nachsteMultipelVonFunf;
        } else {
            return note;
        }
    }

    public static int max_abgerundet(int[] noten) {
        int[] abgerundet_Note = abgerundetNote(noten);
        int maxNote = abgerundet_Note[0];
        for (int grade : abgerundet_Note) {
            if (grade > maxNote ) {
                maxNote  = grade;
            }
        }
        return maxNote ;
    }
}