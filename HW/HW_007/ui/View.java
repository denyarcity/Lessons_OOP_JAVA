package ui;

import java.util.Map;

public interface View {
    String getName();

    String setName();

    Map<String, String> getCommunicationMethods();

    String setKey();

    String setValue();

    String getAddress();

    void setAddress();

    String getCompanyName();

    String setCompanyName();

    String getOccupation();

    String setOccupation();
}