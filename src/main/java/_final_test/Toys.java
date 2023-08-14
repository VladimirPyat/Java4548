package _final_test;

import java.util.*;

public class Toys {
    /**
     * Этот класс описывает саму игрушку. Содержит поля subclassId (подкласс), name (название), randomWeight (частота выпадения в лотерее)
     * randomWeight используется только при создании шаблона игрушки в классе ToyTemplate
     *
     */
    private static ArrayList <Integer> copyCounter = new ArrayList<>();
    private int subclassId;
    private int randomWeight;
    private String name;

    //этот конструктор используем для создания шаблонов
    public Toys(int subclassId, int randomWeight, String name) {
        this.subclassId = subclassId;
        this.randomWeight = randomWeight;
        this.name = name;
    }
    //этот конструктор используем для генерации на основе шаблона
    public Toys(int subclassId, String name) {
        this.subclassId = subclassId;
        copyCounter.add(subclassId);
        this.name = name;
    }

    public int getSubclassId() {
        return subclassId;
    }

    public String getName() {
        return name;
    }

    public int getRandomWeight() {
        return randomWeight;
    }

    public static int getCopycounter(int subclassId) {
        return Collections.frequency(copyCounter, subclassId);
    }

    @Override
    public String toString() {
        return "{" +
                "Id=" + subclassId +
                ", " + name +
                '}';
    }
}

