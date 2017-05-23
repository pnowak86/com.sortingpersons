package com.sortingobjects;

/**
 * Created by RENT on 2017-05-22.
 */
public class SelectionSorter {

    public Person[] sort(Person[] people) {

        for (int i = 0; i < people.length - 1; i++) {

            int index = i;
            for (int j = i +1; j < people.length; j++) {
                if (people[j].getAge() < people[index].getAge()) {
                    index = j;

                    Person psmall = people[index];
                    people[index] = people[i];
                    people[i] = psmall;

                }

                }
        }
        return people;
    }

}
