package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    Random rand = new Random();
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        valeurMaxAttaque = attaqueMax;
        valeurDefense = defense;
        pointsDeVie = pvs;
        initiative = ini;
    }

    public Personnage() {
        nom = "";
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        pointsDeVie = 0;
        initiative = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public String getNom() {
        return nom;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        String statut = pointsDeVie > 0 ? "Vivant" : "Mort";

        System.out.println("\n" + nom);
        System.out.println("\tAttaque : " + valeurMaxAttaque);
        System.out.println("\tDéfense : " + valeurDefense);
        System.out.println("\tPoints de vie : " + pointsDeVie);
        System.out.println("\tInitiatives : " + initiative);
        System.out.println("\tStatut : " + statut);
    }

    protected int attaqueCalcul() {
        int attaque = rand.nextInt(valeurMaxAttaque - 0 + 1);
        return attaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int attaque;
        int defense;
        int dommage;
        attaque = attaqueCalcul();
        defense = personnageCible.valeurDefense;
        dommage = attaque - defense;
        dommage = dommage < 0 ? 0 : dommage;
        personnageCible.pointsDeVie = personnageCible.pointsDeVie > dommage ? personnageCible.pointsDeVie - dommage : 0;
        System.out.println("\n" + nom + " attaque avec une puissance de : " + attaque);
        System.out.println(personnageCible.nom + " a une défense de : " + defense);
        System.out.println("Les dommages sont donc de  : " + dommage);
    }

    public void setNewInitiativeRandom() {
        initiative = rand.nextInt(101);
    }
    // </editor-fold>
}
