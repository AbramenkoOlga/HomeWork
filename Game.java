package HomeWork;

import java.util.Scanner;

public class Game {
/* Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить,больше ли указанное пользователем число, чем загаданное, или меньше.
После победы или проигрыша выводится запрос –«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/

    public static int Game(){
        return (int)(Math.random() * 10);
    }

    public static void run() {
        Scanner in = new Scanner(System.in);
        int guess = Game();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите число от 0 до 9");
            String digit = in.next();
            int value;
            try {
                value = Integer.parseInt(digit);
                if(value < 0 || value> 9) {
                    System.out.println("Вы ввели число не от 0 до 9");
                    i--;
                    continue;
                    }
            } catch (Exception e) {
                 System.out.println("Вы ввели  не число");
                 i--;
                 continue;
            }
                if (value > guess) {
                    System.out.println("Загаданное число меньше");
                } else if (value < guess) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Вы угадали, было загадано число : " + guess);
                    finishDialog(in);
                    continue;
                }
            }
            System.out.println("Вы проиграли!");
    }

    public static void finishDialog(Scanner in) {
        System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
        while (true) {
            try {
                int x = in.nextInt();
                if (x == 1) {
                    run();
                    break;
                } else if (x == 0) {
                    System.out.println("Игра завершена!");
                } else {
                    System.out.println("Введите 0 или 1");
                }
            } catch (Exception e) {
                System.out.println("Введите 0 или 1");
                in.next();
            }
        }
    }

    public static void main(String[] args) {
       System.out.println("Вы в игре угадай число" +
               "У вас есть 3 попытки");
       Scanner in = new Scanner(System.in);
        run();
    }
}
