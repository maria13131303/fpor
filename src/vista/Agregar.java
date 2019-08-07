package vista;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.Controlador;

public class Agregar extends JFrame implements  ActionListener {
	private JFrame ag;
	private TextField u,d,t,c,ci,s,si,o;
	private JLabel nombre,edad,codigo,programa,telefono,correo,promedio,materias;
	private JButton aceptar;


	public Agregar (Controlador co) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
		setSize(300, 300);
		setTitle("Agregar");
		setLayout(new GridLayout(9,2));
		getAg();
		texto();
		
		aceptar.setActionCommand("AceptarA");
		aceptar.addActionListener(co);

	}
	public void texto() {
		
		nombre= new JLabel("nombre");
		add(nombre);
		
		u = new TextField("xx",20);
		add(u);
		
		edad= new JLabel("edad");
		add(edad);
		
		d = new TextField("xx",20);
		add(d);
		
		codigo= new JLabel("codigo");
		add(codigo);
		
		t= new TextField("xx",20);
		add(t);
		
		programa= new JLabel("programa");
		add(programa);
		
		c = new TextField("xx",20);
		add(c);
		
		telefono= new JLabel("telefono");
		add(telefono);
		
		ci = new TextField("xx",20);
		add(ci);
		
		correo= new JLabel("correo");
		add(correo);
		
		s = new TextField("xx",20);
		add(s);
		
		promedio= new JLabel("promedio");
		add(promedio);
		
		si = new TextField("xx",20);
		add(si);
		
		materias= new JLabel("materias");
		add(materias);
		
		o = new TextField("xx",20);
		add(o);
		
		aceptar = new JButton("Aceptar");
		add(aceptar);

	}


	public TextField getU() {
		return u;
	}
	public void setU(TextField u) {
		this.u = u;
	}
	public TextField getD() {
		return d;
	}
	public void setD(TextField d) {
		this.d = d;
	}
	public TextField getT() {
		return t;
	}
	public void setT(TextField t) {
		this.t = t;
	}
	public TextField getC() {
		return c;
	}
	public void setC(TextField c) {
		this.c = c;
	}
	public TextField getCi() {
		return ci;
	}
	public void setCi(TextField ci) {
		this.ci = ci;
	}
	public TextField getS() {
		return s;
	}
	public void setS(TextField s) {
		this.s = s;
	}
	public TextField getSi() {
		return si;
	}
	public void setSi(TextField si) {
		this.si = si;
	}
	public TextField getO() {
		return o;
	}
	public void setO(TextField o) {
		this.o = o;
	}
	public JFrame getAg() {
		return ag;
	}


	public void setAg(JFrame ag) {
		this.ag = ag;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		}
		
		
	}

