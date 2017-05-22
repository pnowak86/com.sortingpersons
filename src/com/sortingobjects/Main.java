package com.sortingobjects;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Person person1 = new Person(23, "Kowalski");
        Person person2 = new Person(11, "Nowak");
        Person person3 = new Person(33, "Zurek");
        Person person4 = new Person(50, "Bomba");
        Person person5 = new Person(80, "Palikot");
        Person person6 = new Person(35, "Duda");


       Person table[] = new Person[6];
        table[0] = person1;
        table[1] = person2;
        table[2] = person3;
        table[3] = person4;
        table[4] = person5;
        table[5] = person6;

        //List<Person> personsList = new ArrayList<>();
        //personsList.add(person1);
        //personsList.add(person2);
        //personsList.add(person3);
        //personsList.add(person4);

        //System.out.println(personsList);

        boolean wasSwap = true;
        while(wasSwap){
            wasSwap = false;

            for(int j=0; j<table.length-1; j++){
                if(table[j].getAge()>table[j+1].getAge()){
                    Person temp = table[j];
                    table[j] = table[j+1];
                    table[j+1] = temp;
                    wasSwap = true;

                }
            }

        }
        for (int i = 0; i < table.length ; i++) {
            System.out.println("Sortowanie według wieku, wiek: " + table[i].getAge() + ", " + table[i].getSurname());

        }





    }
}
