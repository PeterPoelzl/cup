import becker.robots.*;

public class TesteBergarbeiter {
    public static void testAbbau(){
        Stollen stollen = new Stollen();
        RobotSE robi = new RobotSE(stollen, 1, 1, Direction.EAST);
        Bergarbeiter bergarbeiter = new Bergarbeiter(robi);
        bergarbeiter.bauRohstoffAb();
    }
}
