package com.comptebancaire;

public class CompteBancaire {
	private int numero;
	private double solde = 0;
	public static int compteur = 0;

	public CompteBancaire() {
		compteur++;
	}

	public void deposerArgent(double depot) {
		this.solde += depot;
	}

	public void retirerArgent(double retrait) {
		this.solde -= retrait;
	}
}
