package Encapsulation.FirstAndReserveTeam;

import Encapsulation.SortByNameAndAge.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }

    public void addPerson(Person person) {
        if (person.getAge() < 40){
          this.firstTeam.add(person);
          return;
        }
        this.reserveTeam.add(person);
    }

    @Override
    public String toString() {
        return String.format("First team have %d players%n" +
                "Reserve team have %d players" , this.firstTeam.size(), this.reserveTeam.size());
    }
}
