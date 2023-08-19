package _final_test;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * Данный класс используется для розыгрыша призов (игрушек)
 * Есть метод генерации случайного номера лотерейного билета и случайного приза
 * Есть метод получения приза по номеру билета
 * Оба метода делают записи в файл при помощи класса FileUtil
 */
public class ToyDistribution {

    private HashMap <Integer, Toys> toyDistribution;
    private ToyTemplate toyTemplate;
    private ToyRoulette roulette;

    public ToyDistribution(ToyTemplate template) {
        this.toyTemplate  = template;
        this.roulette = new ToyRoulette();
        this.toyDistribution = new HashMap<>();
        FileUtil file = new FileUtil();
        file.prizeLogging(true);
    }

    public void prizeDraw () {
        int ticketNumber = this.getTicketNumber();
        if (ticketNumber>0) {
            Toys newToy = toyTemplate.generate(roulette.getRandomId());
            this.toyDistribution.put(ticketNumber, newToy);
            String message = String.format("Билет номер %03d, ДОБАВЛЕН выигрыш - %s", ticketNumber, newToy);
            System.out.println(message);
            FileUtil file = new FileUtil();
            file.prizeLogging(message);
        } else {
            System.out.println("Недостаточно места для размещения новых призов. ");
        }

    }

    public void getPrize (int ticketNumber) {
        if (this.toyDistribution.containsKey(ticketNumber)) {
            Toys newToy = this.toyDistribution.get(ticketNumber);
            this.toyDistribution.remove(ticketNumber);
            String message = String.format("ПОЛУЧЕН выигрыш - %s по билету номер %03d, ", newToy, ticketNumber);
            System.out.println(message);
            FileUtil file = new FileUtil();
            file.prizeLogging(message);

        } else {
            System.out.println("Не найден приз с таким номером.");
        }
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Set<Integer> keySet = this.toyDistribution.keySet();
        for (int number : keySet) {
            stringBuilder.append("Билет№"+number+" - приз");
            stringBuilder.append(this.toyDistribution.get(number)+"; ");
        }
        if (stringBuilder.length()>2) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        stringBuilder.append("]");
        String result = String.valueOf(stringBuilder);
        return result;
    }

    private int getTicketNumber () {
        int MAXNUMBER = 100;
        if (toyDistribution.size()<MAXNUMBER-1) {
            Random random = new Random();
            while (true) {
                int result = random.nextInt(1,MAXNUMBER);
                if (!this.toyDistribution.containsKey(result)) {
                    return result;
                }
            }
        } else {
            return 0;
        }

    }
}
