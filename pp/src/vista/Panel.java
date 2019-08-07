package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controlador.Controlador;

public class Panel extends JPanel implements ActionListener {

	private JPanel pa= new JPanel();
	private Ventana v;
	private Agregar agr;
	private JLabel bo,es,ps;
	private JButton ag,el,mo;
	
	

	public Panel (Controlador c) {
		this.agr = agr;
		this.v= v;
		paneles();
		botones();
		ag.addActionListener(c);
		ag.setActionCommand("Agregar");
		el.addActionListener(c);
		el.setActionCommand("Eliminar");
		mo.addActionListener(c);
		mo.setActionCommand("Modificar");
		}
	public void paneles (){
		setLayout(null);
		bo= new JLabel("Resumen General" );
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		bo.setBorder(border);
		add(bo);
		es= new JLabel("Estudiante");
		es.setBorder(border);
		add(es);
		ps= new JLabel("  Informacion ");
		ps.setBorder(border);
		add(ps);
		bo.setBounds(0,10,800,160);
		es.setBounds(0,180,200,200);
		ps.setBounds(220,180,300,300);
	}
	public void botones() {
		ag= new JButton("Agregar");
		el= new JButton("Eliminar");
		mo= new JButton("Modificar");
		add(ag);
		add(el);
		add(mo);
		ag.setBounds(0, 410, 150, 50);

		el.setBounds(0, 460, 150, 50);

		mo.setBounds(0, 500, 150, 50);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
