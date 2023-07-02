package oop_HW1;

import java.util.Arrays;
import java.util.Random;

/**
 Кот
 maxage - максимальный возраст, заданный в программе для данного животного
 sound - звук, издаваемый животным
 коты могу отзываться или не отзываться на имя
 prefFood - еда, которую любит питомец
 коты едят {"сметана", "рыба", "кошачий корм"}

 */


public class Cat extends Zoo {
    private static int nextId = 0;
    private static int maxage = 15;
    private static String sound = "мяяяууу";
    private static String[] prefFood =  {"сметана", "рыба", "кошачий корм"};
    private static Random rand = new Random();

    public Cat(int id, String name, int age, boolean asleep) {
        super(id, name, age, asleep);
    }
    public Cat() {
        super(nextId++, "NewCat"+nextId, rand.nextInt(1, maxage), false);
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
            int r = rand.nextInt(1,5);
            if (r == 1) {
                System.out.printf("%s бежит и трется об ноги", this.name); System.out.println();
            }
            else if (r == 2){
                System.out.printf("%s говорит %s", this.name, Cat.getSound()); System.out.println();
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
            } else {
                System.out.printf("%s Понюхал и не взял %s", this.name, food); System.out.println();
            }
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }

    public  void makePet() {
        if (!isSleeping()) {
            int r = rand.nextInt(1,4);
            if (r == 2) {
                System.out.printf("%s шипит и пытается поцарапать", this.name); System.out.println();
            }
            else {
                System.out.printf("%s радостно урчит и мурлыкает", this.name); System.out.println();
            }
        }
        else {
            System.out.printf("%s спит", this.name); System.out.println();
        }
    }

}
