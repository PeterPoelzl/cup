import becker.robots.*;

public class Bergarbeiter {
    private RobotSE robi;

    public Bergarbeiter(RobotSE robi){
        this.robi = robi;
    }
    public void bauRohstoffAb(){
        while (robi.frontIsClear()){
            robi.move();
            if (robi.canPickThing()){
                robi.pickAllThings();
            }
        }
        robi.turnAround();
        while (robi.getStreet() != 1 || robi.getAvenue() != 2){
            robi.move();
        }
    }
}
