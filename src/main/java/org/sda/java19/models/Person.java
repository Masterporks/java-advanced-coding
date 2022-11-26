package org.sda.java19.models;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
