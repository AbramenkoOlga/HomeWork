/* 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
консоль.
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/

package HomeWork5;

public class Worker {
    private String fullName;
    private String position;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;

    public Worker(String fullName, String position, String eMail,
                  String phoneNumber,int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void setAge (int age) {
            if(age > 40) {
                System.out.println(age);
            } else {
                System.out.println(" ");
            }
    }
    public  int getAge() {
        return  age;
    }

    public static void main(String[] args) {
        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Ivanov Ivan", "Ingener","eryhb@HKIK", "896353E434536Y3", 15000, 37);
        workArray[1] = new Worker("Ivanov Ivan2", "Ingener","eryhb@HKIK", "896353E434536Y3", 25000, 42);
        workArray[2] = new Worker("Ivanov Ivan3", "Ingener","eryhb@HKIK", "896353E434536Y3", 55000, 40);
        workArray[3] = new Worker("Ivanov Ivan4", "Ingener","eryhb@HKIK", "896353E434536Y3", 75000, 25);
        workArray[4] = new Worker("Ivanov Ivan5", "Ingener","eryhb@HKIK", "896353E434536Y3", 45000, 47);
        for (int i = 0; i < workArray.length; i++) {
            if(workArray[i].getAge() > 40){
                workArray[i].printInfo();;
            }
        }
    }

    private void printInfo() {
        System.out.println("Ф.И.О.: " + fullName +
                ",\n Должность:" + position +
                ",\n e-mail: " + eMail +
                ",\n номер телефона: " + phoneNumber +
                ",\n зарплата: " + salary +
                ",\n возраст: " + age);
    }
}
