package joc;


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
