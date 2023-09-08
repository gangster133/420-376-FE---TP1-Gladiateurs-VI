package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        System.out.println("\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n");
    }

    public void afficherSeparateurDeTour() {
        System.out.println("\n**************************************");
    }

    public void afficherSeparateurInfosPerso() {
        System.out.println("\n-----------------");
        System.out.println("INFOS PERSONNAGES");
        System.out.println("-----------------");
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        String gagnant = personnage1.getPointsDeVie() > 0 ? personnage1.getNom() : personnage2.getNom();
        System.out.println("\n" + gagnant + " gagne le combat !!!\n");
    }
    // </editor-fold>
}
