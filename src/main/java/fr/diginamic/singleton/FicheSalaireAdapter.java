package fr.diginamic.singleton;

import fr.diginamic.singleton.externe.FicheSalaireIndividuelle;

public class FicheSalaireAdapter implements ISalaire{
    private FicheSalaireIndividuelle ficheSalaireIndividuelle;

    public FicheSalaireAdapter(FicheSalaireIndividuelle fiche){
        this.ficheSalaireIndividuelle = fiche;
    }


    @Override
    public String getNom() {
        return ficheSalaireIndividuelle.getNomSalarie();
    }

    @Override
    public String getPrenom() {
        return ficheSalaireIndividuelle.getPrenomSalarie();
    }

    @Override
    public double getSalaire() {
        return ficheSalaireIndividuelle.getSalaire();
    }
}
