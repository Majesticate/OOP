package Inheritance.SingleInheritance;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item){
        data.add(item);
    }
    public String pop(){
        String s = data.get(data.size() - 1);
        data.remove(data.size()-1);
        return s;
    }

    public String peek(){
        return data.get(data.size()-1);
    }

    public boolean isEmpty(){
        return data.size() == 0;
    }
}
