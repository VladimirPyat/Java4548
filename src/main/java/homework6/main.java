package homework6;


import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int datasize = 5;                                                                   //задаем размер списка ноутбуков
        ArrayList<Notebook> notebooks = new ArrayList<Notebook>();                          //создание списка
        System.out.println("Создание базы данных");
        for (int i=0; i<datasize; i++) {
            notebooks.add(Notebook.generate());
            notebooks.get(i).write();

        }

        System.out.println("Введите строку для поиска");
        Scanner scan = new Scanner(System.in);                                              //поиск строки
        String answer = scan.nextLine();
        boolean findSuccess = false;
        for (int i=0; i<datasize; i++) {
            if (notebooks.get(i).filter(answer)) {
                notebooks.get(i).write();
                findSuccess = true;
            }
        }
        if (!findSuccess) {
            System.out.println("Ничего не найдено");
        }


    }
}
