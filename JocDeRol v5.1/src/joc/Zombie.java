package joc;

public class Zombie extends Human{
    //Aquest es un personatje que me inventat jo ,
    // consisteix en un huma que cada vegada que ataca perd 1 de defensa (perque es va despedaçant) i amés quan es atacat i es a 0 hp sempre contratacaria 1 volta
    public Zombie(String nom, int PA, int armor, int HP) {
        super(nom, PA, armor, HP);
    }
    public void attack(Player p) {
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
        setPD(getPD()-1);//Variacio estadistica de classe
        System.out.println("La defensa de "+getNom()+" ha disminuit");
        if ((this.getHP() < 0)) {
            this.hit(p.getPA());
        }
    }

    protected void hit(int PA) {
        if ((-PA + getPD() > 0)) {
            System.out.println(this.getNom() + " és colpejat amb " + PA + " i es defen amb " + this.getPD() + " per tant ho ha bloquejat");
        } else {
            System.out.println(this.getNom() + " és colpejat amb " + PA + " i es defen amb " + this.getPD() + " Vides:" + getHP() + "-" + (PA - this.getPD()) + "=" + (-PA + getPD() + getHP()));
            this.setHP(-PA + getPD() + getHP());
            if (this.getHP() <= 0) {
                System.out.println(this.getNom()+" ha mort");

            }
}}}