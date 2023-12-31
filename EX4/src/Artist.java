import java.util.ArrayList;
public class Artist {
    private String name ;
    private ArrayList < Album > L = new ArrayList<>();
    public Artist (String nom) {
        name=nom;
    }
    public void add_album(Album a) {
        L.add(a);

    }
    public void remove_album(Album a) {
        L.remove(a);
    }

    public void get_albums() {
        System.out.println("Artist " + name + " has albums : ");
        for (Album a : L) {
            a.get();
        }
    }

}
