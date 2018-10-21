package com.company;

public class Person{

    private static long maxId = 1;
    private long id;
    private String name;
    private String surname;

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Person(String name, String surname){
        id = maxId++;

        this.name = name;
        this.surname = surname;
    }

}
