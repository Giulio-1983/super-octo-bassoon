package Scuola;

import java.util.Scanner;

public class ScuolaMain {

	public static void main(String[] args) {
	
		ElencoPersone ep = new ElencoPersone();
		ep.caricaPersone();
		System.out.println("Buongiorno, Ho caricato il nostro database di libri \n \n");
		while (true) {
			System.out.println(
					"scegliere una delle opzioni: \na: Caricare persone da file \nb: Caricare singola persona manualmente (Stesso Id per Sostituire) \nc: Rimuovere persona tramite id \nd: Stampare lista persone \ne: Uscire");
			Scanner scanner = new Scanner(System.in);
			String N = scanner.nextLine();

			switch (N) {
			case "a":
				System.out.println("Scrivere nome del file da cui caricare:");
				try {
					String P = scanner.nextLine();
					ep.caricaPersone2(P);
					ep.salva();
					System.out.println("Persone nel file caricate \n \n \n");
				} catch (Exception e) {
					System.out.println("Nome file non trovato\n \n \n");
				}
				
break;
			case "b":
				System.out.println("Vuoi inserire: \na: Strudente \nb: Insegnante");
				String chi = scanner.nextLine();
				switch (chi) {
				case "a":
					System.out.println("Inserire ID:");
					String id = scanner.nextLine();
					System.out.println("Inserire Nome:");
					String nome = scanner.nextLine();
					System.out.println("Inserire Cognome:");
					String cognome = scanner.nextLine();
					System.out.println("Inserire Età:");
					String eta = scanner.nextLine();
					try {
						ep.aggiungiPersone(Integer.parseInt(id), nome, cognome, Integer.parseInt(eta));
						ep.salva();
						System.out.println("hai inserito il seguente Studente: \n \n");
						ep.stampaPersona(Integer.parseInt(id));
						break;
					} catch (Exception e) {
						System.out.println("Dati mancanti o sbagliati \n \n \n");
						break;
					}

				case "b":
					System.out.println("Inserire ID:");
					String idp = scanner.nextLine();
					System.out.println("Inserire Nome:");
					String nomep = scanner.nextLine();
					System.out.println("Inserire Cognome:");
					String cognomep = scanner.nextLine();
					System.out.println("Inserire Età:");
					String etap = scanner.nextLine();
					System.out.println("Inserire Ore di Lavoro:");
					String orep = scanner.nextLine();
					try {
						ep.aggiungiPersone(Integer.parseInt(idp), nomep, cognomep, Integer.parseInt(etap),
								Integer.parseInt(orep));
						ep.salva();
						System.out.println("hai inserito il seguente insegnante: \n \n");
						ep.stampaPersona(Integer.parseInt(idp));
						break;
					} catch (Exception e) {
						System.out.println("Dati mancanti o sbagliati\n \n \n");
					break;
					}
					
				}
			
				break;

			case "c":
				System.out.println("Inserire ID della persona da Eliminare:");
				String eli = scanner.nextLine();
				System.out.println("Stai per eliminare la seguente persona:");
				ep.stampaPersona(Integer.parseInt(eli));
				System.out.println("Ne sei sicuro? (y to continue)");
				String confirm = scanner.nextLine();
				if (confirm == "y") {
					try {
						ep.rimuoviPersone(Integer.parseInt(eli));
					break;
					} catch (Exception e) {
						System.out.println("ID non trovato");
						break;
					}
					
				} else {
					break;

				}
			case "d":
				ep.stampaPersone();
				while (true) {
					System.out.println("\n premi Enter per continuare continuare");
					String wait = scanner.nextLine();
					if (wait.isEmpty() == true) {
						break;
					}
					
				}
				break;
				
				
			case "e":
				System.out.println("\n \n Arrivederci");
				scanner.close();
				return;

//ep.caricaPersone();
////ep.aggiungiPersone(10, "Giulio", "Mazzitelli", 190);
////ep.aggiungiPersone(8, "Giulietto", "Mazzus", 195, 460);
//ep.rimuoviPersone(1);
//ep.stampaPersone();
//ep.salva();
			}
		}	

	}
}
