package org.sda.java19;

import org.sda.java19.models.*;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * SDA Scheduler
 *
 * Create a class hierarchy:
 * Person.java - firstname
 *             - lastname
 *             - dateOfBirth
 * Trainer.java (extends Person) - isAuthorized (boolean)
 * Student.java (extends Person) - hasPreviousJavaKnowledge (boolean)
 *
 *
 * Create a Group class which has
 *
 * name (Java19Remote, Java20Remote, etc)
 * one trainer
 * a list of students
 *
 *
 *
 * Manually initialize 15 students; 4 groups and 3 trainers;
 * Store all students in a list; all groups in a list; all trainers in a list;
 *
 * Assign a trainer to each group
 * Assign 2-3 students to each group
 * Ensure the fact that a group will only have distinct students (How would you do that?)
 * Ensure the fact that a group will only have a maximum of 5 students; When you try to add a 6th one throw an MaximumNumberOfStudentsReached exception
 *Printing-->
 *  Display all students in a group sorted alphabetically by lastName
 * Display the group with the maximum number of students
 * Display all students younger than 25, from all groups
 * Display all students grouped by trainer that teaches to them (eg. Trainer1 - stud1, stud3, stud4; Trainer2 - stud2, stud 10) - regardless of the group they're part of (If you were to store this information in a data structure what would you use?)
 * Display all students with previous java knowledge
 * Display the group with the highest number of students with no previous java knowledge
 * Remove all the students younger than 20 from all groups
 *
 * @author Joosep Korela
 */
public class Main {
    private static final int MAXIMUM_ALLOWED_STUDENTS = 5;

    public static void main(String[] args) throws MaximumNumberOfStudentsReachedException {
        List<Student> getStudentList = Data.getStudentList();
        List<Trainer> getTrainerList = Data.getTrainerList();
        List<Group> getGroupList = Data.getGroupList();

assignTrainerToGroup(getGroupList, getTrainerList);
assignStudentsToGroup(getGroupList, getStudentList);


        Tasks tasks = new Tasks();
                tasks.sortByLastName();
        }





    private static void assignStudentsToGroup(List<Group> getGroupList, List<Student> getStudentList) throws MaximumNumberOfStudentsReachedException {
        LinkedList<Student> studentLinkedList = new LinkedList<>(getStudentList);
        for (Group group : getGroupList) {
            List<Student> students = new ArrayList<>();

            for (int i = 0; i <= 4; i++) {
                if (group.getStudentList().size() >= MAXIMUM_ALLOWED_STUDENTS) {
                    throw new MaximumNumberOfStudentsReachedException(group.getName());

                }
                if (!studentLinkedList.isEmpty()) {
                    Random random = new Random();
                    int nextStudentIndex = random.nextInt(studentLinkedList.size());
                    students.add((getStudentList.get(nextStudentIndex)));
                    studentLinkedList.remove(nextStudentIndex);

                }
                group.setStudentList(students);
            }
        }
    }
    private static void assignTrainerToGroup (List < Group > getGroupList, List < Trainer > getTrainerList){
        for (Group group : getGroupList) {
            Random random = new Random();
            int nextTrainerIndex = random.nextInt(getTrainerList.size());
            group.setTrainer(getTrainerList.get(nextTrainerIndex));
        }
    }
}