package homework5;

import java.util.*;

public class phonebook {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> userArray = new HashMap<>();
        boolean progRun = true;
        Scanner scan = new Scanner(System.in);
        while (progRun) {
            System.out.println("Введите команду (add/get/remove/list/exit): ");
            String commandline = scan.nextLine().toLowerCase();
            String [] command = commandline.split(" ");
            System.out.println(Arrays.stream(command).toList());


            switch (command [0])   {
                case "exit": {
                    System.out.println("Завершение программы");
                    progRun = false;
                    break;
                }
                case "list": {
                    System.out.println(userArray);
                    break;
                }
                case "add": {

                    if (command.length!=3) {
                        System.out.println("Неверный формат команды");
                        break;
                    }
                    else {
                        String currentName = command[1];
                        String currentPhone = command[2];
                        ArrayList<String> temp = new ArrayList<>();
                        if (userArray.keySet().contains(command[1])) {
                            System.out.println("Добавление номера");
                            temp = userArray.get(currentName);                  //считали массив номеров по фамилии
                        }
                        else {
                            System.out.println("Создание контакта");
                        }
                        temp.add(currentPhone);                               //добавили номер, извлеченный из команды
                        userArray.put(currentName, temp);
                        break;
                    }
                }

                case "get": {
                    if (command.length!=2) {
                        System.out.println("Неверный формат команды");
                        break;
                    }
                    else {
                        String currentName = command[1];

                        if (userArray.keySet().contains(command[1])) {
                            System.out.println(userArray.get(currentName));
                        }
                        else {
                            System.out.println("Нет такого контакта в списке");
                        }
                        break;
                    }
                }

                case "remove": {
                    if (command.length!=2) {
                        System.out.println("Неверный формат команды");
                        break;
                    }
                    else {
                        String currentName = command[1];
                        if (userArray.keySet().contains(command[1])) {
                            userArray.remove(currentName);
                        }
                        else {
                            System.out.println("Нет такого контакта в списке");
                        }
                        break;
                    }
                }

                default: {
                    System.out.println("Неизвестная команда");

                    break;

                }
            }

        }
    }
}
