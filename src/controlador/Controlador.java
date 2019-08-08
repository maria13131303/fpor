package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import vista.Agregar;
import vista.Modificar;
import vista.Ventana;

public  class Controlador implements ActionListener {
	private Estudiante est;
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
		try {
			 est=new Estudiante(nombre, edad, codigo, programa, telefono, correo, nivelAcademico, materias, promedio);
			estu.add(est);
		} 
		catch(	NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.DEFAULT_OPTION);		
		}
		catch(NullPointerException ex) {
			System.out.print("Caught the NullPointerException");
		}
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

			String uno = ag.getU().getText();
			int dos =Integer.parseInt(ag.getD().getText());
			String tres = ag.getT().getText(); 
			String cuatro = ag.getC().getText();
			String cinco = ag.getCi().getText();
			String seis = ag.getS().getText();
			String siete = ag.getSi().getText();
			int ocho =Integer.parseInt(ag.getO().getText());

			System.out.println("a");
			agregarEstudiante(uno,dos,tres,cuatro,cinco,seis,siete,ocho);
			System.out.println("b");
			ag.setVisible(false);


		}
		else if(accion == "AceptarM") {
			String tresm= ag.getT().getText(); 
			String cuatrom = ag.getC().getText();
			String cincom = ag.getCi().getText();
			String seism = ag.getS().getText();
			String sietem = ag.getSi().getText();
			int ochom =Integer.parseInt(ag.getO().getText());

			System.out.println("a");
			modificarEstudiante(tresm,cuatrom,cincom,seism,ochom);
			System.out.println("b");
			mo.setVisible(false);
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

