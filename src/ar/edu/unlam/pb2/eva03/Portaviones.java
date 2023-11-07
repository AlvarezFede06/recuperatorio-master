package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Acuatico {

	private double profundidad = 0.0;
	
	public Portaviones(Integer codigo, String nombre) {
		super(codigo, nombre);
	}
	
	public Portaviones(String codigo, String nombre) {
		super(codigo, nombre);
	}

	@Override
	public double getProfundidad() {
		return this.profundidad;
	}
	
	@Override
	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}

}
