package valdez.alan.david;

public class Estudiante {

	private Integer dni;
	private String apellido;
	private String nombre;
	private Integer CantLibrosRetirados;

	public Estudiante(Integer dni, String apellido, String nombre) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.CantLibrosRetirados = 0;
	}

	public Integer getCantLibrosRetirados() {
		return this.CantLibrosRetirados;
		
	}

	public void setCantLibrosRetirados(Integer cantLibrosRetirados) {
		CantLibrosRetirados = cantLibrosRetirados;
	}
	
	public void retiroLibro() {
		if(this.CantLibrosRetirados >= 0 && this.CantLibrosRetirados <= 2)
		this.CantLibrosRetirados++;
	}
	
	public void devolvioLibro() {
		if(this.CantLibrosRetirados >= 0 && this.CantLibrosRetirados <= 2)
		this.CantLibrosRetirados--;
	}

			
}
