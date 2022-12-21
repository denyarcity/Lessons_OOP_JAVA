package HW.HW_002;

import java.util.Map;
import java.io.IOException;
import java.io.PrintWriter;

public class TxtWriter extends FilesWriter {

    @Override
    public void writer(Map<String, Double> args) {

        try (PrintWriter file = new PrintWriter("file1.txt", "UTF-8")){

            for (Map.Entry<String, Double> entry : args.entrySet()) {
                    file.println(entry);
                    }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}