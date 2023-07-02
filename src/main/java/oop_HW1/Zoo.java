package oop_HW1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
/**
класс "животные"
каждый питомец имеет имя. его можно позвать (makeCall)
каждый питомец предпочитает определенную еду. его можно кормить (giveFood)
питомца можно погладить (makePet)
питомец может спать или бодрствовать. когда он спит - ни на что не реагирует.

*/

@Data
@AllArgsConstructor
public abstract class Zoo {
    int id;
    protected String name;
    protected int age;
    protected boolean asleep;

    protected abstract void makeCall(String name);

    protected abstract void giveFood(String food);
    protected abstract void makePet();




}
