package org.sda.java19.models;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class Group {
    private String name;
    private Trainer trainer;
    private List<Student> studentList;

}
