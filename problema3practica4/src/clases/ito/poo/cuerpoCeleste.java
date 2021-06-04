package clases.ito.poo;


import clases.ito.poo.ubicacion;
public class cuerpoCeleste {
	
	private String nombre = "";
	private ubicacion ubicaciones = null;
	private String composicion = "";

	public cuerpoCeleste(String nombre, ubicacion ubicaciones, String composicion) {
		super();
		this.nombre = nombre;
		this.ubicaciones = ubicaciones;
		this.composicion = composicion;
	}


	public float desplazamiento(int i, int j) {
		float desplazamiento = 0F;
		desplazamiento=(float)(Math.sqrt((float)((Math.pow((i-this.ubicaciones.getLongitud()), 2))
				+(Math.pow((j-this.ubicaciones.getLatitud()), 2)))));
		if(desplazamiento==0)
			System.out.println("Sin desplazamiento");
		else 
			System.out.println("Su desplazamiento es "+desplazamiento);
		this.ubicaciones.setLongitud(i);
		this.ubicaciones.setLatitud(j);
		return desplazamiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	public ubicacion getubicaciones() {
		return this.ubicaciones;
	}

	public void setubicaciones(ubicacion newubicaciones) {
		this.ubicaciones = newubicaciones;
	}

	public String getComposicion() {
		return this.composicion;
	}

	public void setComposicion(String newComposicion) {
		this.composicion = newComposicion;
	}

	@Override
	public String toString() {
		return "cuerpoCeleste [nombre=" + nombre + ", ubicaciones=" + ubicaciones + ", composicion=" + composicion
				+ "]";
	}

}
