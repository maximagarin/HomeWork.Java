package HomeWorkLesson07.parts;

public class Leg extends RobotPart{
    private int speed;

    public Leg(Robot robot, String name, int levelValue) {
        super(robot, name);
        this.robotLevel = levelValue;
        this.speed = calculateSpeed();
    }

    private int calculateSpeed(){
        return robotLevel + generateRandomBorder(robotLevel, nameParts.length());
    }

    public int getSpeed() {
        return speed;
    }
}
