package org.sda.java19.models;

import java.time.LocalDate;
import java.util.List;

public class Data {


    public static List<Student> getStudentList() {
        Student student1 = new Student();
        student1.setFirstName("Elmar");
        student1.setLastName("Konn");
        student1.setDateOfBirth (LocalDate.of(1999,11,01));
        student1.setHasPreviousJavaKnowledge(true);

        Student student2 = new Student();
        student2.setFirstName("Vello");
        student2.setLastName("Jänes");
        student2.setDateOfBirth(LocalDate.of(1989,11,11));
        student2.setHasPreviousJavaKnowledge(true);

        Student student3 = new Student();
        student3.setFirstName("Martin");
        student3.setLastName("Kass");
        student3.setDateOfBirth(LocalDate.of(1978,01,01));
        student3.setHasPreviousJavaKnowledge(false);

        Student student4 = new Student();
        student4.setFirstName("Peeter");
        student4.setLastName("Koer");
        student4.setDateOfBirth(LocalDate.of(1990,02,02));
        student4.setHasPreviousJavaKnowledge(true);

        Student student5 = new Student();
        student5.setFirstName("Ilmar");
        student5.setLastName("Tuvi");
        student5.setDateOfBirth(LocalDate.of(1992,03,03));
        student5.setHasPreviousJavaKnowledge(false);

        Student student6 = new Student();
        student6.setFirstName("Jimmy");
        student6.setLastName("Cooler");
        student6.setDateOfBirth(LocalDate.of(1999,03,01));
        student6.setHasPreviousJavaKnowledge(true);

        Student student7 = new Student();
        student7.setFirstName("Johan");
        student7.setLastName("Cold");
        student7.setDateOfBirth(LocalDate.of(1988,07,02));
        student7.setHasPreviousJavaKnowledge(false);

        Student student8 = new Student();
        student8.setFirstName("Maria");
        student8.setLastName("Smith");
        student8.setDateOfBirth(LocalDate.of(1987,02,8);
        student8.setHasPreviousJavaKnowledge(false);

        Student student9 = new Student();
        student9.setFirstName("Jill");
        student9.setLastName("Masters");
        student9.setDateOfBirth(LocalDate.of(1977,3,23));
        student9.setHasPreviousJavaKnowledge(true);

        Student student10 = new Student();
        student10.setFirstName("Stan");
        student10.setLastName("Lee");
        student10.setDateOfBirth(LocalDate.of(1986,3,4));
        student10.setHasPreviousJavaKnowledge(true);

        Student student11 = new Student();
        student11.setFirstName("Tarmo");
        student11.setLastName("Tamm");
        student11.setDateOfBirth(LocalDate.of(1984,3,7));
        student11.setHasPreviousJavaKnowledge(true);

        Student student12 = new Student();
        student12.setFirstName("Pille");
        student12.setLastName("Pärn");
        student12.setDateOfBirth(LocalDate.of(1977,5,5));
        student12.setHasPreviousJavaKnowledge(false);

        Student student13 = new Student();
        student13.setFirstName("Inga");
        student13.setLastName("Saare");
        student13.setDateOfBirth(LocalDate.of(1969,7,9));
        student13.setHasPreviousJavaKnowledge(true);

        Student student14 = new Student();
        student14.setFirstName("Viktor");
        student14.setLastName("Vikat");
        student14.setDateOfBirth(LocalDate.of(2000,4,9));
        student14.setHasPreviousJavaKnowledge(true);

        Student student15 = new Student();
        student15.setFirstName("Elmar");
        student15.setLastName("Sepp");
        student15.setDateOfBirth(LocalDate.of(2004,5,5));
        student15.setHasPreviousJavaKnowledge(false);

        return List.of(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13, student14, student15);
    }


    public static List<Trainer> getTrainerList() {
        Trainer trainer1 = new Trainer();
        trainer1.setFirstName("Kalle");
        trainer1.setLastName("Vedur");
        trainer1.setDateOfBirth(LocalDate.of(1995,8,12));
        trainer1.setAuthorized(true);

        Trainer trainer2 = new Trainer();
        trainer2.setFirstName("Meeli");
        trainer2.setLastName("Tekk");
        trainer2.setDateOfBirth(LocalDate.of(1976,4,7));
        trainer2.setAuthorized(false);

        Trainer trainer3 = new Trainer();
        trainer3.setFirstName("Mihkel");
        trainer3.setLastName("Ratas");
        trainer3.setDateOfBirth(LocalDate.of(1989,14,11));
        trainer3.setAuthorized(true);

return List.of(trainer1,trainer2,trainer3);
    }


    public static List<Group> getGroupList() {
        Group group1 = new Group();

        group1.setName("Java19");
        group1.setTrainer(Trainer.concat(Trainer.getFirstName()));
        group1.setStudentList(getStudentList());

        Group group2 = new Group();

        group2.setName("Java20");
        group2.setTrainer(Trainer.getFirstName().concat(TRAINER.getFirstName()));
        group2.setStudentList(getStudentList());


        Group group3 = new Group();

        group3.setName("Java21");
        group3.setTrainer(Trainer.getFirstName().concat(TRAINER.getFirstName()));
        group3.setStudentList(getStudentList());

        Group group4 = new Group();

        group4.setName("Java22");
        group4.setTrainer(TRAINER.getFirstName().concat(TRAINER.getFirstName()));
        group4.setStudentList(getStudentList());

        return List.of(group1,group2,group3,group4);
    }

}