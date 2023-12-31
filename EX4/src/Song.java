public class Song {
    private String nom;
    private double vues;
    private String theme;

    private float length;
    public Song(String nom,String theme,double vues,float length) {
        this.nom=nom;
        this.theme=theme;
        this.vues=vues;
        this.length=length;
    }
    public void play_song() {
        System.out.println(nom + " is playing right now ");
    }
    public void stop_song() {
        System.out.println(nom + " is stopped X right now ");

    }
    public void resume_song() {
        System.out.println(nom + " is resumed  ");
    }
     public void repeat_song() {
         System.out.println("the song " + nom + " is repeated from the beginning  ");

     }
     public float get_length() {
        return  length;
     }
     public String get_nom() {
        return nom;
     }
    public String getSongLength() {
        return ("the song " + nom + " lasts about " +  length + " seconds ");

     }
     public double get_vues() {
        return vues;
     }
     public String get_theme() {
        return theme;
     }





}