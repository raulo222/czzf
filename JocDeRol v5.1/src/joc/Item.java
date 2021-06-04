package joc;


import java.util.Objects;

public class Item {
    private String nom;
    private int AB;
    private int DB;
public Item(String nom,int AB,int DB){
    setAB(AB);
    setDB(DB);
    setNom(nom);
}

    public String toString() {
        return
                 getNom() +
                " BA " + getAB() +
                " DB " + getDB() ;



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return AB == item.AB && DB == item.DB && Objects.equals(nom, item.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, AB, DB);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAB() {
        return AB;
    }

    public void setAB(int AB) {
        this.AB = AB;
    }

    public int getDB() {
        return DB;
    }

    public void setDB(int DB) {
        this.DB = DB;
    }
}
