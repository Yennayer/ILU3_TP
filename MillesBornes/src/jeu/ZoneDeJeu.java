package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cartes.Bataille;
import cartes.Borne;
import cartes.Carte;
import cartes.Limite;

public class ZoneDeJeu{

	private List<Limite> pileDeLimite;
	private List<Bataille> pileDeBataille;
	private List<Borne> collectionDeBorne;
	private Set<Carte> ensembleDeBottes;
	
	public ZoneDeJeu() {
		this.pileDeLimite = new ArrayList<>();
		this.pileDeBataille = new ArrayList<>();
		this.collectionDeBorne = new ArrayList<>();
		this.ensembleDeBottes = new HashSet<>();
	}

}
