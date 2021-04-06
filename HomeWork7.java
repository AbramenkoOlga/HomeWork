package HomeWork7;

public class Cat {
    private final String name;
    private boolean hungry;
    private final int appetite;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        hungry = true;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
    public boolean isHungry() {
        return hungry;
    }

    public void eat(Plate plate) {
        hungry = !plate.eat(appetite);
        if(hungry) {
            System.out.println("Еды недостаточно");
        } else {
            System.out.println(this + " поел " + appetite + " корма");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}



public class Plate {
    private int capacity;

    public Plate (int capacity) {
        this.capacity = capacity;
    }
    public void addFood(int capacity) {
        this.capacity +=capacity;
    }
    public boolean eat(int appetite) {
        if (capacity >= appetite) {
            capacity -=appetite;
            return true;
        } else {
            return false;
        }
    }
}



public class MainClass {

    public static void main(String[] args) {
            Plate plate = new Plate(30);
            Cat[] cats = new Cat[5];
            for (int i = 0; i < 5; i++) {
                    cats[i] = new Cat("Кот " + (i + 1), (int) (Math.random() * 30));
            }

            for (Cat cat : cats) {
                    cat.eat(plate);

            }
    }
}
