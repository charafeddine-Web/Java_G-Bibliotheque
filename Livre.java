class Livre {

    private String titre;
    private String auteur;
    private int annee;

    public  Livre(String titre,String auteur,int annee){
        this.titre=titre;
        this.auteur=auteur;
        this.annee=annee;
    }
    public String toString(){
        return  titre + " - " + auteur + " (" + annee + ")";
    }
    public  String getTitre(){
        return this.titre;
    }
    public  String getAuteur(){
        return this.auteur;
    }
    public int getAnnee(){
        return this.annee;
    }
    public  String setTitre(String titre){
        return this.titre=titre;
    }
    public String setAuteur(String auteur){
        return this.auteur=auteur;
    }
    public int setAnnee(int annee){
        return this.annee=annee;
    }
}



//public class Livre {
//    private String titre;
//    private String auteur;
//    private int annee;
//
//    public Livre(String titre, String auteur, int annee) {
//        this.titre = titre;
//        this.auteur = auteur;
//        this.annee = annee;
//    }
//
//    public String getTitre() {
//        return titre;
//    }
//
//    public String getAuteur() {
//        return auteur;
//    }
//
//    public int getAnnee() {
//        return annee;
//    }
//
//    public String toString() {
//        return titre + " - " + auteur + " (" + annee + ")";
//    }
//}
