package _final_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyTemplate toyTemplate = ToyTemplate.getInstance();
        setTemplate();
        prizeMenu(toyTemplate);

    }

    private static void prizeMenu(ToyTemplate toyTemplate) {
        ToyDistribution toyDistribution = new ToyDistribution(toyTemplate);
        int readLine;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите действие: \n" +
                    "1 - разыграть приз;\n" +
                    "2 - выдать приз;\n" +
                    "0 - завершение программы");
            while (!scan.hasNextInt()) {
                scan.next();
            }
            readLine = scan.nextInt();

            switch (readLine) {
                case 1 -> toyDistribution.prizeDraw();
                case 2 -> toyDistribution.getPrize(inputNumber());
                case 0 -> System.out.println("Выход из программы");
                default -> System.out.println("Неизвестная команда");
            }
        }
        while (readLine!=0);
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

    public static void setTemplate() {
        ToyTemplate toyTemplate = ToyTemplate.getInstance();
        Scanner scan = new Scanner(System.in);
        System.out.print("Создать шаблоны игрушек по умолчанию? (Д - по умолчанию, Н - задать вручную): ");
        String readLineStr="";
        while (!readLineStr.equalsIgnoreCase("д") && !readLineStr.equalsIgnoreCase("н")) {
            readLineStr = scan.next();
        }                                                       //по умолчанию 4 типа игрушек
        if (readLineStr.toLowerCase().equals("д")) {
            toyTemplate.add(6, "Doll");
            toyTemplate.add(5, "Car");
            toyTemplate.add(3, "DesignKit");
            toyTemplate.add(1, "Railway");
        } else {

            while (true) {
                readLineStr = "";
                System.out.print("Введите имя создаваемой игрушки: ");
                String toyName = scan.next();
                int minRandWeight = 1;
                int maxRandWeight = 20;
                System.out.printf("Введите частоту выпадания (вес) от %d до %d: ", minRandWeight, maxRandWeight);
                int randWeight = 0;
                while (true) {
                    if (scan.hasNextInt()) {
                        randWeight = scan.nextInt();
                        if (randWeight>=minRandWeight && randWeight<=maxRandWeight) {
                            break;
                        }
                    } else {
                        scan.next();
                    }
                }
                toyTemplate.add(randWeight, toyName);
                System.out.print("Ввести еще один шаблон? (Д / Н): ");
                while (!readLineStr.equalsIgnoreCase("д") && !readLineStr.equalsIgnoreCase("н")) {
                    readLineStr = scan.next();
                }
                if (readLineStr.toLowerCase().equals("н")) {
                    break;
                }
            }
        }

    }

}
