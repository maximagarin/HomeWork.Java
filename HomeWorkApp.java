package HomeWorkLesson1;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

//1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
//2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("----------");

        //3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
        //Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
        //то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

        int a = -1;
        int b = 0;
        int result = checkSumSign(a, b);
        if (result < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма Положительная");
        }
        {
            System.out.println("---------");
        }
        // 4.Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
        //Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
        //если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
        //если больше 100 (100 исключительно) - “Зеленый”;
        printColor(0);

        // 5.Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
        //и инициализируйте их любыми значениями, которыми захотите.
        //Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
       compareNumbers(10, 10);

       //6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
    }

    public static int checkSumSign(int valueA, int valueB) {
        return valueA + valueB;
    }

    public static void printColor(int Value) {
        if (Value < 1) {
            System.out.println("Красный");
        } else if (Value < 101) {
            System.out.println(":Желтый");
        } else {
            System.out.println("Зеленый");

        }
        {
            System.out.println("-------");
        }
    }

    public static void compareNumbers(int valueА, int valueB) {
        if (valueB < valueА) {
            System.out.println("a >= b");
        } else if (valueB == valueА) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}