package _final_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Toys {
    /**
     * В этом классе задан список возможных игрушек
     * Задаем названия подклассов (Машинка, Кукла и т.п.) и id подкласса.
     *
     * для подсчета созданных экземпляров есть список copyCounter. при создании экземпляра в него добавляется значение subclassId
     * Экземпляры создаются по id подкласса, при этом имя задается автоматически как имя подкласса + число экземпляров в подклассе
     */
    private static ArrayList <Integer> copyCounter = new ArrayList<>();
    private static Map <Integer, String> toyIdAndName = new HashMap<>();
    private int subclassId;
    private String name;

    static {
        toyIdAndName.put(1, "Car");
        toyIdAndName.put(2, "Doll");
        toyIdAndName.put(3, "Car");
        toyIdAndName.put(4, "Railroad");
    }

    public Toys(int subclassId) {
        String toyName = toyIdAndName.getOrDefault(subclassId, null);
        if (toyName == null) {
            throw new IllegalArgumentException("Не найдена игрушка с id"+subclassId);
        }
        this.subclassId = subclassId;
        copyCounter.add(subclassId);
        this.name = toyName + Collections.frequency(copyCounter, subclassId);

    }

    public int getSubclassId() {
        return subclassId;
    }

    public String getName() {
        return name;
    }
}

