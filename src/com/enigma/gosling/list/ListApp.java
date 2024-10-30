package com.enigma.gosling.list;

import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        /** 04 */
        PersonCRUD crud = new PersonCRUD();
        crud.createPerson(new Person("Rafi",25));
        System.out.println(crud.getPeople());
        crud.createPerson(new Person("Manda",23));
        System.out.println(crud.getPeople());

        crud.updatePerson(1,new Person("Rahma",20));
        System.out.println(crud.getPeople());

        List<Person> rahma = crud.findPersonByName("Rahma");
        System.out.println(rahma);
        System.out.println(crud.findPersonByName("rafi"));

        crud.deleteByIndex(1);
        System.out.println(crud.getPeople());
    }
}
