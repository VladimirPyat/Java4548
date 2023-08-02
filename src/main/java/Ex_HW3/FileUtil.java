package Ex_HW3;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

    /**
     * Этот класс выполняет запись контакта в файл
     * В случае неудачной записи выше пробрасывается исключение
     */

    public void contactWrite(ContactData contact) throws IOException {
        String filename = contact.getLastName() + ".txt";
        String data = contact.toString();
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(data + "\n");
        } catch (IOException e) {
            throw new IOException("Ошибка записи файла", e);
        }
    }
}



