package HW.HW_007.ui;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import HW.HW_007.data.ContactMain;

public class ConsoleView implements View {

    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in);
    }

    @Override
    public String getAddress() {
        System.out.println("Address: ");
        return in.nextLine();
    }

    @Override
    public Map<String, String> getCommunicationMethods() {
        System.out.println("CommunicationMethods: ");
        return null;
    }

    @Override
    public String getCompanyName() {
        System.out.println("CompanyName: ");
        return null;
    }

    @Override
    public String getName() {
        System.out.println("Name");
        return in.next();
    }

    @Override
    public String getOccupation() {
        System.out.println("Occupation: ");
        return in.nextLine();
    }

    @Override
    public void setAddress() {
        System.out.println("Address");
        // in.nextLine();

    }

    @Override
    public String setCompanyName() {
        System.out.println("Company Name:");
        return in.next();

    }

    @Override
    public String setName() {
        System.out.println("Name:");
        return in.next();

    }

    @Override
    public String setKey() {
        System.out.println("Способ связи: ");
        return in.next();

    }

    @Override
    public String setValue() {
        System.out.println("Контакт: ");
        return in.next();

    }

    @Override
    public String setOccupation() {
        System.out.println("Должность");
        return in.next();

    }

    public void printMetod(List<ContactMain> cMain) {
        for (ContactMain item : cMain) {
            System.out.println(item);
        }
    }

    public Integer getIndex() {
        System.out.println("Выберете контакт");
        return in.nextInt() - 1;
    }

};