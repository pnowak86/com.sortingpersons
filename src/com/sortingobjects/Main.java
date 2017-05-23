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

        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        SelectionSorter ss = new SelectionSorter();

        peoplePrinter.showTable(ss.sort(people));


        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");


        Median m = new Median();
        System.out.println("Median " + m.median(people));

        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        peoplePrinter.showTable(bs.sortPeopleByName(people));

    }
}


//List<Person> personsList = new ArrayList<>();
//personsList.add(person1);
//personsList.add(person2);
//personsList.add(person3);
//personsList.add(person4);

//System.out.println(personsList);











