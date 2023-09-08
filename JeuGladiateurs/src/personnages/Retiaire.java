/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/*
*   @author Vincent IVART
 */
import java.util.Random;

public class Retiaire extends Personnage {

    //**************************************************************************
    //  <editor-fold desc="ATTRIBUTS">
    String classe;
    boolean filetEnMain;
    //  </editor-fold>

    //**************************************************************************
    //  <editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS et INITIALISATION">
    public Retiaire(String classe, String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        this.classe = "Retiaire";
        filetEnMain = true;
    }
    //  </editor-fold>

    //**************************************************************************
    //  <editor-fold desc="MÉTHODES">
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        if (filetEnMain == true) {
            Random random = new Random();
            int randomFilet = random.nextInt(10);
            System.out.println("\n" + nom + " lance son filet");
            if (randomFilet == 0) {
                System.out.println("Son filet attrape " + personnageCible.nom + " et il l'empale sauvagement avec sa lance");
                personnageCible.pointsDeVie=0;
            } else {
                System.out.println("Le filet n'atteint pas sa cible");
                filetEnMain = false;
            }
        } else {
            filetEnMain = true;
            super.frapperPersonnage(personnageCible);
        }
    }

    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("\tClasse : " + classe);
    }
    //  </editor-fold>

    //**************************************************************************
    //  <editor-fold defaultstate="collapsed" desc="GETTERS et SETTERS">
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    //  </editor-fold>
}
