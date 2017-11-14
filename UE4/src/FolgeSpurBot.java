import becker.robots.*;

public class FolgeSpurBot {
    private RobotSE robi;

    public FolgeSpurBot(RobotSE robi){
        this.robi = robi;
    }
    public void folgeSpur() {
        robi.move();
        for (int i = 1; i <= 3; i++) {
            while (robi.canPickThing()) {
                robi.pickThing();
                robi.move();
            }
            // Zuerst versucht der Bot, die richtige Richtung zu erraten.
            robi.turnAround();
            robi.move();
            robi.turnLeft();
            robi.move();

            // Falls das nicht funktioniert hat, kommt er so einfach auf die andere Seite.
            if (!robi.canPickThing()){
                robi.turnAround();
                robi.move(2);
            }
        }
    }
}
