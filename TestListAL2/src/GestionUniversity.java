import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GestionUniversity implements University {
    private List<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }


    @Override
    public boolean rechercherEtudiant(String nom) {
        return etudiants.stream().anyMatch(etudiant -> etudiant.getNom().equals(nom));
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        etudiants.forEach(System.out::println);









    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants, Comparator.comparingInt(Etudiant::getId));
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants, Comparator.comparing(Etudiant::getNom));
    }
}