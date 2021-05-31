package joc;

import java.util.ArrayList;
import java.util.Objects;

public abstract class  Player {
    private int PA;
    private int armor;
    private int HP;
    private String nom;
    private ArrayList<Team> Players2 = new ArrayList<Team>();

    Player(String nom, int PA, int armor, int HP) {
        setHP(HP);
        setPA(PA);
        setArmor(armor);
        setNom(nom);
    }
    public void add(Team x){
        Players2.add(x);
        x.add(this);
        System.out.println("El jugador " + getNom() + " ha sigut afegit a " + x.getName());
    }
    public void delete(Team x){
        Players2.remove(x);
        x.delete(this);
        System.out.println("El jugador " + getNom() + " ha sigut eliminat de  " + x.getName());
    }


    public boolean equals(Player o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return PA == player.PA && armor == player.armor && HP == player.HP && nom.equals(player.nom) && Objects.equals(Players2, player.Players2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PA, armor, HP, nom, Players2);
    }

    @Override
    public String toString() {
        return getNom() +
                " PA:" + getPA() +
                "/PD=" + getPD() +
                "/HP=" + getHP() +
                " (pertany a " + (Players2.size()-1) +
                " equip) ";

    }

    public void attack(Player p) {
        System.out.println("Atacant: ");
        System.out.println(nom);
        System.out.println("PA:" + getPA() +
                "/PD=" + getPD() +
                "/PV=" + getHP());
        System.out.println("Atacat: ");
        System.out.println(p.nom);
        System.out.println("PA:" + p.getPA() +
                "/PD=" + p.getPD() +
                "/PV=" + p.getHP());
        p.hit(this.getPA());
        if (this.getHP() < 0) {
            this.hit(p.getPA());
        }
    }

    protected void hit(int PA) {
        if ((-PA + getPD() > 0)) {
            System.out.println(this.nom + " és colpejat amb " + PA + " i es defen amb " + this.getPD() + " per tant ho ha bloquejat");
        } else {
            System.out.println(this.nom + " és colpejat amb " + PA + " i es defen amb " + this.getPD() + " Vides:" + getHP() + "-" + (PA - this.getPD()) + "=" + (-PA + getPD() + getHP()));
            this.setHP(-PA + getPD() + getHP());
            if (this.getHP() <= 0) {
                System.out.println(this.getNom()+" ha mort");

            }

    }

}


    public int getPA() {
        return PA;
    }

    public void setPA(int PA) {
        this.PA = PA;
    }

    public int getPD() {
        return getArmor();
    }

    public void setPD(int PD) {
        this.setArmor(PD);
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }


    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

