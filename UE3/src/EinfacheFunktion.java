import java.lang.Math;

public class EinfacheFunktion {
    public static long faktorielle(int n){
        if (n < 0){
            return 0;
        }
        int summe = 1;
        for (int i = 1; i <= n; i++){
            summe *= i;
        }
        return summe;
    }
    public static double eHochX(double x){
        double summe = 1;
        for (int i = 0; i < 9; i++){
            summe += Math.pow(x, (double)i) / faktorielle(i);
        }
        return summe;
    }
}
