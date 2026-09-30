package osz_kickers;

public class Personen {
	String name;
	int telefonnummer;
	boolean jahresbeitragbezahlt;

	public Personen(String name, int telefonnummer, boolean jahresbeitragbezahlt) {
		this.name = name;
		this.telefonnummer = telefonnummer;
		this.jahresbeitragbezahlt = jahresbeitragbezahlt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public boolean isJahresbeitragbezahlt() {
		return jahresbeitragbezahlt;
	}

	public void setJahresbeitragbezahlt(boolean jahresbeitragbezahlt) {
		this.jahresbeitragbezahlt = jahresbeitragbezahlt;
	}

}
