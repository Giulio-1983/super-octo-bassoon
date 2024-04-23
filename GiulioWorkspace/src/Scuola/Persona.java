package Scuola;

public class Persona {
private	int id;
private String nome;
private String cognome;
private int eta;

public Persona (int id, String nome, String cognome, int eta) {
	this.id=id;
	this.nome=nome;
	this.cognome=cognome;
	this.eta=eta;
}
public int getid() {
	return getId();
}
public String getNome() {
	return nome;
}
public String getCognome() {
	return cognome;
}
public int getEta() {
	return eta;
}
public int getId() {
	return id;
}

@Override
public String toString() {
	return id+ ", " + nome + ", " + cognome + ", " + eta;
}
public void stampaAll() {
	System.out.println( "Id: " +getId() + " --- Nome: " + nome + " --- Cognome: " + cognome + " --- età: "+ eta);
	}

}
