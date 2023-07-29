package Ex_HW2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        inputString();
    }
    public static void inputString() {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Введите НЕпустую строку: ");
        while (true) {
            String readLine = scan.nextLine();
            if (readLine.strip()=="") {
                throw new RuntimeException("Введена пустая строка");
            }
        }
    }
}
