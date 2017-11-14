import becker.robots.*;

class TesteRandomBot {
    public static void main(String[] args) {
        City c = new City();
        RobotSE robi = new RobotSE(c, 1, 1, Direction.NORTH);
        RobotSE robi2 = new RobotSE(c, 4, 4, Direction.NORTH);
        RandomBot randomRobi = new RandomBot(robi);
        RandomBot randomRobi2 = new RandomBot(robi2);

        boolean bool = true;
        // Wir testen darauf, dass beide Roboter nicht dieselben Koordinaten haben
        // Da sie sich abwechselnd bewegen, können sie nach jeder Bewegung zusammenstoßen.
        // Entweder testen wir in der Schleife nochmals auf eine Kollision, oder besser,
        // wir schaffen uns eine Möglichkeit, die Roboter abwechselnd ziehen zu lassen.

        // Das wäre eine entsprechende Zustandsmaschine: Wir haben eine Kontrollvariable
        // (in diesem Fall bool) und fragen deren Wert jede Schleifeniteration ab.
        // Es wird immer entweder der "if" oder der "else"-Block ausgeführt und danach
        // Die Kontrollvariable auf den gegenteiligen Wert gesetzt, damit (in unserem Beispiel)
        // das nächste Mal der andere Roboter zieht.
        while (randomRobi.getStreet() != randomRobi2.getStreet() || randomRobi.getAvenue() != randomRobi2.getAvenue()) {
            if (bool) {
                randomRobi.zufallsschritt();
            } else {
                randomRobi2.zufallsschritt();
            }
            bool = !bool;
        }
    }
}
