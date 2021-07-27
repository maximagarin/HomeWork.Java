package HomeWorkLesson2;

public class HomeWorkLesson02 {
    public static void main (String[] args) {
        //1. Написать метод, принимающий на вход два целых числа и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
        // в противном случае – false.
        System.out.println(" " + within10and20(0,0));
        System.out.println("***");

        //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     isPositiveOrNegative(0);
     System.out.println("***");

        //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
        // если число отрицательное, и вернуть false если положительное.
        System.out.println(" " + isNegative(0));
        System.out.println("***");

        //4. Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз;
        printWordNTimes("word", 11 );



    }
    //1
    public static boolean within10and20(int x1, int x2) {
        int result = x1 + x2;
        return (result <= 20) && (result >= 10);

    }
    //2
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //3
     public static boolean isNegative(int y) {
        if (y >= 0) {
            return true;}
        else {
            return false;
        }

         }
     //4
    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(word + "_number:" + i);
        }
    }



}

