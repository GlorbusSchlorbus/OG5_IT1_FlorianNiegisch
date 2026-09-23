package omnom;

public class Haustier {

	int hunger = 100;
	int muede = 100;
	int zufrieden = 100;
	int gesund = 100;
	String name;

	public Haustier() {

	}

	public Haustier(String name) {

	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		if (hunger <= 100 && hunger >= 0) {
			this.hunger = hunger;
		}
	}

	public int getMuede() {
		return muede;
	}

	public void setMuede(int muede) {
		if (muede <= 100 && muede >= 0) {
			this.muede = muede;
		}
	}

	public int getZufrieden() {
		return zufrieden;
	}

	public void setZufrieden(int zufrieden) {
		if (zufrieden <= 100 && zufrieden >= 0) {
			this.zufrieden = zufrieden;
		}
	}

	public int getGesund() {
		return gesund;
	}

	public void setGesund(int gesund) {
		if (gesund <= 100 && gesund >= 0) {
			this.gesund = gesund;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fuettern(int sacrifice) {
		setHunger(hunger + sacrifice);
	}

	public void schlafen(int sacrifice) {
		setMuede(muede + sacrifice);
	}

	public void spielen(int sacrifice) {
		setZufrieden(zufrieden + sacrifice);
	}

	public void heilen() {
		setGesund(100);
	}

}
