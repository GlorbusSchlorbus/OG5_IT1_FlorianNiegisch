package wellenmeerbeispiel;

import java.util.ArrayList;

public class Meer {
	
	private Welle[] welle;

	Meer() {
		welle = new Welle[10];
		for(int i=0; i<welle.length; i++) {
			welle[i] = new Welle();
		}
	}

}

