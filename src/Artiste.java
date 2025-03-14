public class Artiste {

    private int id;
    private String nomPrenomArtiste;

    private String siecle_article;

    public Artiste(int id, String nomPrenomArtiste, String siecle_article) {
        this.id = id;
        this.nomPrenomArtiste = nomPrenomArtiste;
        this.siecle_article = siecle_article;
    }

    public int getId() {
        return id;
    }

    public String getNomPrenomArtiste() {
        return nomPrenomArtiste;
    }

    public String getSiecle_article() {
        return siecle_article;
    }
}
