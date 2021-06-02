package valdez.alan.david;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void queSePuedaCrearUnLibroDeMatematica() {
		
		Assert.assertNotNull(crearLibroMatematica(123456789, "Algoritmos", "Armando Barreda", Boolean.TRUE));
		
	}
	
	@Test
	public void queSePuedaCrearUnLibroDeGeografia() {
		
		Assert.assertNotNull(crearLibroGeografia(123456789, "Algoritmos", "Armando Barreda", Boolean.TRUE));
		
	}

	@Test
	public void queSePuedaCrearUnLibroDeHistoria() {
		
		Assert.assertNotNull(crearLibroHistoria(123456789, "Algoritmos", "Armando Barreda", Boolean.TRUE));
		
	}
	
	@Test
	public void queSePuedaCrearUnEstudiante() {
		Assert.assertNotNull(crearEstudiante(34929331, "Alvarez", "Juan"));
	}
	
	@Test
	public void queElEstudiantePuedaSolicitarPrestamoDeLibros() {
		Estudiante juanAlvarez = crearEstudiante(34929331, "Alvarez", "Juan");
		Libro libroMate1 = crearLibroMatematica(123456789, "Algoritmos", "Armando Barreda", Boolean.TRUE);
		Prestamo prestamo = retirarLibro(juanAlvarez, libroMate1);	
		Integer librosEsperados = 1;		
		Assert.assertEquals(librosEsperados, juanAlvarez.getCantLibrosRetirados());
		
	}
	
	@Test
	public void queElEstudiantePuedaDevolverLibros() {
		Estudiante juanAlvarez = crearEstudiante(34929331, "Alvarez", "Juan");		
		Libro libroMate1 = crearLibroMatematica(123456789, "Algoritmos", "Armando Barreda", Boolean.TRUE);
		Prestamo prestamo = retirarLibro(juanAlvarez, libroMate1);		
		prestamo.devolución(juanAlvarez, libroMate1);
		Integer librosEsperados = 0;
		Assert.assertEquals(librosEsperados, juanAlvarez.getCantLibrosRetirados());
		
	}
	
	private Prestamo retirarLibro(Estudiante estudiante, Libro libro) {
		Prestamo prestamo = new Prestamo (estudiante, libro);
		prestamo.retirar(estudiante, libro);
		return prestamo;		
	}

	private Matematica crearLibroMatematica(Integer codLibro, String titLibro, String nomAutor, Boolean disponiblePrestamo) {
		Matematica mate1 = new Matematica (codLibro, nomAutor, nomAutor, disponiblePrestamo);
		return mate1;
				
	}	
	
	private Geografía crearLibroGeografia(Integer codLibro, String titLibro, String nomAutor, Boolean disponiblePrestamo) {
		Geografía geo1 = new Geografía (codLibro, nomAutor, nomAutor, disponiblePrestamo);
		return geo1;
	}
	
	private Historia crearLibroHistoria(Integer codLibro, String titLibro, String nomAutor, Boolean disponiblePrestamo) {
		Historia histo1 = new Historia (codLibro, nomAutor, nomAutor, disponiblePrestamo);
		return histo1;
	}
	
	private Estudiante crearEstudiante(Integer dni, String apellido, String nombre) {
		Estudiante juanAlvarez = new Estudiante (dni, apellido, nombre);
		return juanAlvarez;
	}


	

}
