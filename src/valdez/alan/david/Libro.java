package valdez.alan.david;

public abstract class Libro {
	
	protected Integer codigo;
	protected String tituloLibro;
	protected String nombreAutor;
	protected Boolean disponibleParaPrestamo;
	
	public Libro(Integer codigo, String tituloLibro, String nombreAutor, Boolean disponibleParaPrestamo) {
		super();
		this.codigo = codigo;
		this.tituloLibro = tituloLibro;
		this.nombreAutor = nombreAutor;
		this.disponibleParaPrestamo = disponibleParaPrestamo;
	} 

}
