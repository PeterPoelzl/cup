import becker.robots.RobotSE;
import java.lang.Math;

public class TaxiBot {
    private RobotSE robi;
    public TaxiBot(RobotSE robi){
        this. robi = robi;
    }
    public int getZeile(){
        return robi.getAvenue();
    }
    public int getSpalte(){
        return robi.getStreet();
    }
    public int getDistanz(int zeile, int spalte){
        return Math.abs(zeile - getZeile()) + Math.abs(spalte - getSpalte());
    }
    public void fahreZu(int zeile, int spalte){
        int x = zeile - getZeile();
        if (x < 0){
            robi.turnAround();
        }
        robi.move(x);
        if (x < 0){
            robi.turnAround();
        }
        int y = spalte - getSpalte();
        if (y < 0){
            robi.turnRight();
        } else {
            robi.turnLeft();
        }
        robi.move(y);
    }
    public void einsteigen(){
        robi.pickThing();
    }
}
// 2, 3 -> 4, 4