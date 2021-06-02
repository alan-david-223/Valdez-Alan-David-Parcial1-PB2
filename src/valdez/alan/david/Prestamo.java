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
	public void devolución(Estudiante estudiante, Libro libro) {
		if(estudiante.getCantLibrosRetirados() >= 1 
			&& estudiante.getCantLibrosRetirados() <= 2
			&& libro.disponibleParaPrestamo == Boolean.FALSE) {
			libro.disponibleParaPrestamo = Boolean.TRUE;
			estudiante.devolvioLibro();
		}
	}
	
	
	
	
	
	
	/*Método préstamo: hasta 2 libros simultáneos (condicional)

*cuándo se presta un libro, no estará disponible hasta que sea devuelto (booleano)
*Registro de préstamo
*Registrar a que alumno se le presta el libro
*Cada préstamo tendra identificador único, alumno y libro involucrados
*La biblioteca tendrá la posiblidad de imprimir los libros que se pueden fotocopiar?*/
	
	

}
