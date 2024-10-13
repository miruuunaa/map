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
        return (double) sum/noten.length;
    }

    public static int[] abgerundedNote(int[] noten) {
        int[] abgerundedNote = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            abgerundedNote[i] = abgerunded(noten[i]);
        }
        return abgerundedNote;
    }

    private static int abgerunded(int note) {
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

    public static int max_abgerunded(int[] noten) {
        int[] abgerunded_Note = abgerundedNote(noten);
        int maxNote = abgerunded_Note[0];
        for (int grade : abgerunded_Note) {
            if (grade > maxNote ) {
                maxNote  = grade;
            }
        }
        return maxNote ;
    }
}