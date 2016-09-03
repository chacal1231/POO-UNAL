package team;

import java.util.ArrayList;

public class Team {

    private String name;
    public ArrayList<Player> players;
    private int maxSize;
    private Player player;
    
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player) {
        if(players.size()<=15){
            this.players.add(player);
        } else {
            System.out.println("No se puede inscribir por exceder el cupo de jugadores.");
        }
    }
    
    public void printPlayers(){
        
        for (Player temp : players){
            System.out.println(temp);
        }
    }
    
    public void setMaxSize(int maxSize){
        if (maxSize<=16){
            this.maxSize = maxSize;
        } else {
            this.maxSize=16;
        }
    }
        
    public int size(){
        return this.maxSize;
    }
    
    public int goals(){
        int suma=0;
        for (Player goals: players){
            suma += goals.goals();
        }
        return suma;
    }
}
