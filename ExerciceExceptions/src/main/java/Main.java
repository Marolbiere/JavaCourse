import messagerie.Repondeur;
import messagerie.RepondeurEnregistreur;
import messagerie.Switchboard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Nouveau Switchboard
        Switchboard sb = new Switchboard(new ArrayList<>());

        sb.addRepondeur(new Repondeur());               //index 0
        sb.addRepondeur(new Repondeur());               //index 1
        sb.addRepondeur(new Repondeur());               //index 2
        sb.addRepondeur(new RepondeurEnregistreur());   //index 3
        sb.addRepondeur(new Repondeur());               //index 4 (supprimé après)
        sb.addRepondeur(new RepondeurEnregistreur());   //index 5 (index 4 après le remove);

        //On supprime le répondeur à l'index 4
        sb.removeRepondeur(4);

        //On essaye de supprimer à un index invalide (Exception)
        sb.removeRepondeur(25);

        //On compte le nombre de répondeur
        System.out.println("nb Repondeur : " + sb.countRepondeurs());
        //On compte le nombre de répondeurEnregistreur
        System.out.println("nb RepondeurEnregistreur : " + sb.countRepondeursEnregistreur());

        //La capacité maximum de notre liste répondeur est de 10 (cf classe SwitchBoard : MAX_SIZE)
        sb.addRepondeur(new Repondeur());               //index 5
        sb.addRepondeur(new RepondeurEnregistreur());   //index 6
        sb.addRepondeur(new Repondeur());               //index 7
        sb.addRepondeur(new RepondeurEnregistreur());   //index 8
        sb.addRepondeur(new Repondeur());               //index 9

        //Execption Repondeur plein
        sb.addRepondeur(new RepondeurEnregistreur());   //index 10 ?

    }
}
