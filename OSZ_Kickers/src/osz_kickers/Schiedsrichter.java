
package osz_kickers;

public class Schiedrichter extends Personen {
	
	int gepfiffenespiel;

	public Schiedrichter(String name, int telefonnummer, boolean jahresbeitragbezahlt, int gepfiffenespiel) {
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
