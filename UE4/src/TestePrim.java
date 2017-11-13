import java.lang.Math;

public class TestePrim {
    public static boolean testeObPrim(int zahl){
        if (zahl == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt((double) zahl); i++) {
                if (zahl % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
