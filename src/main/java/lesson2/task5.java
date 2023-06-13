package lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class task5 {
    public static void main(String[] args) throws IOException {
        String pathProject = System.getProperty("user.dir");
        //String pathDir = pathProject.concat("/files");
        System.out.println(pathProject);
        File dir = new File(pathProject);

        try  (FileWriter fw = new FileWriter ("test.txt", false)) {
            for (String fname : dir.list()) {
                fw.write(fname + "\n");
            }
            fw.flush();
        }

        catch(IOException ex) {
            System.out.print(ex.getMessage());
        }
        Logger logger = Logger.getLogger(task5.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        fh.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");


    }
}
