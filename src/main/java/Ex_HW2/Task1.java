package Ex_HW2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(readFloat());

    }

    public static double readFloat() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число типа float: ");
        while (true) {
            String result;
            result = scan.next();
             try {
                 return (Double.parseDouble(result));
             }
             catch (NumberFormatException e) {
                 System.out.println("Нужно ввести число типа float");

            }
        }

    }

}
