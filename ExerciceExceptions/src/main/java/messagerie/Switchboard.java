package messagerie;

import exception.RepondeurFull;

import java.util.ArrayList;

public class Switchboard {
    static private final int MAX_SIZE = 10;
    private final ArrayList<Repondeur> tabRepondeur;

    public Switchboard(ArrayList<Repondeur> tabRepondeur) {
        this.tabRepondeur = tabRepondeur;
    }

    public void getFull() throws RepondeurFull {
        if (tabRepondeur.size() == MAX_SIZE)
            throw new RepondeurFull("Repondeur full : max Capacity is " + MAX_SIZE );
    }

    public void addRepondeur(Repondeur rep) {
        try {
            getFull();
            tabRepondeur.add(rep);
        } catch (RepondeurFull e) {
            System.out.println(e.getMessage());
        }

    }

    public void removeRepondeur(int index) {
        try {
            tabRepondeur.remove(index);
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    //On prend en compte que RepondeurEnregistreur est aussi un Repondeur donc il compte toute la liste
    public int countRepondeurs() {
        return tabRepondeur.size();
    }

    public int countRepondeursEnregistreur() {
        int j = 0;
        for( Repondeur rep : tabRepondeur) {
            if (rep.getClass() == RepondeurEnregistreur.class) j++;
        }
        return j;

    }
}
