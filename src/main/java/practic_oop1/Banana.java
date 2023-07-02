package practic_oop1;

public class Banana extends Fruit{
    public Banana(Long id, int cost, String color) {
        super(id, cost, color);
    }

    @Override
    public String toString() {
        return "Banana{" + "cost=" + cost + ", color='" + color + '\'' + '}';
    }
}
