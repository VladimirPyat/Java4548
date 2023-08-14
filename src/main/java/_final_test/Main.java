package _final_test;

public class Main {
    public static void main(String[] args) {
        ToyTemplate toyTemplate = ToyTemplate.getInstance();
        toyTemplate.add(6, "Doll");
        toyTemplate.add(5, "Car");
        toyTemplate.add(3, "DesignKit");
        toyTemplate.add(1, "Railway");

        ToysRoulette roulette = new ToysRoulette();
        System.out.println("Генерация случайного id = "+roulette.getRandomId());
        System.out.println("Генерация случайного id = "+roulette.getRandomId());
        System.out.println("Генерация случайного id = "+roulette.getRandomId());
        System.out.println("Генерация случайного id = "+roulette.getRandomId());
        System.out.println("Генерация случайного id = "+roulette.getRandomId());
        System.out.println("Генерация случайного id = "+roulette.getRandomId());
        System.out.println("Генерация случайного id = "+roulette.getRandomId());
        System.out.println("Генерация случайного id = "+roulette.getRandomId());
        System.out.println("Генерация случайного id = "+roulette.getRandomId());
        System.out.println("Генерация случайного id = "+roulette.getRandomId());

    }
}
