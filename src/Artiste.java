public class Artiste {

    private int id;
    private String nomPrenomArtiste;

    private String categorie;

    //+1 un attribut à mettre plus tard, mais lequel ?

    public Artiste(int id, String nomPrenomArtiste, String siecle_article) {
        this.id = id;
        this.nomPrenomArtiste = nomPrenomArtiste;
        this.categorie = siecle_article;
    }

    public int getId() {
        return id;
    }

    public String getNomPrenomArtiste() {
        return nomPrenomArtiste;
    }

    public String getSiecle_article() {
        return categorie;
    }
}
