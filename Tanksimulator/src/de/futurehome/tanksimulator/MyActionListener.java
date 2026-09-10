package de.futurehome.tanksimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	public TankSimulator f;

	public MyActionListener(TankSimulator f) {
		this.f = f;
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == f.btnBeenden)
			System.exit(0);

		if (obj == f.btnEinfuellen) {
			double fuellstand = f.myTank.getFuellstand();
			fuellstand = fuellstand + 5;
			f.myTank.setFuellstand(fuellstand);
			double prozentstand = f.myTank.getProzentstand();
			prozentstand = fuellstand / 200 * 100;
			f.myTank.setProzentstand(prozentstand);

			f.lblFuellstand.setText("" + fuellstand);
			f.lblProzentstand.setText("" + prozentstand + "%");
		}
		if (obj == f.btnVerbrauchen) {
			double fuellstand = f.myTank.getFuellstand();
			fuellstand = fuellstand - 2;
			f.myTank.setFuellstand(fuellstand);
			double prozentstand = f.myTank.getProzentstand();
			prozentstand = fuellstand / 200 * 100;
			f.myTank.setProzentstand(prozentstand);

			f.lblFuellstand.setText("" + fuellstand);
			f.lblProzentstand.setText("" + prozentstand + "%");
		}
		if (obj == f.btnZuruecksetzen) {
			double fuellstand = f.myTank.getFuellstand();
			fuellstand = 0;
			f.myTank.setFuellstand(fuellstand);
			double prozentstand = f.myTank.getProzentstand();
			prozentstand = fuellstand / 200 * 100;
			f.myTank.setProzentstand(prozentstand);

			f.lblFuellstand.setText("" + fuellstand);
			f.lblProzentstand.setText("" + prozentstand + "%");
		}

	}
}