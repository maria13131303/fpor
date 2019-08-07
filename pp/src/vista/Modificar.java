package vista;

import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.Controlador;

public class Modificar  extends JFrame{
	private JFrame mo;
	private Controlador co;
	private TextField u,d,t,c,ci,s,si,o;
	private JLabel nombre,edad,codigo,programa,telefono,correo,promedio,materias;
	private JButton modificar;


	public Modificar (Controlador co) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
		setSize(300, 300);
		setTitle("Modificar");
		setLayout(new GridLayout(8,8));
		getAg();
		texto();
		modificar.setActionCommand("AceptarM");
		modificar.addActionListener(co);

	}
	public void texto() {
		nombre= new JLabel("nombre");
		add(nombre);
		setEnabled(true);
		u = new TextField("xx",20);
		add(u);
		edad= new JLabel("edad");
		add(edad);
		u.setEnabled(false);
		d = new TextField("xx",20);
		add(d);
		d.setEnabled(false);
		codigo= new JLabel("codigo");
		add(codigo);
		t= new TextField("xx",20);
		add(t);
		t.setEnabled(false);
		programa= new JLabel("programa");
		add(programa);
		c = new TextField("xx",20);
		add(c);
		c.setEnabled(false);
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

	}

	public Controlador getCo() {
		return co;
	}
	public void setCo(Controlador co) {
		this.co = co;
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
		return mo;
	}


	public void setAg(JFrame ag) {
		this.mo = ag;
	}
}


