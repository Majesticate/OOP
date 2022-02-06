package AbstractionExercises.TrafficLights;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public enum Lights {
    RED,
    GREEN,
    YELLOW;

    public static Lights fromStringToLight(String light){
        return Lights.valueOf(light);
    }

    public Lights nextLight(Lights currentLight){
        switch (currentLight) {
            case RED:
                return GREEN;
            case GREEN:
                return YELLOW;
            case YELLOW:
                return RED;
            default:
                throw new IllegalArgumentException("invalid input");
        }
    }

    @Override
    public String toString() {
        return this.name();
    }

    public static LinkedList<Lights> allStingToLights(LinkedList<String> input) {
        return input.stream()
                .map(Lights::fromStringToLight)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public static LinkedList<Lights> convertToNextLight(LinkedList<Lights> fromStringToLights) {
        return fromStringToLights.stream()
                .map(e -> e = e.nextLight(e))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public static LinkedList<String> convertFromLightToString(LinkedList<Lights> listAsLights){
        return listAsLights.stream().map(String::valueOf).collect(Collectors.toCollection(LinkedList::new));

    }
}
