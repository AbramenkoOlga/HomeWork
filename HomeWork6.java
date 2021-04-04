package HomeWork6;

abstract class Animal {
        private final int MAX_RUN_LENGTH = 0;
        private final int MAX_SWIM_LENGTH = 0;

        abstract void run(int length);
        abstract void swim(int length);
}


class Cat extends Animal {
        private final int MAX_RUN_LENGTH = 200;
        @Override
        void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Кот пробежал 200 метров");
            else System.out.println("Ограничение по длинне дистанции");
        }

        @Override
        void swim(int length) {
            System.out.println("Коты не умеют плавать");
        }
}

class Dog extends Animal{
        private final int MAX_RUN_LENGTH = 500;
        private final int MAX_SWIM_LENGTH = 10;

        @Override
        void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH))
                System.out.println("Собака пробежала 500 метров");
        }

        @Override
        void swim(int length) {
            if ((length >= 0) && (length <= MAX_SWIM_LENGTH))
                System.out.println("Собака проплыла 10 метров");
            else System.out.println("Ограничение по длинне дистанции");
        }
}
  

  public class HomeWork6 {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.run(200);
            cat.swim(1);

            Dog dog = new Dog();
            dog.run(500);
            dog.swim(10);
        }
}
