package EncapsulationExercises.FootballTeamGenerator;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Team> teamMap = new LinkedHashMap<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(";");
            String operation = tokens[0];
            String teamName = tokens[1];
            switch (operation) {
                case "Team":
                    Team newTeam = new Team(teamName);
                    teamMap.put(teamName, newTeam);
                    break;
                case "Add":
                    if (ifTeamIsMissing(teamMap, teamName, "Team %S does not exist.%n")) continue;

                    Player currentPlayer = new Player
                            (tokens[2], Integer.parseInt(tokens[3]),
                                    Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]),
                                    Integer.parseInt(tokens[6]), Integer.parseInt(tokens[7]));

                    boolean available = currentPlayer.isAvailable();
                    if (available) {
                        teamMap.get(teamName).addPlayer(currentPlayer);
                    }

                    break;
                case "Remove":
                    String nameOfPlayer = tokens[2];
                    List<Player> playerToDelete = teamMap.get(teamName)
                            .getPlayers().stream()
                            .filter(e -> e.getName().equals(nameOfPlayer))
                            .collect(Collectors.toList());
                    if (!playerToDelete.isEmpty()) {
                        teamMap.get(teamName).removePlayer(playerToDelete.get(0));
                    } else {
                        System.out.printf("Player %s is not in Arsenal team.%n", nameOfPlayer);
                    }
                    break;
                case "Rating":
                    if (ifTeamIsMissing(teamMap, teamName, "Team %s does not exist.%n")) continue;

                    System.out.println(teamMap.get(teamName).toString());
                    break;
            }


            input = scanner.nextLine();
        }

    }

    private static boolean ifTeamIsMissing(Map<String, Team> teamMap, String teamName, String s) {
        if (!teamMap.containsKey(teamName)) {
            System.out.printf(s, teamName);
            return true;
        }
        return false;
    }
}
