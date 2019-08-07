package modelo;

public class Estudiante {
	
	private String nombre;
	private int edad;
	private String codigo;
	private String programa;
	private String telefono;
	private String correo;
	private String nivelAcademico;
	private int materias;
	private double notas;
	
	public Estudiante (String nombre, int edad, String codigo, String programa, String telefono, String correo, String nivelAcademico,int materias, double notas) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.codigo = codigo;
		this.programa = programa ;
		this.telefono = telefono;
		this.correo = correo;
		this.nivelAcademico = nivelAcademico;
		this.materias = materias;
		this.notas = notas;
		
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNivelAcademico() {
		return nivelAcademico;
	}

	public void setNivelAcademico(String nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}

	public int getMaterias() {
		return materias;
	}

	public void setMaterias(int materias) {
		this.materias = materias;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}
	

}
