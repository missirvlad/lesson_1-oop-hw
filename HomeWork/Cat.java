package HomeWork;

public class Cat {
    private String name;
    private double appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public Cat(String name, int appetite){
        setName(name);
        setAppetite(appetite);
        setSatiety(false);
    }
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(getName() + " поел");
        } else {
            System.out.println(name + " не может покушать. Не хватает еды в тарелке.");
        }
    }
    public String displayInfo() {
        return String.format("%s - %.0f - %s", getName(), getAppetite(), isSatiety());
    }
}
