package HW.HW_006.task_two;

import java.util.ArrayList;

// ImmutableList<T> — коллекция, 
// которая никогда ни при каких обстоятельствах не меняется. 
// Методы:
// getSize ()
// get (int i)

public class ImmutableList extends AbstractList<Integer>{

    public ImmutableList() {
        this.spisok = new ArrayList<>();
        spisok.add(3); spisok.add(7); spisok.add(9);
        spisok.add(1); spisok.add(0); spisok.add(2);
    }
    @Override
    public void spisok(){
        System.out.println(spisok);
    }
    @Override
    public void getInt(int i) {
        System.out.println(spisok.get(i));
    }   
    @Override
    public void getSize() {
        System.out.println(spisok.size());
    }
}