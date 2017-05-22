package com.sortingobjects;

public class Main {

    public static void main(String[] args) {


        PeopleGenerator peopleGenerator = new PeopleGenerator();
        PeoplePrinter peoplePrinter = new PeoplePrinter();


        Person[] people = peopleGenerator.createTable();
        peoplePrinter.showTable(people);
        System.out.println("-----------------------------------------");


        BubbleSorter bs = new BubbleSorter();

        peoplePrinter.showTable(bs.sort(people));




    }
}


//List<Person> personsList = new ArrayList<>();
//personsList.add(person1);
//personsList.add(person2);
//personsList.add(person3);
//personsList.add(person4);

//System.out.println(personsList);











