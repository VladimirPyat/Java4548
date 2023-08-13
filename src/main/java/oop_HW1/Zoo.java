package oop_HW1;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
класс "животные"
каждый питомец имеет имя. его можно позвать (makeCall)
каждый питомец предпочитает определенную еду. его можно кормить (giveFood)
питомца можно погладить (makePet)
питомец может спать или бодрствовать. когда он спит - ни на что не реагирует.

*/


public abstract class Zoo {
    int id;
    protected String name;
    protected int age;
    protected boolean asleep;
    protected static Random rand = new Random();
    private static String[] prefFood;
    private static int selfSleep;   //чем больше - тем ниже вероятность сна

    protected boolean isSleeping(int sleepChance) {

        int r = rand.nextInt(1,sleepChance);
        boolean result = r == 1 ? true : false;
        return result;
    }

    protected abstract void makeCall(String name);


    protected abstract void makePet();

    public  void giveFood(String food) {
        if (!isSleeping(this.selfSleep)) {
            if (Arrays.asList(this.prefFood).contains(food)) {
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


    public String getName() {
        return name;
    }
}
