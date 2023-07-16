package oop_HW4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box <T extends Fruit> implements Iterable <T> {
     protected List <T> fruits;

     public Box() {
          this.fruits = new ArrayList<>();
     }

     public int getWeight() {
          return fruits.stream().mapToInt(Fruit::getWeight).sum();
     }


     public void add(T newFruit ) {
          this.fruits.add((T)newFruit);
     }

     public void moveTo(Box<? super T> targetBox ) {
          this.fruits.forEach(targetBox::add);
          this.fruits.clear();

     }



     @Override
     public Iterator<T> iterator() {
          return fruits.iterator();
     }
}
