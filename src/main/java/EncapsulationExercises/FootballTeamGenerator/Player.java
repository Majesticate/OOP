package EncapsulationExercises.FootballTeamGenerator;

import java.util.ArrayList;

import java.util.List;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            System.out.println("A name should not be empty.");
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {
        if (endurance < 0 || endurance > 100) {
            System.out.println("Endurance should be between 0 and 100.");
            return;
        }
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        if (sprint < 0 || sprint > 100) {
            System.out.println("Sprint should be between 0 and 100.");
            return;
        }
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        if (dribble < 0 || dribble > 100) {
            System.out.println("Dribble should be between 0 and 100.");
            return;
        }
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        if (passing < 0 || passing > 100) {
            System.out.println("Passing should be between 0 and 100.");
            return;
        }
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        if (shooting < 0 || shooting > 100) {
            System.out.println("Shooting should be between 0 and 100.");
            return;
        }
        this.shooting = shooting;
    }

    public double overallSkillLevel() {
        double average = new ArrayList<>(List.of(endurance, sprint, dribble, passing, shooting))
                .stream().mapToInt(e -> e)
                .average().getAsDouble();

        return average;
    }

    public boolean isAvailable() {
        if ((endurance < 100 && endurance > 0) && (sprint < 100 && sprint > 0) && (dribble < 100 && dribble > 0)
                && (passing < 100 && passing > 0) && (shooting < 100 && shooting > 0)) {
            return true;
        }
        return false;
    }
}
