package osz_kickers;

public class Mannschaftsleiter extends Spieler {

	String mannschaftsname;
	int rabbatt;
	
	public Mannschaftsleiter(String name, int telefonnummer, boolean jahresbeitragbezahlt, int trikotnummer, String spielposition, String mannschaftsname, int rabbatt) {
		super(name, telefonnummer, jahresbeitragbezahlt, trikotnummer, spielposition);
		this.mannschaftsname = mannschaftsname;
		this.rabbatt = rabbatt;
	}
	
	public String getMannschaftsname() {
		return mannschaftsname;
	}
	public void setMannschaftsname(String mannschaftsname) {
		this.mannschaftsname = mannschaftsname;
	}
	public int getRabbatt() {
		return rabbatt;
	}
	public void setRabbatt(int rabbatt) {
		this.rabbatt = rabbatt;
	}
	
}
