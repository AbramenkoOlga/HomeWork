package HomeWork_6;

public class Animal {
    private int run;
    private int swim;

    public Animal(int run, int swim){
        this.run = run;
        run = 0;
        this.swim = swim;
        swim = 0;
    }

}

public class Cat extends Animal{
    public Cat(int run, int swim) {
        super(run, swim);
        if(run<200) {
            System.out.println("Кот пробежал " + run + " метров");
        } else {
            System.out.println("Ограничение по длинне дистанции");
        }
        if (swim >=0 ){
            System.out.println("Коты не умеют плавать");
        }
    }
}

public class Dog extends Animal {
    public Dog(int run, int swim) {
        super(run, swim);
        if(run>500){
            System.out.println("Ограничение по длинне дистанции");
        } else {
            System.out.println("Собака пробежала " + run + " метров");
        }
        if (swim>10) {
            System.out.println("Ограничение по длинне дистанции");
        } else {
            System.out.println("Собака проплыла " + swim + " метров");
        }
    }
}

public class HomeWork_6 {
    public static void main(String[] args) {
        new Cat(150, 3);
        new Dog(450, 5);
    }
}
