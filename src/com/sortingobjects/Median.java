package com.sortingobjects;

/**
 * Created by Pinq on 2017-05-23.
 */
public class Median {

    public double median(Person[] people) {
        if (people.length % 2 == 0) {
            double med = 0.0;
            int m1 = people[people.length / 2].getAge();
            int m2 = people[(people.length / 2) - 1].getAge();
            med = (m1 + m2) / 2;
            return med;

        } else {
            double med = 0.0;
            int m1 = people[(people.length + 1) / 2 - 1].getAge();
            med = m1;
            return med;
        }
    }
}
