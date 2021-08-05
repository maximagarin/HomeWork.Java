package HomeWorkLesson06;

public class Animal {
    static final int canSwim = 1;
    static final int cantSwim = 0;

    private String animalType;
    protected String name;
    private int swim;
    private int run;

    Animal(String animalType,String name, int swim, int run) {
        this.animalType = animalType;
        this.name = name;
        this.swim = swim;
        this.run = run;
    }
    String getName() {
        return this.name;
    }
    String getAnimalType() {
        return this.animalType;
    }
    int getSwim() {
        return this.swim;
    }
    int getRun() {
        return this.run;
    }
    protected boolean methodRun(int distance) {

        return (distance <= run);
    }
    protected int methodSwim(int distance){

        return (distance <= swim) ? canSwim : cantSwim;
    }
}
