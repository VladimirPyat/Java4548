package oop_HW1;

import java.util.Arrays;
import java.util.Random;

/**
 Собака
maxage - максимальный возраст, заданный в программе для данного животного
sound - звук, издаваемый животным
собака приходит если звать ее по имени
prefFood - еда, которую любит питомец
собаки едят {"сосиска", "косточка", "собачий корм"}

*/


public class Dog extends Zoo {
    private static int nextId = 0;
    private static int maxage = 15;
    private static String sound = "гав-гав";
    private static String[] prefFood =  {"сосиска", "косточка", "собачий корм"};
    private static Random rand = new Random();

    public Dog(int id, String name, int age, boolean asleep) {
        super(id, name, age, asleep);
    }
    public Dog() {
        super(nextId++, "NewDog"+nextId, rand.nextInt(1, maxage), false);
    }

    public static String[] getPrefFood() {
        return prefFood;
    }

    public static String getSound() {
        return sound;
    }

    private boolean isSleeping() {

        int r = rand.nextInt(1,7);
        boolean result = r == 1 ? true : false;
        return result;
    }


    public  void makeCall(String name) {
        if (!isSleeping()) {
            if (name == this.name) {
                System.out.printf("%s бежит и виляет хвостом, %s", this.name, Dog.getSound()); System.out.println();
            }
            else {
                System.out.printf("%s не реагирует", this.name); System.out.println();
            }
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }
    public  void giveFood(String food) {
        if (!isSleeping()) {
            if (Arrays.asList(prefFood).contains(food)) {
                System.out.printf("%s ест %s", this.name, food); System.out.println();
            }
            else {
                System.out.printf("%s Понюхал и не взял %s", this.name, food); System.out.println();
            }
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }

    public  void makePet() {
        if (!isSleeping()) {
            System.out.printf("%s радостно урчит и виляет хвостом", this.name); System.out.println();
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }

}
