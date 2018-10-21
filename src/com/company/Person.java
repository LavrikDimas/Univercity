package com.company;

public class Person{

    private static long maxId;
    private String name;
    private String surname;

    public long getId(){
        return maxId;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Person(String name, String surname){
        maxId++;

        this.name = name;
        this.surname = surname;
    }

}
