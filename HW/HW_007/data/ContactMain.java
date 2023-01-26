package HW.HW_007.data;

import java.util.HashMap;
import java.util.Map;

public class ContactMain {

    protected String name;
    protected Map<String, String> communicationMethods;
    protected String address;

    public ContactMain(String name) {
        this.name = name;
        this.communicationMethods = new HashMap<>();
    }

    public Map<String, String> getCommunicationMethods() {
        return communicationMethods;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ContactMain [name=" + name 
        + ", communicationMethods=" 
        + communicationMethods 
        + ", address=" 
        + address
        + "]";
    }

    public String getName() {
        return name;
    }
}