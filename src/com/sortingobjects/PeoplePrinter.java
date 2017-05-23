package com.sortingobjects;

/**
 * Created by RENT on 2017-05-22.
 */
public class PeoplePrinter {
    public void showTable(Person[] table)
    {

        for (int i = 0; i <table.length ; i++) {
            System.out.println("Wiek: " + table[i].getAge() + " Nazwisko: " + table[i].getSurname());
        }


    }
}
