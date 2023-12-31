import javax.swing.plaf.synth.SynthTextAreaUI;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Song S=new Song("IDGF","DRILL",150.000,160);
        Song C=new Song("UZI","RAP",1.800000,155);

        System.out.println(S.getSongLength());
        S.play_song();
        S.stop_song();
        S.resume_song();
        S.repeat_song();
        Album A = new Album("STARS");
        A.add_song(S);
        A.add_song(C);
        A.get();
        Artist a= new Artist("Rayen");
        a.add_album(A);
        a.get_albums();
    }
}