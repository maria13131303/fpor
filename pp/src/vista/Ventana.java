package vista;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controlador.Controlador;

public class Ventana extends JFrame {

	private JFrame v;
	private Controlador co ;
	private Panel pa;


	public Ventana (Controlador co) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		setSize(600,600);
		pa= new Panel(co);
		pa.setVisible(true);
		pa.setBounds(0,0, 800, 800);;
		add(pa);

	}




}
