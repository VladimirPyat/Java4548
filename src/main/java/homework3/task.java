package homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class task {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> randList = new ArrayList<>();
        int maxRand = 100;
        int listSize = 11;

        for (int i = 0; i < listSize; i++) {
            randList.add(random.nextInt(maxRand));
        }
        System.out.println(randList);
        System.out.println("Maximum = "+Maxvalue (randList));
        System.out.println("Minimum = "+Minvalue (randList));
        System.out.println("Average = "+Averagevalue (randList));
        DelEven (randList);
        System.out.println("Without even numbers: " + randList);
    }

    static int Maxvalue (List<Integer> userlist) {
        int maxvalue = userlist.get(0);
        for (int i : userlist) {
            if (i > maxvalue) {
                maxvalue = i;
            }
        }
        return (maxvalue);
    }

    static int Minvalue (List<Integer> userlist) {
        int minvalue = userlist.get(0);
        for (int i : userlist) {
            if (i < minvalue) {
                minvalue = i;
            }
        }
        return (minvalue);
    }

    static double Averagevalue (List<Integer> userlist) {
        double sum = 0;
        for (int i : userlist) {
            sum+=i;
        }
        return (sum/userlist.size());
    }

    static void DelEven (List<Integer> userlist) {
        int count = userlist.size()-1;
        while (count >=0) {
            if (userlist.get(count)%2 ==0) {
                userlist.remove(count);
            }
        count --;

        }
    return;
    }
}
