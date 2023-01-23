package HW.HW_006.task_two;

public class Main {
    public static void main(String[] args) {
        ImmutableList immutableList = new ImmutableList();
        immutableList.spisok();
        immutableList.getInt(3);
        immutableList.getSize();
        System.out.println("--------------------");
        MutableList<Double> mutableList = new MutableList<>();
        mutableList.addInList(4.0); mutableList.addInList(3.9);
        mutableList.addInList(6.1); mutableList.addInList(0.4);
        mutableList.addInList(8.2); mutableList.addInList(9.6);
        mutableList.spisok();
        mutableList.getInt(3);
        mutableList.removeInList(4.0);
        mutableList.getSize();
        mutableList.spisok();
    }
}