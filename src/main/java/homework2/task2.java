package homework2;

import lesson2.task5;

import java.util.Arrays;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class task2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(task2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        int [] userArr = {7, 2, 6, 14, 16, 3, 11};
        System.out.println(Arrays.toString(userArr));
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < userArr.length-1; i++) {
                if(userArr[i] > userArr[i+1]){
                    sorted = false;
                    temp = userArr[i];
                    userArr[i] = userArr[i+1];
                    userArr[i+1] = temp;
                    logger.info("Еще одна иттерация");
                }
            }
        }
        logger.info("Сортировка завершена");
        System.out.println(Arrays.toString(userArr));

    }
}
