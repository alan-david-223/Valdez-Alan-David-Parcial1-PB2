package valdez.alan.david;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LibroTest {

	@Test
	public void queSePuedaCrearUnLibro() {
		Matematica libroMate = new Matematica (123456789, "Algoritmos", "Armando Barreda", Boolean.TRUE);
		Assert.assertNotNull(libroMate);
	}

}
