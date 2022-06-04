import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Votar implements ActionListener {
	
	private JButton votarDaciolo, votarEymael;
	private JLabel contadorDaciolo, contadorEymael;
	

	public Votar(JButton votarDaciolo, JButton votarEymael, JLabel contadorDaciolo, JLabel contadorEymael) {
		super();
		this.votarDaciolo = votarDaciolo;
		this.votarEymael = votarEymael;
		this.contadorDaciolo = contadorDaciolo;
		this.contadorEymael = contadorEymael;
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == votarDaciolo) {
			int cont = Integer.parseInt(contadorDaciolo.getText());
			cont++;
			contadorDaciolo.setText(cont + "");
		} else if(arg0.getSource() == votarEymael) {
			int cont = Integer.parseInt(contadorEymael.getText());
			cont++;
			contadorEymael.setText(cont + "");
		}
	}
}