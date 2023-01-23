package HW.HW_006.task_two;

import java.util.ArrayList;

public class MutableList<T> extends AbstractList<T> {

    public MutableList() {
        this.spisok = new ArrayList<>();
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

    public void addInList(T i){
        spisok.add(i);
    };

    public void removeInList(T i){
        spisok.remove(i);
    };
}
