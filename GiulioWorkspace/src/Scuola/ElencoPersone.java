package Scuola;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ElencoPersone {
String nomeFile2;
	String nomeFile = "ElencoPersone.txt";
	HashMap<Integer, Persona> ElencoPersone = new HashMap<>();

	public void aggiungiPersoneMappa(Integer K, Persona Persona) {
		ElencoPersone.put(K, Persona);
	}

	public void aggiungiPersone(int a, String b, String c, int d) {
		aggiungiPersoneMappa(a, new Persona(a, b, c, d));
	}

	public void aggiungiPersone(int a, String b, String c, int d, int e) {
		aggiungiPersoneMappa(a, new Insegnante(a, b, c, d, e));
	}

	public void rimuoviPersone(int n) {
		ElencoPersone.remove(n);
	}
	
	public void stampaPersona(int n) {
		for (Map.Entry<Integer, Persona> entry : ElencoPersone.entrySet()) {
			if (entry.getKey() == n) {
			entry.getValue().stampaAll();
		}}
		
		
	}

	public void salva() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFile));
			for (Map.Entry<Integer, Persona> entry : ElencoPersone.entrySet()) {
				bw.write(entry.getValue().toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void caricaPersone() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(nomeFile));
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] entry = linea.split(",");
				if (entry.length == 4) {
					aggiungiPersoneMappa(Integer.parseInt(entry[0].trim()), new Persona(Integer.parseInt(entry[0]),
							entry[1].trim(), entry[2].trim(), Integer.parseInt(entry[3].trim())));
				} else if (entry.length == 5) {
					aggiungiPersoneMappa(Integer.parseInt(entry[0].trim()),
							new Insegnante(Integer.parseInt(entry[0].trim()), entry[1].trim(), entry[2].trim(),
									Integer.parseInt(entry[3].trim()), Integer.parseInt(entry[4].trim())));
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void caricaPersone2(String nomeFile2) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(nomeFile2));
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] entry = linea.split(",");
				if (entry.length == 4) {
					aggiungiPersoneMappa(Integer.parseInt(entry[0].trim()), new Persona(Integer.parseInt(entry[0]),
							entry[1].trim(), entry[2].trim(), Integer.parseInt(entry[3].trim())));
				} else if (entry.length == 5) {
					aggiungiPersoneMappa(Integer.parseInt(entry[0].trim()),
							new Insegnante(Integer.parseInt(entry[0].trim()), entry[1].trim(), entry[2].trim(),
									Integer.parseInt(entry[3].trim()), Integer.parseInt(entry[4].trim())));
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stampaPersone() {
		for (Map.Entry<Integer, Persona> entry : ElencoPersone.entrySet()) {
			entry.getValue().stampaAll();
		}

	}
}
