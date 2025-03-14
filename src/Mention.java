public class Mention {

    private int idArtiste, idMention, nombreMention;

    public Mention(int idArtiste, int idMention, int nombreMention) {
        this.idArtiste = idArtiste;
        this.idMention = idMention;
        this.nombreMention = nombreMention;
    }

    public int getIdArtiste() {
        return idArtiste;
    }

    public int getIdMention() {
        return idMention;
    }

    public int getNombreMention() {
        return nombreMention;
    }
}
