package _final_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyTemplate toyTemplate = ToyTemplate.getInstance();
        toyTemplate.add(6, "Doll");
        toyTemplate.add(5, "Car");
        toyTemplate.add(3, "DesignKit");
        toyTemplate.add(1, "Railway");


        ToyDistribution toyDistribution = new ToyDistribution(toyTemplate);
        toyDistribution.prizeDraw();
        toyDistribution.prizeDraw();
        toyDistribution.prizeDraw();

        toyDistribution.getPrize(inputNumber());
        toyDistribution.getPrize(inputNumber());
        toyDistribution.getPrize(inputNumber());

        System.out.println("Остатки призов: ");
        System.out.println(toyDistribution);



    }

    public static int inputNumber() {
        int readLine;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер билета: ");
        while (!scan.hasNextInt()) {
            scan.next();
        }
        readLine = scan.nextInt();
        return readLine;
    }
}
