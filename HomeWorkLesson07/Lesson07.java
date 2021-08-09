package HomeWorkLesson07;

public class Lesson07 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String testString = "Test";
        StringBuilder testStringBuilder = new StringBuilder("Test");
        StringBuffer stringBuffer = new StringBuffer();

        long startTime = System.nanoTime();


        for (int i = 0; i < 50000; i++) {
            testString += i;
        }

        float deltaTime = System.nanoTime() - startTime;
        System.out.println(testString);
        System.out.println("Time test string > " + deltaTime * 0.000001f + " millisec.");

        startTime = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            testStringBuilder.append(i);
        }

        deltaTime = System.nanoTime() - startTime;
        System.out.println(testStringBuilder.toString());
        System.out.println("Time test StringBuilder > " + deltaTime * 0.000001f + " millisec.");
        System.out.println(testString.equals(testStringBuilder.toString()));


    }
}
