package fr.wcs.musicband;

public class Singleton {
    private static final Singleton ourInstance = new Singleton();
    private GroupeModel groupe;


    private Singleton() {

    }

    public static Singleton getInstance() {
        return ourInstance;
    }

    public GroupeModel getGroupe() {
        return groupe;
    }

    public void setGroupe(GroupeModel groupe) {
        this.groupe = groupe;
    }

}
