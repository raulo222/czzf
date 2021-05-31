package joc;

public abstract class  Player {
    private int PA;
    private int armor;
    private int HP;
    private String nom;

    Player(String nom, int PA, int armor, int HP) {
        setHP(HP);
        setPA(PA);
        setArmor(armor);
        setNom(nom);
    }

    @Override
    public String toString() {
        return getNom() +
                "PA:" + getPA() +
                "/PD=" + getPD() +
                "/HP=" + getHP();
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

