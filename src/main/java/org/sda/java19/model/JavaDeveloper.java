package org.sda.java19.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class JavaDeveloper extends Developer{

    private int salary;

    public void setName(String firstName, String lastName){

    }


    public JavaDeveloper(String name, String lastName, int age, boolean hasExperience, int salary) {
        super(name, lastName, age, hasExperience);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "salary=" + salary +
                '}';
    }

}
