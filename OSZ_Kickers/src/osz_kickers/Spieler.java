package osz_kickers;

public class Spieler extends Personen {
	
	int trikotnummer;
	String spielposition;
	
	public Spieler(String name, int telefonnummer, boolean jahresbeitragbezahlt, int trikotnummer, String spielposition) {
		super(name, telefonnummer, jahresbeitragbezahlt);
		this.trikotnummer = trikotnummer;
		this.spielposition = spielposition;
	}
	
	public int getTrikotnummer() {
		return trikotnummer;
	}
	public void setTrikotnummer(int trikotnummer) {
		this.trikotnummer = trikotnummer;
	}
	public String getSpielposition() {
		return spielposition;
	}
	public void setSpielposition(String spielposition) {
		this.spielposition = spielposition;
	}
	
	
}
