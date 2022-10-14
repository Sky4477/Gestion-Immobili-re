package Immobilier;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;
public class Maison {

    private int nbe,nbp;
    public int getNbe() {
        return nbe;
    }

    public void setNbe(int nbe) {
        this.nbe = nbe;
    }

    public int getNbp() {
        return nbp;
    }

    public void setNbp(int nbp) {
        this.nbp = nbp;
    }

    private double surf;
    public double getSurf() {
        return surf;
    }

    public void setSurf(double surf) {
        this.surf = surf;
    }

    private boolean avecJ;

    public boolean isAvecJ() {
        return avecJ;
    }

    public void setAvecJ(boolean avecJ) {
        this.avecJ = avecJ;
    }

    public Maison(int nbe, int nbp, double surf, boolean avecJ) {
        this.nbe = nbe;
        this.nbp = nbp;
        this.surf = surf;
        this.avecJ = avecJ;
    }

   public void Afficher(){
    System.out.println("\n");
    System.out.println("         Mainson \n"+ "Nombre de pièce :"+nbp +"\n"+ "Nombre de d'étages : "+nbe +
    "\n"+ "Surface D'un étage : "+surf);
   }

public double Surf_Total(Double S) {
        S=nbp*surf;
return S;
}



/**  Extra  $$  Ajouter un Menue au Code $$ 
 * $$ Un Sous Menue pour office de retour au menu Principale */
 

 public  static void Extra(){


     /** Extra:  Creée une mainson
      * Dooner la main à l'utilisateur pour changer les valeur et */ 


    Scanner sc = new Scanner (System.in);
     System.out.println("\n");
    System.out.println("$**************    Création D'une Maison      ************$ ");
    
    System.out.println("Entre le nombre D'étage ");
    int nbe = sc.nextInt();
    System.out.println("Entre le nombre de piéce  ");
    int nbp = sc.nextInt();
    System.out.println("Entre la Surface de la Piéce ");
    double surf = sc.nextDouble();

    System.out.println("Si la maison posséde un jardin : Y sinon N");
    String j=sc.next();
    boolean  avecJ;
    if(j=="Y"){
        avecJ=true;
    }
    else{
        avecJ=false;
    }

    Maison Extra = new Maison(nbe, nbp, surf, avecJ);
    Extra.Afficher();


    System.out.println("Voulez vous Modifier les Valleur ?? :: 1  ::  0");


    int ch=sc.nextInt();

    switch (ch){
        case 1:
    System.out.println("Entre la nouvelle valeur de::  Piéce :: Surface");
    nbp=sc.nextInt();
    surf=sc.nextDouble();
    Extra.setNbp(nbp);
    Extra.setSurf(surf);

    Extra.Afficher();
    System.out.println("La Surface Total est :"+Extra.Surf_Total(surf));
    case 0:
    System.exit(0);

    }
    

        
 }
}
///////////////////////    
class M_Extra extends JFrame{
    public void Fenetre(){
        JFrame Fenetre = new JFrame();
        Fenetre.setTitle("Gestion Me Immobillière");

        
        Fenetre.setSize(1000,800);
        Fenetre.setLocationRelativeTo(null);
        Fenetre.setVisible(true);
    }
}