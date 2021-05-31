package joc;

public abstract class  Player {
    private int PA;
    private int armor;
    private int HP;
    private String nom;
    Player(String nom,int PA,int armor,int HP) {
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

    public void attack(Player p)
    {
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
        if (p.getHP()>=0){
            this.hit(this.getPA());
        }
    }
    protected void hit(int PA){
        System.out.println(this.nom + " és colpejat amb " + PA + " i es defen amb " +this.getPD()+" Vides:"+getHP()+"-"+(PA-this.getPD())+"="+(-PA+getPD()+getHP()));
     this.setHP( -PA+getPD()+getHP());


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

