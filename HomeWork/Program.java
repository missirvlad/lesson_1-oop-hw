package HomeWork;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Тим", 15);
        Cat cat2 = new Cat("Мурка", 20);
        Cat cat3 = new Cat("Барсик", 30);
        System.out.println("Имя - аппетит - сытость");
        System.out.println(cat1.displayInfo());
        System.out.println(cat2.displayInfo());
        System.out.println(cat3.displayInfo());
        Cat[] cats = {cat1, cat2, cat3};
        Plate plate1 = new Plate(50);
        System.out.println();
        plate1.info();
        System.out.println();
        for (Cat cat : cats) {
            cat.eat(plate1);
            System.out.println(cat.isSatiety() ? cat.getName() + " наелся" : cat.getName() + " остался голодным");
        }
        System.out.println();
        plate1.addFood(20);
        cat3.eat(plate1);
    }
}
