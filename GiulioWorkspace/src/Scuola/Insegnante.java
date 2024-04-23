package Scuola;

public class Insegnante extends Persona {
	int oreLavoro;

	public Insegnante(int id, String nome, String cognome, int età, int oreLavoro) {
		super(id, nome, cognome, età);
		this.oreLavoro = oreLavoro;
	}

	public int getOreLavoro() {
		return oreLavoro;
	}
	@Override
public void stampaAll() {
		System.out.println("Id: " +super.getId() + " --- Nome: " + super.getNome() + " --- Cognome: " + super.getCognome() + " --- età: "+ getEta()+ " --- Ore Di Lavoro: "+ oreLavoro);
	}

	@Override
	public String toString() {
		return super.toString() + ", " + oreLavoro;
	}
	
	
}
