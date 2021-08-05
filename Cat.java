package HomeWorkLesson06;

public class Cat extends Animal {
    Cat(String name, int swim, int run) {
        super("Cat", name, swim,run);
    }
    @Override
    public int methodSwim(int distance) {
        return Animal.cantSwim;
    }
}
