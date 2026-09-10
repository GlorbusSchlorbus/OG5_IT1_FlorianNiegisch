package de.futurehome.tanksimulator;

public class Tank {

	private double fuellstand;
	private double prozentstand;

	public Tank(double fuellstand, double prozentstand) {
		this.fuellstand = fuellstand;
		this.prozentstand = prozentstand;
	}

	public double getFuellstand() {
		return fuellstand;
	}

	public void setFuellstand(double fuellstand) {
		this.fuellstand = fuellstand;
	}

	public double getProzentstand() {
		return prozentstand;
	}

	public void setProzentstand(double prozentstand) {
		this.prozentstand = prozentstand;
	}

}
