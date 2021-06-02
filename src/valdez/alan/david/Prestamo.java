package valdez.alan.david;

public class Prestamo {
	
	protected static Integer idPrestamo = 0;	
	
	public Prestamo(Estudiante estudiante, Libro libro) {
		Prestamo.idPrestamo++;
	}
	public void retirar (Estudiante estudiante, Libro libro) {
		if(estudiante.getCantLibrosRetirados() >= 0 
			&& estudiante.getCantLibrosRetirados() <= 2
			&& libro.disponibleParaPrestamo == Boolean.TRUE) {
			libro.disponibleParaPrestamo = Boolean.FALSE;
			estudiante.retiroLibro();
			
		}
		
	}
	public void devoluci�n(Estudiante estudiante, Libro libro) {
		if(estudiante.getCantLibrosRetirados() >= 1 
			&& estudiante.getCantLibrosRetirados() <= 2
			&& libro.disponibleParaPrestamo == Boolean.FALSE) {
			libro.disponibleParaPrestamo = Boolean.TRUE;
			estudiante.devolvioLibro();
		}
	}
	
	
	
	
	
	
	/*M�todo pr�stamo: hasta 2 libros simult�neos (condicional)

*cu�ndo se presta un libro, no estar� disponible hasta que sea devuelto (booleano)
*Registro de pr�stamo
*Registrar a que alumno se le presta el libro
*Cada pr�stamo tendra identificador �nico, alumno y libro involucrados
*La biblioteca tendr� la posiblidad de imprimir los libros que se pueden fotocopiar?*/
	
	

}
