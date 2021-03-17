package Homework;

public class Homework1 {

    //Создать переменные всех пройденных типов данных и инициализировать их значения.

    public static void main(String[] args) {

        //целые числа

        byte byteValue = 20; // 1b 256 -> [-128; 127]
        short shortValue = 10000; // 2b 2 ^ 1б [-2 ^ 15; 2 ^ 15 - 1]
        int intValue = 1000000000; // 4b 2 ^ 32
        long longValue = 1000000000000L; // 8b 2^64 -> 10 ^ 19

        //дробные числа

        float floatValue = 0.5f; // 4b 2 ^ 25 *10 ^ (2 ^ 5) 8 digits
        double doubleValue = 0.5; // 8b 1б digits


        // истина || ложь

        boolean booleanValue = true; // false

        //символьные
        char charValue = '\'';
    }

    //Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static float task3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static void main(String[] args) {
        System.out.println(task3(5f, 7f, 15f, 2f));
    }

    /*Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
    лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false.*/

    public static boolean task4(int a, int b) {
            int sum = (a + b);
            return sum >= 10 && sum <= 20;
        }

    public static void main(String[] args) {
        System.out.println(task4(7, 9));
    }

    /*Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.*/

    public static void main(String[] args) {
        int f = -9;
        if(f > 0) {
            System.out.println("Положительное ");
        } else {
            System.out.println("Отрицательное");
        };
    }

    /*Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/

    public static boolean task6(int x){
        if(x>0){
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(task6(-5));

    }

    /*Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».*/

    public static void task7(String name) {
        System.out.println("Привет, " + name);
    }
    public static void main(String[] args){
        task7("Ольга");
    }


    /* Написать метод, который определяет, является ли год високосным, и выводит сообщение
    в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
    при этом каждый 400-й – високосный.*/

    public static void year(int y){
        if(y % 4 == 0){
            if(y % 400 == 0 || y % 100 != 0) {
                System.out.println("Год высокосный");
            } else {
                System.out.println("Год не высокосный");
            }
        }
    }
    public static void main(String[] args){
        year(2020);
    }
}

