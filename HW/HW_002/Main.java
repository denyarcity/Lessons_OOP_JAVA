package HW.HW_002;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> studentsList = new HashMap<>();

        studentsList.put("Иван Иванов", 4.8);
        studentsList.put("Мария Кузнецова", 5.0);
        studentsList.put("Степан Кузьмин", 3.6);

        TxtWriter fileOne = new TxtWriter();
        fileOne.writer(studentsList);

        XmlWriter fileTwo = new XmlWriter();
        fileTwo.writer(studentsList);

        JsonWrite fileThere = new JsonWrite();
        fileThere.writer(studentsList);
    }
}
