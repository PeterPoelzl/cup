public class EinfacheFunktionen {
    public static double eHochX(double x, double epsilon){
        double summe = 1;
        double summand = 1;
        int i = 0;
        while (Math.abs(summand) > epsilon){
            summand *= x / (i + 1);
            summe += summand;
            i++;
        }
        return summe;
    }
}
