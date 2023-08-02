package Ex_HW3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class NoteWriter {
/**   Этот класс содержит метод подготовки и проверки данных для создания контакта из строки
//    Форматы данных:
 //   фамилия, имя, отчество - строки
//    датарождения - строка формата dd.mm.yyyy (от 1900 до 2023)
//    номертелефона - целое беззнаковое число без форматирования ABCXYZKLMN
//   пол - символ латиницей f или m.
*/
String inputData;
    String[] splitData;

    public NoteWriter(String inputData) throws IllegalArgumentException {
        this.inputData = inputData;
                                                                            //проверяем на этапе создания noteWriter
        try {
            this.splitData = ContactCheck.check(inputData);
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException (e);
        }                                                                   //если проверки не пройдены - поле не заполняем, бросаем исключение

}

    public String[] getSplitData() {
        return splitData;
    }

    public static void run() {
        Scanner scan = new Scanner(System.in);
        String readLine;
        System.out.println("Введите данные контакта через пробел в формате Ф И О датарождения номертелефона пол. Подробнее в справке\n" +
                "НАПРИМЕР: Неизвестный Янус Полуэктович 13.06.1900 6661234567 m. Подробнее в справке\n" +
                "Для возврата в предыдущее меню введите exit");
        while (true) {

            readLine= scan.nextLine();

            if (!readLine.equalsIgnoreCase("exit")) {
                                                                            //обработка командной строки.
                                                                            // если не exit - пытаемся выполнить команду либо бросаем исключение
                try {
                    NoteWriter noteWriter = new NoteWriter(readLine);
                    ContactData contact = new ContactData(noteWriter);
                    System.out.println("Создан контакт: "+contact);
                    FileUtil fileUtil = new FileUtil();
                    fileUtil.contactWrite(contact);
                    System.out.println("Контакт записан в файл: "+contact.getLastName() + ".txt");
                }
                catch (IllegalArgumentException e) {
                    System.err.println(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } finally {
                    System.out.println("Введите данные для создания контакта, либо exit чтоб выйти");
                }

            }
            else {
                System.out.println("Возврат");
                return;
            }

        }



    }
}
