package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        Group group = new Group();
        Professor professor = new Professor("Andrey", "Prutchenko");

        Student student1 = new Student("Dima", "Lavrinenko");
        student1.setMark(7);
        group.addStudent(student1);
        Student student2 = new Student("Ruslan", "Kudrathenko");
        student2.setMark(8);
        group.addStudent(student2);
        Student student3 = new Student("Yura", "Tkathenko");
        student3.setMark(5);
        group.addStudent(student3);

        System.out.println(professor);
        group.headmand();

        System.out.println();

        group.addAsPresent(student1);
        group.addAsPresent(student2);

        System.out.println("All student in group");
        for(Student student : group.getAllStudentInGroup()){
            System.out.println(student);
        }

        System.out.println();

        professor.rollCallPresentStudent(group.getAllPresentStudent());

        System.out.println();

        professor.getAllAbsentStudent(group.getAllAbsentStudent());

        System.out.println();


    }
}
