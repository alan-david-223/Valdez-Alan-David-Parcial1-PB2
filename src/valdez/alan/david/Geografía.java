package valdez.alan.david;

public class Geografía extends Libro {
	private String textoRepresentativo; 

	public Geografía(Integer codigo, String tituloLibro, String nombreAutor,
			Boolean disponibleParaPrestamo) {
		super(codigo, tituloLibro, nombreAutor, disponibleParaPrestamo);
		
		this.textoRepresentativo  = codigo + tituloLibro + nombreAutor;
	}
	
	@Override
	public String toString() {
		return this.textoRepresentativo;
	}

}
