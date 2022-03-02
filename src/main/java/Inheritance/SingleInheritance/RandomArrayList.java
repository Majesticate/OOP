package Inheritance.SingleInheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayList extends ArrayList<Object> {
    List<Animal> list;

    public RandomArrayList() {
        this.list = new ArrayList<>();
    }

    //getRandomElement(): Object
    public Object getRandomElement() {
        Random r = new Random();
        return r.nextInt(list.size());
    }

}
