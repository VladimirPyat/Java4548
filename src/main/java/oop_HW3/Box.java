package oop_HW3;


public class Box extends Container {

    private int weight;
    private static int maxWeight=20;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return " " + weight;}


    public Box(int weight) {
        try {
            if (weight<=maxWeight) {
                this.weight=weight;
            }
            else {
                this.weight=maxWeight;
                throw new IllegalArgumentException("Weight cannot exceed max weight");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.print("\u001B[31m"+"Ошибка: " + e.getMessage()+"\u001B[0m");
            System.out.println(", записано максимально возможное значение");
        }

    }

    public Box() {
        this(maxWeight);
    }


}
