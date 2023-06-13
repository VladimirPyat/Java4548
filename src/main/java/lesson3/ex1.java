package lesson3;
import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> planets = List.of("Mercury", "Venus", "Mars", "Earth", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto");
        List<String> temp = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            temp.add(planets.get(random.nextInt(planets.size())));
        }
        System.out.println(temp);

        for (int i = 0; i < planets.size(); i++) {
            int count = 0;
            for (String j : temp) {
                if (j.equals(planets.get(i))) {
                    count++;
                }
            }
            System.out.println(planets.get(i)+": "+count);
        }

        int i = 0;
        while (i < temp.size()) {
            int j = i+1;
            while (j < temp.size()) {
                if (temp.get(i).equals(temp.get(j))) {
                    temp.remove(j);
                }
                else {
                    j++;
                }
            }
        i++;
        }
        System.out.println(temp);



    }
}
