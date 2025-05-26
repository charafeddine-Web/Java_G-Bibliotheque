import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n1. Ajouter un livre");
            System.out.println("2. Afficher les livres");
            System.out.println("3. Rechercher par titre");
            System.out.println("4. Supprimer un livre");
            System.out.println("0. Quitter");
            System.out.print("Ton choix: ");
            choix = scanner.nextInt();
            scanner.nextLine(); // pour vider la ligne

            switch (choix) {
                case 1:
                    System.out.print("Titre: ");
                    String titre = scanner.nextLine();
                    System.out.print("Auteur: ");
                    String auteur = scanner.nextLine();
                    System.out.print("Année: ");
                    int annee = scanner.nextInt();
                    biblio.ajouterLivre(new Livre(titre, auteur, annee));
                    break;

                case 2:
                    biblio.afficherLivres();
                    break;

                case 3:
                    System.out.print("Titre à chercher: ");
                    String recherche = scanner.nextLine();
                    biblio.rechercherParTitre(recherche);
                    break;

                case 4:
                    System.out.print("Titre à supprimer: ");
                    String sup = scanner.nextLine();
                    biblio.supprimerLivre(sup);
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 0);
    }
}
