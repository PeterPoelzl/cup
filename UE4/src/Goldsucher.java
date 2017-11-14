import becker.robots.*;
import java.lang.Math;

public class Goldsucher {
    private RobotSE robi;

    public Goldsucher (RobotSE robi){
        this.robi = robi;
    }
    public void steckeClaimAb(){
        robi.move(4);
        robi.pickAllThings();
        int quadrat = robi.countThingsInBackpack();
        // Die Methode Math.floor(double zahl) gibt im Fall von Bruchzahlen
        // immer die nächstniedrige ganze Zahl zurück, ungeachtet von Rundungsregeln
        // (zB Math.floor(3.7) := 3; das Gegenstück dazu ist Math.ceil()

        // Wir benötigen die Funktion, um das größtmögliche Seitenstück zu bestimmen,
        // das wir vierfach legen können und 'casten' das Ergebnis auf einen Integer,
        // weil wir ab jetzt nur mehr mit ganzen Zahlen arbeiten müssen.
        int seitenstueck = (int)Math.floor(quadrat / 4);

        for (int i = 1; i <= 4; i++){
            robi.turnLeft();
            for (int j = 1; j <= seitenstueck; j++) {
                robi.move();
                robi.putThing();
            }
        }
        robi.move();
    }
}
