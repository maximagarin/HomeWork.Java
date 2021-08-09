package HomeWorkLesson06;

public class HomeWorkLesson06 {
    public static void main(String[] args){
        Cat cat = new Cat("Tigr",4,100);
        Dog dog = new Dog("Wolk", 100, 160);

        int runDistance = 100;
        int swimDistance = 100;

        String result = "Success";
        String resultFail = "FAIL";
        String printName;
        String printResult;

        Animal[] pets = { cat, dog};

        for (int i = 0; i < pets.length; i++) {
            String nameString = pets[i].getAnimalType() + " " + pets[i].getName() + " can";
            printName = " run" + pets[i].getRun() + " tries to run";
            printResult = (pets[i].methodRun(runDistance)) ? result : resultFail;
            result(nameString, printName, runDistance, printResult);


            int swimResult = pets[i].methodSwim(swimDistance);

        printName = "swim" + pets[i].getSwim() + " an attempt to ";
        printResult = (swimResult == Animal.canSwim) ? result : resultFail;

        if (swimResult == Animal.cantSwim)
            printResult = " FAIL!!! this type of animal can not swim";
            result(nameString, printName, runDistance, printResult);
        }


    }
    private static void result(String animalName, String event, int eventDistance, String printResult) {
        System.out.println(animalName + event + eventDistance + printResult);
    }
}
