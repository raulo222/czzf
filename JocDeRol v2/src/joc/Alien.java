package joc;

import com.sun.source.doctree.StartElementTree;

public class Alien extends Player {

private String name;
private int PA;
    private int ARMOR;
    private int HP;

    public Alien(String nom, int PA, int armor, int HP) {
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

