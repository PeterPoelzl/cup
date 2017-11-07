public class Berechnung {
    public static long gibSumme(int anfang, int ende){
        int sum = 0;
        for (int i = anfang + anfang % 2; i <= ende; i+= 2){
            sum += i;
        }
        return sum;
    }
}
