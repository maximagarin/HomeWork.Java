package HomeWorkLesson05;

public class Employee {

        //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private String surname;
    private String name;
    private String secondName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    //2. Конструктор класса должен заполнять эти поля при создании объекта.



    public Employee(String surname,
                    String name,
                    String secondName,
                    String position,
                    String email,
                    String phoneNumber,
                    int salary,
                    int age) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }
    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    String getName() {
        return name;
    }
    String getSurname() {
        return surname;
    }
    String getSecondName() {
        return secondName;
    }
    String getPosition() {
        return position;
    }
    String getEmail() {
        return email;
    }
    String getPhoneNumber() {
        return phoneNumber;
    }
    int getSalary() {
        return salary;
    }
    int getAge() {
        return age;
    }
    String getFullInformation() {
        return this.name + " | "
                + this.surname + " | "
                + this.secondName + " | "
                + this.position + " is position of employ "
                + this.email + " | "
                + this.phoneNumber + " | "
                + this.getAge() + " years old "
                + this.getSalary() + " rub ";

    }
}
