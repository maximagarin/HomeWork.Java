package HomeWorkLesson05;

import HomeWorkLesson05.Employee;

public class HomeWorkLesson05 {



    public static void main(String[] args){

        Employee mainOne = new Employee("Ivanov","Petr",
                "Ivanovich","Engineer", "email@imail.com",
                "34234234",150000,27);

        //4. Создать массив из 5 сотрудников.
        Employee[] state = {
                mainOne,
                new Employee("one","one","one","one",
                        "one","one", 10000000,29),
                new Employee("two","two","two","two",
                        "email@imail.com","kmvw",44,55),
                new Employee("three","three","three","three","three",
                        "three",333333, 55),
                new Employee("FOUR","FOUR","FOUR",
                        "FOUR","FOUR","5666666",44,55),
                new Employee("five","five","five",
                        "five","five", "1000000000",20, 11) };
        printMassive(state);
        System.out.println("****");
         //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < state.length; i++) {
            if (state[i].getAge() < 40) {
                System.out.println(state[i].getFullInformation());
            }

        }

    }
    public static void printMassive(Employee[] state) {
        for (int i = 0; i < state.length  ; i++) {
            System.out.println((i + 1) + " " + state[i].getFullInformation());

        }
    }

    }

