package org.sda.java19.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Developer extends Person{
    private boolean hasExperience;

    public Developer(String name, String lastName, int age, boolean hasExperience) {
        super(name, lastName, age);
        this.hasExperience = hasExperience;
    }

    public boolean isWorking(){
        return true;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "hasExperience=" + hasExperience +
                '}';
    }

    public void setHasExperience(boolean hasExperience) {
        this.hasExperience = hasExperience;
    }
}
