package com.comptebancaire;

public class Journalisation {
	private final static Journalisation journal;
	private String log = "";
	static {
		journal = new Journalisation();
	}

	private Journalisation() {
		System.out.println("debut de journalistion");
	}

	public static Journalisation getInstance() {
		return journal;
	}

	public void ajouterLog(String log) {
		this.log += log + "\n";
	}

	public String getLog() {
		return this.log;
	}

}
