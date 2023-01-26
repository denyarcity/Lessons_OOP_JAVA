package service;

import java.util.LinkedList;

import data.ContactMain;

public class PhoneBook {

    private LinkedList<ContactMain> lst;

    public PhoneBook() {
        this.lst = new LinkedList<>();
    }

    public LinkedList<ContactMain> getLst() {
        return lst;
    }

    @Override
    public String toString() {
        String result = "";
        for (ContactMain elem : lst) {
            result = result + elem + "\n";
        }
        return result;
    };

}