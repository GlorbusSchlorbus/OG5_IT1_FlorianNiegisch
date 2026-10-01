
package osz_kickers;

public class Schiedsrichter extends Personen {
	
	int gepfiffenespiel;

	public Schiedsrichter(String name, int telefonnummer, boolean jahresbeitragbezahlt, int gepfiffenespiel) {
		super(name, telefonnummer, jahresbeitragbezahlt);
		this.gepfiffenespiel = gepfiffenespiel;
	}

	public int getGepfiffenespiel() {
		return gepfiffenespiel;
	}

	public void setGepfiffenespiel(int gepfiffenespiel) {
		this.gepfiffenespiel = gepfiffenespiel;
	}
	
}
