package ui;

import service.PhoneBook;

public class App {

    public static void buttonClick() {
        PhoneBook pBook = new PhoneBook();
        ConsoleView cView = new ConsoleView();
        Presenter control = new Presenter(pBook, cView);

        control.addContact();
        control.addContact();
        control.addContact();
        // control.addContact();
        // control.addContact();
        System.out.println();
        control.checkList(pBook.getLst());
        // control.delContact();
        // control.checkList(pBook.getLst());
        // System.out.println();
        // System.out.println(control.search());
        System.out.println();
        // control.addCommunicationMethod();
        // control.addCommunicationMethod();
        // control.checkList(pBook.getLst());
        // control.delCommunicationMethod();
        // control.checkList(pBook.getLst());
        control.addCompany();
        System.out.println();
        control.checkList(pBook.getLst());
        // control.addCommunicationMethod();
        // control.checkList(pBook.getLst());
        System.out.println(control.search());

    }
}
