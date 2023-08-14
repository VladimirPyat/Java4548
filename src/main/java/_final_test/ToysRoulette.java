package _final_test;

/**
 * Данный класс используется как для создания генератора случайных значений id сообразно весам
 * в список randomizeList добавляется id игрушки столько раз, какое значение содержится в поле randomWeight
 * чем больше вес - тем чаще будет выпадать игрушка
 */

import java.util.ArrayList;
import java.util.Random;

public class ToysRoulette {
    private static ArrayList<Integer> randomizeList = new ArrayList<>();


    public ToysRoulette() {
    }


    public static void addToRandomizeList(int id, int randomWeight) {
        for (int i=0; i<randomWeight; i++) {
            randomizeList.add(id);
        }
    }


    public int getRandomId() {
        Random random = new Random();
        int randomIndex = random.nextInt(0, randomizeList.size());
        return randomizeList.get(randomIndex);
    }





}
