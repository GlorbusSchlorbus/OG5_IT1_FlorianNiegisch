package osz_kickers;

public class Trainer extends Personen {
	
	char lizenzklasse;
	int monatlicheaufwandentschaedigung;
	
	public Trainer(String name, int telefonnummer, boolean jahresbeitragbezahlt, char lizenzklasse, int monatlicheaufwandentschaedigung) {
		super(name, telefonnummer, jahresbeitragbezahlt);
		this.lizenzklasse = lizenzklasse;
		this.monatlicheaufwandentschaedigung = monatlicheaufwandentschaedigung;
	}
	
	public char getLizenzklasse() {
		return lizenzklasse;
	}
	public void setLizenzklasse(char lizenzklasse) {
		this.lizenzklasse = lizenzklasse;
	}
	public int getMonatlicheaufwandentschaedigung() {
		return monatlicheaufwandentschaedigung;
	}
	public void setMonatlicheaufwandentschaedigung(int monatlicheaufwandentschaedigung) {
		this.monatlicheaufwandentschaedigung = monatlicheaufwandentschaedigung;
	}

	
}
