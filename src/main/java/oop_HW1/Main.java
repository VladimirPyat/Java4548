package oop_HW1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList <Zoo> animalList = new ArrayList<>();
        String [] foodList = {"сосиска", "косточка", "собачий корм", "сметана", "рыба", "кошачий корм", "морковка", "трава", "яблоко"};
        int arraySize = 8;
        Random rand = new Random();

        for (int i = 0; i < arraySize; i++) {
            int choise = rand.nextInt(1,4);
            if (choise == 1) {
                Zoo thatAnimal = new Dog();
                animalList.add(thatAnimal);
            }
            else if (choise == 2) {
                Zoo thatAnimal = new Cat();
                animalList.add(thatAnimal);
            }
            else {
                Zoo thatAnimal = new Humster();
                animalList.add(thatAnimal);
            }
        }
        System.out.println(animalList);


        animalList.get(0).makeCall(animalList.get(0).getName());
        animalList.get(1).giveFood("сосиска");
        animalList.get(2).makePet();
        animalList.get(3).makeCall("NewDog3");
        animalList.get(4).giveFood("сметана");
        animalList.get(5).makePet();
        animalList.get(6).makeCall("NewDog4");
        animalList.get(7).giveFood("морковка");



    }
}
