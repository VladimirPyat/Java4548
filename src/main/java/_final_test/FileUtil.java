package _final_test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Данный класс отвечает только за запись в файл, какие призы разыграны и какие призы забрали
 * при первой инициализации происходит очистка файла filename
 */
public class FileUtil {
    public String filename="toysdata.txt";
    public FileUtil() {
    }

    public void prizeLogging(String newstring) {

        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(newstring + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи файла", e);
        }
    }

    public void prizeLogging(boolean clearFile) {

        try (FileWriter writer = new FileWriter(filename, !clearFile)) {
            writer.write("");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи файла", e);
        }
    }

}
