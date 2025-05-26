public class Bibliotheque {
}










//import java.util.ArrayList;
//
//public class Bibliotheque {
//    private ArrayList<Livre> livres = new ArrayList<>();
//
//    public void ajouterLivre(Livre livre) {
//        livres.add(livre);
//    }
//
//    public void afficherLivres() {
//        if (livres.isEmpty()) {
//            System.out.println("Aucun livre trouvé.");
//        } else {
//            for (Livre l : livres) {
//                System.out.println(l);
//            }
//        }
//    }
//
//    public void rechercherParTitre(String titre) {
//        boolean trouve = false;
//        for (Livre l : livres) {
//            if (l.getTitre().equalsIgnoreCase(titre)) {
//                System.out.println("Livre trouvé: " + l);
//                trouve = true;
//                break;
//            }
//        }
//        if (!trouve) {
//            System.out.println("Livre non trouvé.");
//        }
//    }
//
//    public void supprimerLivre(String titre) {
//        livres.removeIf(l -> l.getTitre().equalsIgnoreCase(titre));
//        System.out.println("Livre supprimé (si trouvé).");
//    }
//}
