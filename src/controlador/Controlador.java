package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Directorio;
import modelo.Estudiante;
import vista.Agregar;
import vista.Modificar;
import vista.Ventana;

public  class Controlador implements ActionListener {
	private Estudiante est;
	private Directorio dir;
	private double promedio;
	private Ventana v;
	private Agregar ag;
	private Modificar mo;
	ArrayList<Estudiante> estu;

	public Controlador() {
		v = new Ventana(this);
		ag = new Agregar(this);
		mo = new Modificar (this);
		ArrayList<Estudiante> estu = new ArrayList<Estudiante>();

	}
	public  Estudiante agregarEstudiante(String nombre,int edad , String codigo,String programa,
			String telefono,String correo,String nivelAcademico,int materias) throws NumberFormatException , NullPointerException{

		Estudiante est=new Estudiante(nombre, edad, codigo, programa, telefono, correo, nivelAcademico, materias, promedio);
		estu.add(est);	
		
		v.getPa().getEs().setText(nombre);
		return est;
	}

	public Estudiante buscarEstudiante(String codigo) {

		Estudiante estudiante= null;

		for(int i=0; i< estu.size(); i++) {
			if(codigo == estudiante.getCodigo()) {
				estudiante = estu.get(i);

			}

		}
		return est;
	}
	public void modificarEstudiante(String codigo, String ptelefono,String pcorreo,String pnivelAcademico,int pmaterias) throws NullPointerException {
		Estudiante e= buscarEstudiante(codigo);
		if(e != null) {
			e.setTelefono(ptelefono);
			e.setCorreo(pcorreo);
			e.setNivelAcademico(pnivelAcademico);
			e.setMaterias(pmaterias);
		}

	}
	public boolean elminarEstudiante(String codigo) throws NullPointerException {

		boolean eliminado = false;
		Estudiante e= buscarEstudiante(codigo);
		if(e != null)
		{
			estu.remove(e);

		}
		else {
			if(e== null)
			{
				return false; 
			}
		}


		return eliminado;



	}
	public double promedio () {



		return promedio;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String accion = e.getActionCommand();
		if(accion == "Agregar")
		{
			ag.setVisible(true);
		}
		else if(accion == "Modificar")
		{
			mo.setVisible(true);
		}
		else if(accion == "Eliminar")
		{
			String ep =(JOptionPane.showInputDialog(" Digite el codigo: "));
			if(ep == est.getCodigo()) {
				if(JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION) == JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_OPTION))
				{
					try {
						elminarEstudiante(null);
					} 
					catch(NullPointerException ex12) {
						System.out.print("se atrapo la excepcion de eliminar");
					}

				}
			}



		} 
		else if(accion == "AceptarA") {

			System.out.println("a");
			agregarEstudiante(ag.getU().getText(), Integer.parseInt(ag.getD().getText()),ag.getT().getText(), ag.getC().getText(), ag.getCi().getText(), ag.getS().getText(),ag.getSi().getText(),Integer.parseInt(ag.getO().getText()));
			System.out.println("b");
			ag.setVisible(false);


		}
		else if(accion == "AceptarM") {

			System.out.println("a");
			modificarEstudiante(mo.getT().getText(), mo.getC().getText(), mo.getCi().getText(), mo.getS().getText(),Integer.parseInt(mo.getO().getText()));
			System.out.println("b");
			mo.setVisible(false);
		}
			
			
	}

	public void agregarEstudiante2(String nombre,int edad , String codigo,String programa,
			String telefono,String correo,String nivelAcademico,int materias) {
		try {
			agregarEstudiante(null, 0, null, null, null, null, null, 0);

		} 
		catch(	NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.DEFAULT_OPTION);		
		}
		catch(NullPointerException ex) {
			System.out.print("Caught the NullPointerException");
		}

	}

	public void modificarEstudiante2( String ptelefono,String pcorreo,String pnivelAcademico,int pmaterias) {
		try {
			modificarEstudiante( ptelefono, pcorreo, pnivelAcademico, pnivelAcademico, pmaterias);

		} 
		catch(	NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.DEFAULT_OPTION);		
		}
		catch(NullPointerException ex13) {
			System.out.print("Caught the NullPointerException");
		}

	}
	public void eliminarEstudiante2(String codigo) {

		try { 
			elminarEstudiante(codigo);
			
		}
		catch(NullPointerException ex) {
			System.out.print("Caught the NullPointerException");
		}

	}

}

	