package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
	private JComboBox lista;
	
	

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
		
		bo.setBounds(10,10,800,160);
		es.setBounds(10,180,200,200);
		ps.setBounds(220,180,300,300);
	}
	public void botones() {
		ag= new JButton("Agregar");
		el= new JButton("Eliminar");
		mo= new JButton("Modificar");
		add(ag);
		add(el);
		add(mo);
		ag.setBounds(10, 410, 150, 50);

		el.setBounds(10, 460, 150, 50);

		mo.setBounds(10, 500, 150, 50);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public JLabel getBo() {
		return bo;
	}
	public void setBo(JLabel bo) {
		this.bo = bo;
	}
	public JLabel getEs() {
		return es;
	}
	public void setEs(JLabel es) {
		this.es = es;
	}
	public JButton getEl() {
		return el;
	}
	public void setEl(JButton el) {
		this.el = el;
	}
	
}
