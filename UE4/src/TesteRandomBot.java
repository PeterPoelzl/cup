import becker.robots.*;

class TesteRandomBot {
    public static void main(String[] args) {
        City c = new City();
        RobotSE robi = new RobotSE(c, 1, 1, Direction.NORTH);
        RobotSE robi2 = new RobotSE(c, 4, 4, Direction.NORTH);
        RandomBot randomRobi = new RandomBot(robi);
        RandomBot randomRobi2 = new RandomBot(robi2);

        boolean bool = true;
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
