package joc;

import java.util.ArrayList;
import java.util.Objects;

public class Team {
    private String name;
    private ArrayList<Player> Players = new ArrayList<Player>();


    public Team(String name){
        setName(name);
    }
    public void add(Player x){
        System.out.println("El jugador " + x + "ha sigut afegit a " + name);
        Players.add(x);
    }
    public void delete(Player x){
        System.out.println("El jugador " + x + "ha sigut eliminat de  " +name);
        Players.remove(x);
    }
    public ArrayList<Player> getMembers(){
        return Players;
    }

    public void tString() {
        System.out.println("//////////////PRESENTACIÓ "+name+"///////////////////////");
        int i = -1;
        if (Players.size()!=0){

        while (i != Players.size()) {
            i = i + 1;
            System.out.println("Jugador num "
                    + (i + 1) + "  " + Players.get(i));
            if (i + 1 == Players.size()) {
                break;
            }
        }

        }
        else System.out.println("El grup esta vuit");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return name.equals(team.name) && Players.equals(team.Players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Players);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
