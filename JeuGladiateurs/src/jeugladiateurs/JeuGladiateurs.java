package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Personnage Bob = new Personnage("Bob le malchanceux", 15, 15, 70, 15);
        Personnage Igor = new Personnage("Igor l'empaleur", 25, 5, 100, 30);
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        Bob.afficherInfosPersonnage();
        Igor.afficherInfosPersonnage();
        affichage.afficherDebutCombat();
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        
        
        // </editor-fold>
    }

}
