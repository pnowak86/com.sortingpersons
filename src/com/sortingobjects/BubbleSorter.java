package com.sortingobjects;

/**
 * Created by RENT on 2017-05-22.
 */
public class BubbleSorter {

public Person[] sort(Person[] people) {

    boolean wasSwap = true;
    while (wasSwap) {
        wasSwap = false;

        for (int j = 0; j < people.length - 1; j++) {
            if (people[j].getAge() > people[j + 1].getAge()) {
                Person temp = people[j];
                people[j] = people[j + 1];
                people[j + 1] = temp;
                wasSwap = true;


               // for (int i = 0; i < people.table.length; i++) {
                    //System.out.println("Sortowanie według wieku, wiek: " + people.table[i].getAge() + ", " + people.table[i].getSurname());
                }
            }
        }
        return people;
    }
}



