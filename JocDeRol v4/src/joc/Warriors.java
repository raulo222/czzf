package joc;

public class Warriors extends Human {

    public Warriors(String nom, int PA, int armor, int HP) {
        super(nom, PA, armor, HP);
    }

    protected void hit(int PA) {
        this.setHP(-PA + getPD() + getHP());
        if ((PA - getPD()) > 5) {
            System.out.println(this.getNom() + " és colpejat amb " + PA + " i es defen amb " + this.getPD() + " Vides:" + getHP() + "-" + (PA - this.getPD()) + "=" + (-PA + getPD() + getHP()));
            setHP((-PA + getPD() + getHP()));
            if (this.getHP() <= 0) {
                System.out.println(this.getNom() + " ha mort");
            }
        }
        if ((+PA - getPD()) < 5) {
            System.out.println(this.getNom() + " és colpejat amb " + PA + " i es defen amb " + this.getPD() + " Vides:" + getHP() + "-" + (PA - this.getPD()) + "=" + (-PA + getPD() + getHP()));
            System.out.println("El atac a sigut esquivat");
            if (this.getHP() <= 0) {
                System.out.println(this.getNom() + " ha mort");
            }
        }

    }
}

