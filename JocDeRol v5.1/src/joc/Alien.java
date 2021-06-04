package joc;

public class Alien extends Player {

    private String name;
    private int PA;
    private int ARMOR;
    private int HP;

    public Alien(String nom, int PA, int armor, int HP) {
        super(nom, PA, armor, HP);
        setHP(HP);
    }

    public void attack(Player p) {
        if (getHP() > 20) {
            setPD(getPD() - 3);
            setPA(getPA() + 3);
        }
        System.out.println("Atacant: ");
        System.out.println(getNom());
        System.out.println("PA:" + getPA() +
                "/PD=" + getPD() +
                "/PV=" + getHP());
        System.out.println("Atacat: ");
        System.out.println(p.getNom());
        System.out.println("PA:" + p.getPA() +
                "/PD=" + p.getPD() +
                "/PV=" + p.getHP());
        p.hit(this.getPA());
        if (p.getHP() >= 0) {
            this.hit(p.getPA());
        }
    }


    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }
}

