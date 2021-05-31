package joc;

public class Human extends Player {
    private int PA;
    private int ARMOR;
    private int HP;

    public Human(String nom, int PA, int armor, int HP) {
        super(nom, PA, armor, HP);
        if (HP > 100) {
            System.out.println("No pots donar tanta vida a un huma se li aplicara el maxim que es 100");
            setHP(100);
        } else {
            setHP(HP);
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

