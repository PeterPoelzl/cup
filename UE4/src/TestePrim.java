import java.lang.Math;

public class TestePrim {
    public static boolean testeObPrim(int zahl){
        // Wir können mit der unteren Schleife nur Zahlen ab 2 bestimmen, daher wird extra auf eine 1 geprüft.
        if (zahl == 1) {
            return false;
        } else {
            // Die Methode Math.sqrt(double zahl) liefert die Quadratwurzel einer Zahl.
            for (int i = 2; i <= Math.sqrt((double) zahl); i++) {
                // Wenn eine Zahl restlos durch eine andere Zahl > 1 teilbar ist, ist sie nicht prim.
                if (zahl % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
