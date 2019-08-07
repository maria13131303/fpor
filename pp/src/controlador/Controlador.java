package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

	public void agregarEstudiante(String nombre,int edad , String codigo,String programa, String telefono,String correo,String nivelAcademico,int materias) {
		
		boolean agregado = false;
		Estudiante e= buscarEstudiante(codigo);
		if(e == null)
		{
			e = new Estudiante(nombre, edad, codigo, programa, telefono, correo, nivelAcademico, materias, promedio);
			estu.add(e);
		}
		
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
	public void modificarEstudiante(String codigo, String ptelefono,String pcorreo,String pnivelAcademico,int pmaterias) {
		Estudiante e= buscarEstudiante(codigo);
		if(e != null) {
			e.setTelefono(ptelefono);
			e.setCorreo(pcorreo);
			e.setNivelAcademico(pnivelAcademico);
			e.setMaterias(pmaterias);
		}
		
	}
	public boolean elminarEstudiante(String codigo) {
		
		boolean eliminado = false;
		Estudiante e= buscarEstudiante(codigo);
		if(e != null)
		{
			estu.remove(e);
			
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
				elminarEstudiante(ep);
			}
			}
			
		} 
		else if(accion == "AceptarA") {
			if(JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION) == JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_OPTION))
			{
				agregarEstudiante(ag.getU().getText(), Integer.parseInt(ag.getD().getText()), ag.getT().getText(), ag.getC().getText(), ag.getCi().getText(), ag.getS().getText(), ag.getSi().getText(),Integer.parseInt(ag.getO().getText()));
			}
		}
	}



}
