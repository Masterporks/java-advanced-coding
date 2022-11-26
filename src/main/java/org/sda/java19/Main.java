package org.sda.java19;

import org.sda.java19.models.Person;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *3. Personal information
 * a. Create a file containing any personal data (name, surname, phone number). Data of individual persons should be in the following lines.
 * b. Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
 * c. Enter the created objects into ArrayList or Map (<line number>: <Person>).
 * d. Present the obtained data.
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {

        // Access txt file

        Path personalInformation = Paths.get("C:\\Users\\Kasutaja\\IdeaProjects\\java-advanced-coding\\src\\main\\Personal_information.txt");

        //File reading

        List<String> fileLines = Files.readAllLines(personalInformation, StandardCharsets.UTF_8);
        List<Person> personList = new ArrayList<>();
        List<Person> personList1 = new ArrayList<>();
        List<Person> personList2 = new ArrayList<>();
        List<Person> personList3 = new ArrayList<>();


        for (String fileLine : fileLines) {
            String[] person = fileLine.split(", ");


            switch (person[0]) {
                case "Jaak" -> {
                    Person person1 = new Person();
                    person1.setFirstName(person[0]);
                    person1.setLastName(person[1]);
                    person1.setEmail(person[2]);
                    person1.setPhoneNumber(person[3]);
                    personList.add(person1);
                }
                case "Kalle" -> {
                    Person person2 = new Person();
                    person2.setFirstName(person[0]);
                    person2.setLastName(person[1]);
                    person2.setEmail(person[2]);
                    person2.setPhoneNumber(person[3]);
                    personList1.add(person2);
                }
                case "Mihkel" -> {
                    Person person3 = new Person();
                    person3.setFirstName(person[0]);
                    person3.setLastName(person[1]);
                    person3.setEmail(person[2]);
                    person3.setPhoneNumber(person[3]);
                    personList2.add(person3);
                }
                case "Tanel" -> {
                    Person person4 = new Person();
                    person4.setFirstName(person[0]);
                    person4.setLastName(person[1]);
                    person4.setEmail(person[2]);
                    person4.setPhoneNumber(person[3]);
                    personList3.add(person4);
                }
                default -> System.out.println("Invalid person!");
            }
        }


        personList.stream().toList().forEach(person -> System.out.println(personList));
        System.out.println("Detailed information about person1:" + personList);
        System.out.println(personList1);
        System.out.println(personList2);
        System.out.println(personList3);


    }


    private static List<String> convertObjectListToStringList(List<Object> objectList) {
        return objectList.stream()
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}