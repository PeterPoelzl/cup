import becker.robots.*;
import java.util.Random;

public class TesteGoldsucher {
    public static void main(String[] args){
        City c = new City();
        RobotSE robi = new RobotSE(c, 1, 1, Direction.SOUTH);
        Goldsucher goldsucher = new Goldsucher(robi);

        Random random = new Random();
        int anzahl = random.nextInt(25 + 1);
        // Wenn wir eine variable Anzahl an Objekten erstellen wollen,
        // dann müssen wir sie ineinem Array speichern.
        // Dabei muss man die Anzahl der Elemente, die das Array enthalten soll, schon zum Zeitpunkt
        // der Erstellung angeben und es kann danach nicht mehr geändert werden.
        Thing t[] = new Thing[anzahl];
        for (int i = 0; i < anzahl; i++){
            t[i] = new Thing(c, 5, 1);
        }
        goldsucher.steckeClaimAb();
    }
}
