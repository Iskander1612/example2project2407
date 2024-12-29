package models;

import java.util.ArrayList;
import java.util.Collections;

public class School {
    private ArrayList<Person> members = new ArrayList<>();


    public void addMember(Person person) {
        members.add(person);
    }

    public void sortMembersBySurname() {
        Collections.sort(members, (man1, man2) -> man1.getSurname().compareToIgnoreCase(man2.getSurname()));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("members:\n");
        for (Person member : members) {
            result.append(member).append("\n");
        }

        return result.toString();
    }

}
