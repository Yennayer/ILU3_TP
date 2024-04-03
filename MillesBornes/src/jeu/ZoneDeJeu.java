package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cartes.Carte;

public class ZoneDeJeu extends Carte{

	private List<Carte> pileDeLimite = new ArrayList<>();
	private List<Carte> pileFinDeLimite = new ArrayList<>();
	private List<Carte> pileDeBataille = new ArrayList<>();
	//private Collections<Carte> borne = new Collection<>() {};
	private Set<Carte> ensembleDeBottes= new HashSet<>();
	
	public ZoneDeJeu(int nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

}
