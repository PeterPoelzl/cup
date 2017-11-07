import becker.robots.*;

public class Statistiker {
    private RobotSE robi;

    public Statistiker(RobotSE robi){
        this.robi = robi;
    }
    public void machBalkendiagramm(){
        robi.move();
        while (robi.canPickThing()){
            robi.pickAllThings();
            robi.turnLeft();
            int count = robi.countThingsInBackpack();
            for (int i = count; i > 1; i--){
                robi.putThing();
                robi.move();
            }
            robi.putThing();
            robi.turnAround();
            robi.move(count - 1);
            robi.turnLeft();
            robi.move();
        }
    }
}
