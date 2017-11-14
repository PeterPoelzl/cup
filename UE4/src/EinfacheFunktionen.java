public class EinfacheFunktionen {
    public static double eHochX(double x, double epsilon){
        // Da wir nur das n + 1-te Glied bestimmen können, muss das erste Glied
        // (in diesem Fall 1) schon vorbestimmt sein.
        double summe = 1;
        double summand = 1;
        int i = 0;
        // Die Funktion Math.abs(double zahl) liefert den Betrag von Zahl.
        // Eine while-Schleife hat hier den Vorteil, dass nicht jedes Glied zweimal berechnet werden muss:
        // einmal in der Schleifenbedingung und einmal im Schleifenkörper
        while (Math.abs(summand) > epsilon){
            summand *= x / (i + 1);
            summe += summand;
            i++;
        }
        return summe;
    }
}
