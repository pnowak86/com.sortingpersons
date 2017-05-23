package com.sortingobjects;

/**
 * Created by RENT on 2017-05-22.
 */
public class PeopleGenerator {
    public Person table[] = new Person[5];

    public Person[] createTable() {
        Person person1 = new Person(23, "Kowalski");
        Person person2 = new Person(11, "Nowak");
        Person person3 = new Person(33, "Zurek");
        Person person4 = new Person(50, "Bomba");
        Person person5 = new Person(80, "Palikot");
      // Person person6 = new Person(35, "Duda");



        table[0] = person1;
        table[1] = person2;
        table[2] = person3;
        table[3] = person4;
        table[4] = person5;
        //table[5] = person6;

       return table;
    }


}
