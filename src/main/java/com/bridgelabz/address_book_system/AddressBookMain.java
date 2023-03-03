package com.bridgelabz.address_book_system;

import java.util.ArrayList;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book program");
        ArrayList arrayList = new ArrayList();
        AddressBook addressBook = new AddressBook();
        addressBook.createContact(arrayList);
    }
}
