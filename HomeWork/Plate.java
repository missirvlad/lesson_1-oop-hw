package HomeWork;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food){
        setFood(food);
    }
    public void info() {
        System.out.println("На тарелке: " + food + " ед. еды");
    }
    public void decreaseFood(double amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("Невозможно убрать больше еды, чем есть в тарелке");
        }
    }
    public void addFood(int amount) {
        food += amount;
        System.out.println("Добавлено " + amount + " еды в тарелку");

    }
}