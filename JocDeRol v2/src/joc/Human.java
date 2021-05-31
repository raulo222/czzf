package joc;

public class Human extends Player{
    private int PA;
    private int ARMOR;
    private int HP;
    public Human(String nom, int PA, int armor, int HP) {
        super(nom, PA, armor, HP);
        setHP(HP);
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

