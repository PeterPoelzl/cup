import java.util.Random;

public class FlaechenSchaetzung {
    public static double gibNaeherung(Kreis f, int anzahlVersuche){
        Random random = new Random();
        double summe = 0;
        for (int i = 1; i <= anzahlVersuche; i++){
            if (f.istImBereich(random.nextDouble(), random.nextDouble())){
                // summe += 1 ist die Kurzschreibweise für summe = summe + 1
                // und geht auch mit allen anderen Operatoren, zB *= oder %=
                summe += 1;
            }
        }
        return summe / anzahlVersuche;
    }
}
