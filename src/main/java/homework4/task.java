package homework4;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//        4. Если введено exit, то программа завершается
public class task {
    public static void main(String[] args) {
        ArrayDeque<String> userArray = new ArrayDeque<String>();
        boolean progRun = true;
        Scanner scan = new Scanner(System.in);
        while (progRun) {
            System.out.println("Введите команду: ");
            String command = scan.nextLine();

            if (command == "exit") {
                System.out.println("Завершение программы");
                progRun = false;
                break;
            }
            switch (command)   {
                case "exit": {
                    System.out.println("Завершение программы");
                    progRun = false;
                    break;
                }
                case "print": {
                    System.out.println("PRINT");
                    for (String element : userArray) {
                        System.out.print(element+"\t");
                    }
                    System.out.println("");
                    break;
                }
                case "revert": {
                    System.out.println("REVERT");
                    try {
                        userArray.removeFirst();
                    }
                    catch (NoSuchElementException ex) {
                        System.out.println("Нет элемента для удаления");
                    };
                    break;
                }
                default: {
                    System.out.println("ADD");
                    userArray.addFirst(command);
                    break;

                }
            }

        }
    }



}
