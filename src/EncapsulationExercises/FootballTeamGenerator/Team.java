package EncapsulationExercises.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void removePlayer(Player player){
        if (players.contains(player)){
            players.remove(player);
            return;
        }
        System.out.printf("Player %s is not in %s team", player.getName(), name);
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public double getRating(){
        if (players.isEmpty()){
            return 0;
        }
         return players.stream().mapToDouble(Player::overallSkillLevel).sum();
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name , Math.round(getRating()));
    }
}
