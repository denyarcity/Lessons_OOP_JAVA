package HW.HW_002;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class XmlWriter extends FilesWriter {

    @Override
    public void writer(Map<String, Double> args) {

        try (PrintWriter file = new PrintWriter("file2.xml", "UTF-8")){
            file.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<root>\n");
            for(Map.Entry<String, Double> entry: args.entrySet()) {
                file.append(" <Student>\n");
                file.append("  <name>" + entry.getKey() + "</name>\n");
                file.append("  <mark>" + entry.getValue() + "</mark>\n");
                file.append(" </Student>\n");
            }
            file.append("</root>\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;

    }
}