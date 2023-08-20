package _final_test;

import java.util.ArrayList;

/**
 * Данный класс используется как шаблон для создания игрушек.
 * randomWeight используется в ToyRoulette для создания генератора случайных значений id сообразно весам
 * к name при генерации экземпляров на основе шаблона добавляется значение счетчика экземпляров
 */
public class ToyTemplate {

    private ArrayList<Toys> toyTemplatesList;
    private static ToyTemplate instance;


    private ToyTemplate() {
        toyTemplatesList = new ArrayList<>();
    }

    public static ToyTemplate getInstance() {
        if (instance == null) {
            instance = new ToyTemplate();
        }
        return instance;
    }

    public void add(int randomWeight, String name) {
        int subclassId = this.toyTemplatesList.size()+1;
        Toys newToy = new Toys (subclassId, randomWeight, name);
        this.toyTemplatesList.add(newToy);
        ToyRoulette.addToRandomizeList(subclassId, randomWeight);
        System.out.printf("Создан шаблон id%d '%s', частота выпадения = %d\n", subclassId, name, randomWeight);

    }

    public Toys getTemplate (int id) {
        for (Toys toy : this.toyTemplatesList) {
            if (toy.getSubclassId() == id) {
                return toy;
            }
        }
        throw new IllegalArgumentException("Не найдена игрушка с id"+id);
    }

    public Toys generate (int id) {         //генерация игрушки по шаблону
        String name = this.getTemplate(id).getName()+Toys.getCopycounter(id);
        Toys newToy = new Toys(id, name);
        return newToy;
    }

    public void changeTemplate (int id, String newName, int newRandomWeight) {
        ToyRoulette.delFromRandomizeList(id);
        getTemplate(id).setName(newName);
        getTemplate(id).setRandomWeight(newRandomWeight);
        ToyRoulette.addToRandomizeList(id, newRandomWeight);
        System.out.printf("Изменен шаблон id%d '%s', частота выпадения = %d\n", id, newName, newRandomWeight);
    }


    public ArrayList<Integer> getIdList () {
        ArrayList<Integer> idList = new ArrayList<>();
        for (Toys toy : this.toyTemplatesList) {
            idList.add(toy.getSubclassId());
        }
        return idList;
    }

    @Override
    public String toString() {
        return  '{'+
                "Список шаблонов" + toyTemplatesList +
                '}';
    }
}

