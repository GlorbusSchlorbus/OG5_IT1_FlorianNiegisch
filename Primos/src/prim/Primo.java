package prim;

public class Primo {

	public String isPrim(long zahl) {
		String Antwort = "Keine Primzahl";
		if (zahl > 1) {
			for (int i = 2; i < Math.sqrt(zahl); i++) {
				long restwert = zahl - (i * (zahl / i));
				if (restwert == 0) {
					Antwort = "Primzahl";
				}
			}
		}
		return Antwort;
	}
}
