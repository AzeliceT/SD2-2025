//import java.io.File;
//import java.nio.file.Files;
//import java.util.*;
//
//public class Graph {
//
//    private final Map<Artiste, Set<Mention>> mapArtisteMentions;
//    private final Map<String, Artiste> mapNomArtiste;
//
//
//    public Graph(File lignes, File mentions) throws Exception {
//
//        mapArtisteMentions = new HashMap<>();
//        mapNomArtiste = new HashMap<>();
//
//        List<String> allLines = Files.readAllLines(lignes.toPath());
//       // ce iter c'est pour mention
//        for (String line : allLines) {
//            String[] attributes = line.split(",");
//            //TODO
//            int cout = Integer.parseInt(attributes[2]);
//
//           // Mention mention = new Mention(pageIdDepart, pageIdArrivee, cout);
//
//         //   if ( mapArtisteMentions.containsKey(pageIdDepart)){
//         //       mapArtisteMentions.get(pageIdDepart).add(mention);
//         //   } else {
//                HashSet<Mention> mentionHashSet = new HashSet<>();
//          //      mentionHashSet.add(mention);
//          //      mapArtisteMentions.put(pageIdDepart, mentionHashSet);
//            }
//        }
//
//    }
//
//    public Artiste getArtiste(int id, String nomPrenomArtiste, String categorie){
//        Artiste artiste;
//
// //       if(!mapArtisteMentions.containsKey(id)){
//            artiste = new Artiste(id, nomPrenomArtiste, categorie);
//        } else {
//            artiste = mapNomArtiste.get(id);
//        }
//        return artiste;
//    }
//    public void trouverCheminLePlusCourt(String pageArtisteDepart, String pageArtisteArrive){
//
//    }
//
//    public void trouverCheminMaxMentions(String pageArtisteDepart, String pageArtisteArrive){
//
//    }
//}
