/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/*
*   @author Vincent IVART
 */
public class Mirmillon extends Personnage {

    //**************************************************************************
    //  <editor-fold desc="ATTRIBUTS">
    String classe;
    //  </editor-fold>

    //**************************************************************************
    //  <editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS et INITIALISATION">
    public Mirmillon(String classe, String nom, int attaqueMax, int defense, int pvs, int ini){
        super(nom,attaqueMax,defense,pvs,ini);
        this.classe = "Mirmillon"; 
    }
    //  </editor-fold>
    //**************************************************************************
    //  <editor-fold desc="MÉTHODES">
    @Override
    public void setNewInitiativeRandom() {
        initiative = 30;
        initiative = rand.nextInt(initiative + 1);
    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);
        if (personnageCible.pointsDeVie == 0) {
            System.out.println("\n" + nom + " décapite " + personnageCible.nom + " !!!");
        } else {
            System.out.println("\n" + nom + " frappe de nouveau.");
            super.frapperPersonnage(personnageCible);
        }
    }
    
    @Override
    public void afficherInfosPersonnage(){
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
