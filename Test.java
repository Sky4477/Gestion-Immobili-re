package Immobilier;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        double s=123;
        Maison m1 = new Maison(2, 2 , s, false);
        Maison m2 = new Maison(3, 4 , s, true);
        Maison m3 = new Maison(6, 8 , s, false);
        double S_t=m1.Surf_Total(s)
        +m2.Surf_Total(s)+m3.Surf_Total(s);
        System.out.println("  La surface total des pièce d'un étage est: "+S_t);

        if (m1.isAvecJ()==false) {
            System.out.println("  La maison ne possède pas de Jardin");
        }
        else{
            System.out.println("  La maison Possède a Jardin");
        }

        Scanner sc= new Scanner(System.in);
    int Extra =sc.nextInt();
    if (Extra==11) {
        Maison.Extra();
    }
    else{
        System.exit(0);
    }
   
    }
    }

    



   



