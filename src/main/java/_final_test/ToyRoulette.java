package _final_test;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Данный класс используется как для создания генератора случайных значений id сообразно весам
 * в список randomizeList добавляется id игрушки столько раз, какое значение содержится в поле randomWeight
 * чем больше вес - тем чаще будет выпадать игрушка
 */
public class ToyRoulette {
    private static ArrayList<Integer> randomizeList = new ArrayList<>();


    public ToyRoulette() {
    }

    public static void addToRandomizeList(int id, int randomWeight) {
        for (int i=0; i<randomWeight; i++) {
            randomizeList.add(id);
        }

    }

    public static void delFromRandomizeList (int id) {
        Iterator<Integer> iterator = randomizeList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element.equals(id)) {
                iterator.remove();
            }
        }

    }


    public int getRandomId() {
        Random random = new Random();
        int randomIndex = random.nextInt(0, randomizeList.size());
        return randomizeList.get(randomIndex);
    }



}
