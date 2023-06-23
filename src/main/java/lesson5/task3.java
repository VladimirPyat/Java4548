package lesson5;

import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        Map<String, Integer> table =  Map.of (
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D",500,
                "M", 1000);
        String userString = "MMDCXLIV";
        int summ = 0;
        int currentNumber;
        int rightNumber = table.get(String.valueOf(userString.charAt(userString.length()-1)));
        int koeff;
        System.out.println("Roman: "+userString);

        for (int i=userString.length()-1; i>=0; i--) {
            currentNumber = table.get(String.valueOf(userString.charAt(i)));
            koeff = currentNumber < rightNumber ? -1 : 1;

            summ += koeff*currentNumber;
            rightNumber = currentNumber;
        }

        System.out.println("Arabic: " + summ);






    }






}
