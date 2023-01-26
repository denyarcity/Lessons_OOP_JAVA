package ui;

import java.util.LinkedList;
import java.util.List;

import data.Company;
import data.ContactMain;
import service.Add;
import service.Delete;
import service.PhoneBook;
import service.Search;

public class Presenter implements Add, Delete, Search {
    private PhoneBook modelPhoneBook;
    private ConsoleView view;

    public Presenter(PhoneBook modelPhoneBook, ConsoleView view) {
        this.modelPhoneBook = modelPhoneBook;
        this.view = view;
    }

    // Посмотреть список контрагентов
    public void checkList(List<ContactMain> cMains) {
        view.printMetod(cMains);
    }

    // Найти контрагента по названию. Посмотреть подробную информацию о нём
    @Override
    public List<ContactMain> search() {
        List<ContactMain> bufList = new LinkedList<>();
        String param = view.getName();
        for (ContactMain cMain : modelPhoneBook.getLst()) {
            if (cMain.getName().equals(param)) {
                bufList.add(cMain);
            }
        }
        return bufList;

    }

    // Удалить контрагента
    @Override
    public void delContact() {
        String param = view.setName();
        for (ContactMain cMain : modelPhoneBook.getLst()) {
            if (cMain.getName().equals(param)) {
                modelPhoneBook.getLst().remove(cMain);
            }
        }
    }

    // Удалить способ связи
    @Override
    public void delCommunicationMethod() {
        int choseContact = view.getIndex();
        modelPhoneBook.getLst().get(choseContact).getCommunicationMethods().remove(view.setKey());

    }

    // Добавить новый контакт
    @Override
    public void addContact() {
        modelPhoneBook.getLst().add(new ContactMain(view.setName()));

    }

    // Добавить компанию
    @Override
    public void addCompany() {
        modelPhoneBook.getLst().add(new Company(view.setName(), view.setCompanyName(), view.setOccupation()));

    }

    // Добавить способ связаться с контрагентом
    @Override
    public void addCommunicationMethod() {
        int choseContact = view.getIndex();
        modelPhoneBook.getLst().get(choseContact).getCommunicationMethods()
                .put(view.setKey(), view.setValue());
    }

}