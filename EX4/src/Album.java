import java.util.ArrayList;
public class Album {
    private String nom;
    private ArrayList <Song> A = new ArrayList<>();
    public Album(String nom) {
        this.nom=nom;
    }

    public void get() {
        System.out.println("Album Name : " + nom);
        System.out.println("Songs of this Album are : ");
        for ( Song i : A ){

            System.out.println("             "  + i.get_nom() + " " + i.get_theme() + " " +  i.get_vues() + "  " + i.get_length());
        }
    }

    public void add_song(Song s) {
        A.add(s);
    }
    public void remove_song(Song s) {
        A.remove(s);
    }

}
