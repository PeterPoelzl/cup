import becker.robots.*;

class TesteStatistiker {
    public static void testeStatistiker(){
        City c = new City();
        Thing thing1 = new Thing(c, 1, 1);
        Thing thing2 = new Thing(c, 1, 1);
        Thing thing3 = new Thing(c, 1, 1);
        Thing thing4 = new Thing(c, 2, 1);
        Thing thing5 = new Thing(c, 2, 1);
        Thing thing6 = new Thing(c, 3, 1);
        Thing thing7 = new Thing(c, 3, 1);
        Thing thing8 = new Thing(c, 3, 1);
        Thing thing9 = new Thing(c, 3, 1);

        RobotSE robi = new RobotSE(c, 0, 1, Direction.SOUTH);
        Statistiker statistiker = new Statistiker(robi);
        statistiker.machBalkendiagramm();
    }
}
