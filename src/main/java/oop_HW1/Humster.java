package oop_HW1;

import java.util.Arrays;
import java.util.Random;

/**
 Хомячок
 maxage - максимальный возраст, заданный в программе для данного животного
 sound - звук, издаваемый животным
 хомяк не реагирует на свое имя. часто спит
 prefFood - еда, которую любит питомец
 хомяки едят {"морковка", "трава", "яблоко"}

 */


public class Humster extends Zoo {
    private static int nextId = 0;
    private static int maxage = 5;
    private static String sound = "пииии";
    private static String[] prefFood =  {"морковка", "трава", "яблоко"};
    private static Random rand = new Random();

    public Humster(int id, String name, int age, boolean asleep) {
        super(id, name, age, asleep);
    }
    public Humster() {
        super(nextId++, "NewHumster"+nextId, rand.nextInt(1, maxage), false);
    }

    public static String[] getPrefFood() {
        return prefFood;
    }

    public static String getSound() {
        return sound;
    }

    private static int selfSleep = 5;



    public  void makeCall(String name) {
        if (!isSleeping(selfSleep)) {

            System.out.printf("%s не реагирует", this.name); System.out.println();
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }
    public  void giveFood(String food) {
        if (!isSleeping(selfSleep)) {
            if (Arrays.asList(prefFood).contains(food)) {
                System.out.printf("%s ест %s", this.name, food); System.out.println();
            } else {
                System.out.printf("%s Понюхал и не взял %s", this.name, food); System.out.println();
            }
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }

    public  void makePet() {
        if (!isSleeping(selfSleep)) {
            System.out.printf("%s радостно пищит", this.name); System.out.println();
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }

}
