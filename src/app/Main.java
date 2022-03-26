package app;

import com.comptebancaire.CompteBancaire;
import com.comptebancaire.Journalisation;

public class Main {

	public static void main(String[] args) {
		Journalisation journal = Journalisation.getInstance();
		CompteBancaire compte1 = new CompteBancaire();
		journal.ajouterLog("creation d'un compte numero 1");
		compte1.deposerArgent(5000);
		journal.ajouterLog("depot d'un montant de 5000 dans le compte 1");
		compte1.retirerArgent(1200);
		journal.ajouterLog("retrait d'un montant de 1200 dans le compte 1");
		CompteBancaire compte2 = new CompteBancaire();
		journal.ajouterLog("creation d'un compte numero 2");
		compte2.deposerArgent(3700);
		journal.ajouterLog("depot d'un montant de 3700 dans le compte 2");
		compte2.retirerArgent(850);
		journal.ajouterLog("retrait d'un montant de 850 dans le compte 2");
		System.out.println(journal.getLog());
	}

}
