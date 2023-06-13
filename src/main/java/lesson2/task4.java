package lesson2;
import java.io.FileWriter;
import java.io.IOException;
public class task4 {
    public static void main(String[] args) {
        int n = 100;
        String s = "test";

        //System.out.println (stringUnite(n, s));
        String data = String.valueOf(stringUnite(n, s));
        System.out.println (data);

        try  (FileWriter fw = new FileWriter ("file.txt", false)) {
            fw.write(data);
            fw.flush();
        }
        catch(IOException ex){
            System.out.print(ex.getMessage());

            }
        }



    public static StringBuilder stringUnite(int mult, String userString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mult; i++) {
            sb.append(userString);
        }
        return sb;
    }
}