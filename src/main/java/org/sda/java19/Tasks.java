package org.sda.java19;

import org.sda.java19.models.Group;
import org.sda.java19.models.Person;
import org.sda.java19.models.Student;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tasks {
    public void sortByLastName(List<Group> getGroupList) {
        for (Group group : getGroupList) {
            group.setStudentList(group.getStudentList().stream()
                    .sorted(Comparator.comparing(Person::getLastName))
                    .collect(Collectors.toList()));
        }
    }
            public void displayGroupWithMaxStudents (List < Group > groupList){
            groupList.stream()
                            .sorted(Comparator.comparingInt(List::size))
                    .collect(Collectors.toList());

        }

        public void displayUnder25Students(List<Group> groupList) {
            groupList.forEach(group -> {
                group.getStudentList().forEach(student -> {
                    if (getAge(student.getDateOfBirth().getYear()) >25);
                });
            });
        }
        private int getAge(int yearOfBirth) {
            return LocalDate.now().getYear() - yearOfBirth;

        }

}