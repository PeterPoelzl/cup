import becker.robots.*;

public class TesteRausRob {
    public static void testeRaus(){
        City c = new City();
        Wall wall01 = new Wall(c, 1, 1, Direction.NORTH);
        Wall wall02 = new Wall(c, 1, 3, Direction.NORTH);
        Wall wall03 = new Wall(c, 1, 4, Direction.NORTH);
        Wall wall04 = new Wall(c, 1, 4, Direction.EAST);
        Wall wall05 = new Wall(c, 2, 4, Direction.EAST);
        Wall wall06 = new Wall(c, 3, 4, Direction.EAST);
        Wall wall07 = new Wall(c, 3, 4, Direction.SOUTH);
        Wall wall08 = new Wall(c, 3, 3, Direction.SOUTH);
        Wall wall09 = new Wall(c, 3, 2, Direction.SOUTH);
        Wall wall10 = new Wall(c, 3, 1, Direction.SOUTH);
        Wall wall11 = new Wall(c, 3, 1, Direction.WEST);
        Wall wall12 = new Wall(c, 2, 1, Direction.WEST);
        Wall wall13 = new Wall(c, 1, 1, Direction.WEST);

        RobotSE robi = new RobotSE(c, 2, 2, Direction.SOUTH);
        IchWillRausRob r = new IchWillRausRob(robi);
        r.getOut();

    }
}
