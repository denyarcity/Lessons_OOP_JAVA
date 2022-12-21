package HW.HW_002;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class JsonWrite extends FilesWriter{

    @Override
    public void writer(Map<String, Double> args) {

        try (PrintWriter file = new PrintWriter("file3.json", "UTF-8")){
            file.println("{");
            int count = 1;
            for (Map.Entry<String, Double> entry : args.entrySet()) {
                if (count == 1){
                    file.printf("\"%s\":%s", entry.getKey(), entry.getValue());
                } else {
                    file.printf(",\n\"%s\":%s", entry.getKey(), entry.getValue());
                }
                count ++;
                    }
            file.println("\n}");        
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
        
    }
