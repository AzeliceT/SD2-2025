public class Mention {

    private int pageIdDepart, pageIdArrivee, cout;

    public Mention(int pageID, int idMention, int nombreMention) {
        this.pageIdDepart = pageID;
        this.pageIdArrivee = idMention;
        this.cout = nombreMention;
    }

    public int getPageIdDepart() {
        return pageIdDepart;
    }

    public int getPageIdArrivee() {
        return pageIdArrivee;
    }

    public int getCout() {
        return cout;
    }
}
