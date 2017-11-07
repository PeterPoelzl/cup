import becker.robots.*;

public class IchWillRausRob {
    private RobotSE robi;

    public IchWillRausRob(RobotSE robi){
        this.robi = robi;
    }
    public void getOut(){
        while (robi.frontIsClear()) {
            robi.move();
        }
        robi.turnRight();
        while (robi.getStreet() != 0 || robi.getAvenue() != 2){
            robi.turnLeft();
            if (robi.frontIsClear()) {
                robi.move();
            } else {
                robi.turnRight();
                    if (robi.frontIsClear()){
                        robi.move();
                    } else {
                        robi.turnRight();
                        if (robi.frontIsClear()){
                            robi.move();
                        }
                }
            }
        }
    }
}
