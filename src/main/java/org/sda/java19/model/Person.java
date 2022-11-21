package org.sda.java19.model;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public void Person(){
    }

    public Person(String name, String lastName, int age) {
        this.lastName = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + lastName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
